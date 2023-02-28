package com.example.testvolley.services.rickAndMorty.dtos;

import android.content.Context;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Objects;

public class Page {

    private Informacion info;
    private Resultado results;
    private JSONObject informacion;

    public Page(@NotNull JSONObject jsonObject, Context context) throws JSONException {
        informacion = jsonObject.getJSONObject("info");
        //Toast.makeText(context, informacion.toString(), Toast.LENGTH_SHORT).show();
        this.info = new Informacion(Objects.requireNonNull(jsonObject.getJSONObject("info")));
        //this.results = new Resultado(Objects.requireNonNull(jsonObject.optJSONObject("results")));
    }


    public Informacion getInfo() {
        return info;
    }

    public void setInfo(Informacion info) {
        this.info = info;
    }

    public Resultado getResults() {
        return results;
    }

    public void setResults(Resultado results) {
        this.results = results;
    }



}
