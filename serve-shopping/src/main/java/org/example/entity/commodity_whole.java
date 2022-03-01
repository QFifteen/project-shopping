package org.example.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class commodity_whole {
    private int Commodity_id;
    private String Commodity_name;
    private String Commodity_text;
    private int Commodity_imgid;
    private BigDecimal Commodity_cost;
    private BigDecimal Commodity_price;
    private int Commodity_sell;
    private String Commodity_state;
    private Timestamp Commodity_time;
    private String Classification_name;
    private String Classification_subdivision;
    private String Classification_category;

    private String Commodity_img;

    public int getCommodity_id() {
        return Commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        Commodity_id = commodity_id;
    }

    public String getCommodity_name() {
        return Commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        Commodity_name = commodity_name;
    }

    public String getCommodity_text() {
        return Commodity_text;
    }

    public void setCommodity_text(String commodity_text) {
        Commodity_text = commodity_text;
    }

    public int getCommodity_imgid() {
        return Commodity_imgid;
    }

    public void setCommodity_imgid(int commodity_imgid) {
        Commodity_imgid = commodity_imgid;
    }

    public BigDecimal getCommodity_cost() {
        return Commodity_cost;
    }

    public void setCommodity_cost(BigDecimal commodity_cost) {
        Commodity_cost = commodity_cost;
    }

    public BigDecimal getCommodity_price() {
        return Commodity_price;
    }

    public void setCommodity_price(BigDecimal commodity_price) {
        Commodity_price = commodity_price;
    }

    public int getCommodity_sell() {
        return Commodity_sell;
    }

    public void setCommodity_sell(int commodity_sell) {
        Commodity_sell = commodity_sell;
    }

    public String getCommodity_state() {
        return Commodity_state;
    }

    public void setCommodity_state(String commodity_state) {
        Commodity_state = commodity_state;
    }

    public Timestamp getCommodity_time() {
        return Commodity_time;
    }

    public void setCommodity_time(Timestamp commodity_time) {
        Commodity_time = commodity_time;
    }

    public String getClassification_name() {
        return Classification_name;
    }

    public void setClassification_name(String classification_name) {
        Classification_name = classification_name;
    }

    public String getClassification_subdivision() {
        return Classification_subdivision;
    }

    public void setClassification_subdivision(String classification_subdivision) {
        Classification_subdivision = classification_subdivision;
    }

    public String getClassification_category() {
        return Classification_category;
    }

    public void setClassification_category(String classification_category) {
        Classification_category = classification_category;
    }

    public String getCommodity_img() {
        return Commodity_img;
    }

    public void setCommodity_img(String commodity_img) {
        Commodity_img = commodity_img;
    }
}
