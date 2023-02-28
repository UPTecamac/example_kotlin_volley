package com.example.testvolley.services.rickAndMorty.dtos;

import org.json.JSONObject;

public class Informacion {
    private int count;
    private int pages;
    private String next;
    private String prev;

    public Informacion(JSONObject info) {
        this.count = info.optInt("count");
        this.pages = info.optInt("pages");
        this.next = info.optString("next");
        this.prev = info.optString("prev");
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public String getPrev() {
        return prev;
    }

    public void setPrev(String prev) {
        this.prev = prev;
    }


}
