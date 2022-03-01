package org.example.entity;

import java.sql.Timestamp;

public class commodityimgurl {
     private int commodityimgurl_id;
     private String Commodity_img;
     private int Commodity_id;
     private Timestamp commodityimgurl_time;

    public int getCommodityimgurl_id() {
        return commodityimgurl_id;
    }

    public void setCommodityimgurl_id(int commodityimgurl_id) {
        this.commodityimgurl_id = commodityimgurl_id;
    }

    public String getCommodity_img() {
        return Commodity_img;
    }

    public void setCommodity_img(String commodity_img) {
        Commodity_img = commodity_img;
    }

    public int getCommodity_id() {
        return Commodity_id;
    }

    public void setCommodity_id(int commodity_id) {
        Commodity_id = commodity_id;
    }

    public Timestamp getCommodityimgurl_time() {
        return commodityimgurl_time;
    }

    public void setCommodityimgurl_time(Timestamp commodityimgurl_time) {
        this.commodityimgurl_time = commodityimgurl_time;
    }

}
