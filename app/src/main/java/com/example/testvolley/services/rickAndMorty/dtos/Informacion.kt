class Informacion constructor(data : org.json.JSONObject){

    lateinit var count : String
    lateinit var pages : String
    lateinit var next : String
    lateinit var prev : String

    init {
        count = data.getString("count")
        pages = data.getString("pages")
        next = data.getString("next")
        prev = data.getString("prev")
    }


}