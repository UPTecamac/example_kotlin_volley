package com.example.testvolley.services.rickAndMorty.dtos;

import org.json.JSONObject;

public class Origen {
    private String name;
    private String url;

    public Origen(JSONObject origin) {
        this.name = origin.optString("name");
        this.url = origin.optString("url");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
