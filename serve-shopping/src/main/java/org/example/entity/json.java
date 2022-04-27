package org.example.entity;

import com.alibaba.fastjson.JSONObject;

public class json {
    public int id;
    public JSONObject text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public JSONObject getText() {
        return text;
    }

    public void setText(JSONObject text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "json{" +
                "id=" + id +
                ", text=" + text +
                '}';
    }
}
