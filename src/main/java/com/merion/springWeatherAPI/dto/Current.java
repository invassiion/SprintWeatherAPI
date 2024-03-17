package com.merion.springWeatherAPI.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    @SerializedName("last_updated_epoch")
    public Long lastUpdatedEpoch;
    @SerializedName("last_updated")
    public String lastUpdated;
    @SerializedName("temp_c")
    public Double tempC;
    @SerializedName("temp_f")
    public Double tempF;
    @SerializedName("is_day")
    public Double isDay;
    @SerializedName("condition")
    public Condition condition;
    @SerializedName("wind_mph")
    public Double windMph;
    @SerializedName("wind_kph")
    public Double windKph;
    @SerializedName("wind_degree")
    public Double windDegree;
    @SerializedName("wind_dir")
    public String windDir;
    @SerializedName("pressure_mb")
    public Double pressureMb;
    @SerializedName("pressure_in")
    public Double pressureIn;
    @SerializedName("precip_mm")
    public Double precipMm;
    @SerializedName("precip_in")
    public Double precipIn;
    public Double humidity;
    public Double cloud;
    @SerializedName("feelslike_c")
    public Double feelslikeC;
    @SerializedName("feelslike_f")
    public Double feelslikeF;
    @SerializedName("vis_km")
    public Double visKm;
    @SerializedName("vis_miles")
    public Double visMiles;
    public Double uv;
    @SerializedName("gust_mph")
    public Double gustMph;
    @SerializedName("gust_kph")
    public Double gustKph;
    @SerializedName("air_quality")
    public AirQuality airQuality;
}

