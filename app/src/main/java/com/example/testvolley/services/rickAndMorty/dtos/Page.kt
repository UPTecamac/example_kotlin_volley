package com.example.testvolley.services.rickAndMorty.dtos

import Informacion
import android.widget.Toast

class Page constructor(data : org.json.JSONObject) {

    lateinit var info : Informacion
    lateinit var results : org.json.JSONArray
    val personajes : MutableList<Personaje> = mutableListOf()

    init {
        info = Informacion(data.getJSONObject("info"))
        results = data.getJSONArray("results")
        init()
    }

    private fun init(){
        val nResult = results.length()
        for (i in 0 until results.length()){
            this.personajes.add(Personaje(results.getJSONObject(i)))
        }
    }




}