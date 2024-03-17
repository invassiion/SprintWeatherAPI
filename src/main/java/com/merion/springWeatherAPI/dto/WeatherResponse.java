package com.merion.springWeatherAPI.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class WeatherResponse {
    private Location location;
    private Current current;
}
