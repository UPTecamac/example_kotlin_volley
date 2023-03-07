package com.example.testvolley.services.rickAndMorty.dtos

class Personaje constructor(data : org.json.JSONObject){
    lateinit var id : String
    lateinit var name : String
    lateinit var status : String
    lateinit var species : String
    lateinit var type : String
    lateinit var gender : String
    lateinit var origin : Origin
    lateinit var image : String
    lateinit var episode : List<String>
    lateinit var url : String
    lateinit var created : String
    val data : org.json.JSONObject = data
    init {
        init()
    }

    private fun init(){
        this.id = data.getString("id")
        this.name = data.getString("name")
        this.status = data.getString("status")
        this.species = data.getString("species")
        this.type = data.getString("type")
        this.gender = data.getString("gender")
        this.origin = Origin(data.getJSONObject("origin"))
        this.image = data.getString("image")
        this.episode = data.getString("episode").split(",")
        this.url = data.getString("url")
        this.created = data.getString("created")
    }

}

