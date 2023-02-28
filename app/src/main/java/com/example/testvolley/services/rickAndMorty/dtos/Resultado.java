package com.example.testvolley.services.rickAndMorty.dtos;

import org.json.JSONObject;

import java.util.Objects;

public class Resultado {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;
    private Origen origin;

    public Resultado(JSONObject results) {
        this.id = results.optInt("id");
        this.name = results.optString("name");
        this.status = results.optString("status");
        this.species = results.optString("species");
        this.type = results.optString("type");
        this.gender = results.optString("type");
        this.origin = new Origen(Objects.requireNonNull(results.optJSONObject("origin")));
    }
}
