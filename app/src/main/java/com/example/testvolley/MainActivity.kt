package com.example.testvolley

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.testvolley.services.rickAndMorty.dtos.Page
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOk = findViewById<Button>(R.id.buttonOk)
        // -- llena rrecicler view
        val recyclerViewPersonajes = findViewById<RecyclerView>(R.id.recyclerViewPersonajes)

        btnOk.setOnClickListener {
            // Instantiate the RequestQueue.
            val queue = Volley.newRequestQueue(this)
            val url = "https://rickandmortyapi.com/api/character/?page=19"

            // Request a string response from the provided URL.
            val stringRequest = StringRequest(Request.Method.GET, url,
                { response ->
                    val page = Page(JSONObject(response))
                    // -- llena rrecicler view
                    LinearLayoutManager(this).apply {
                        recyclerViewPersonajes.layoutManager = this
                        recyclerViewPersonajes.adapter = MyPersonajeRecyclerViewAdapter(page.personajes)
                    }
                },
                {
                    Toast.makeText(this, "That didn't work!", Toast.LENGTH_LONG).show()
                })

            // Add the request to the RequestQueue.
            queue.add(stringRequest)
        }
    }
}