package com.example.theweather.gson;

import com.google.gson.annotations.SerializedName;

import javax.sql.StatementEvent;

/**
 * Created by lenovo on 2018/5/19.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
