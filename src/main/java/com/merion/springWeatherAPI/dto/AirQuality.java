package com.merion.springWeatherAPI.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AirQuality {
    public Double co;
    public Double no2;
    public Double o3;
    public Double so2;
    public Double pm2_5;
    public Double pm10;
    @SerializedName("us-epa-index")
    public Double usEpaIndex;
    @SerializedName("gb-defra-index")
    public Double gbDefraIndex;
}
