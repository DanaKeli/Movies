package com.example.movies.data;

public class Trailer {
    private String key;
    private String name;

    public Trailer(String key, String mane) {
        this.key = key;
        this.name = mane;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setName(String name) {
        this.name = name;
    }
}