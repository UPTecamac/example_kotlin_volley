package com.example.testvolley.services.rickAndMorty.dtos

class Location constructor(data : org.json.JSONObject) {
    var data : org.json.JSONObject = data
    lateinit var name : String
    lateinit var url : String

    init {
        init()
    }

    fun init(){
        name = data.getString("name")
        url = data.getString("url")
    }
}