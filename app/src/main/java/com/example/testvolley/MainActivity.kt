package com.example.testvolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.testvolley.services.rickAndMorty.dtos.Personaje
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<Button>(R.id.buttonOk)

        btnOk.setOnClickListener {
            // Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(this)
            val url = "https://rickandmortyapi.com/api/character/?page=19"

            // Request a string response from the provided URL.
            val stringRequest = StringRequest(Request.Method.GET, url,
                { response ->
                    val personale = Personaje (JSONObject(response),this)
                    Toast.makeText(this, personale.info.count.toString(), Toast.LENGTH_LONG).show()
                },
                {
                    Toast.makeText(this, "That didn't work!", Toast.LENGTH_LONG).show()
                })

            // Add the request to the RequestQueue.
            queue.add(stringRequest)
        }
    }
}