package com.merion.springWeatherAPI.dto;


import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
    public class Location {
        public String name;
        public String region;
        public String country;
        public Double lat;
        public Double lon;
        @SerializedName("tz_id")
        public String tzId;
        @SerializedName("localtime_epoch")
        public Long localtimeEpoch;
        public String localtime;
    }





