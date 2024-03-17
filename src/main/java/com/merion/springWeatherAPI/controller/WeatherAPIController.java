package com.merion.springWeatherAPI.controller;

import com.merion.springWeatherAPI.Weather;
import com.merion.springWeatherAPI.dto.WeatherResponse;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.log4j.Log4j;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Response;

@Log4j
@RestController
public class WeatherAPIController {
    private final Weather weather;

    public WeatherAPIController(Weather weather) {
        this.weather = weather;
    }

    @GetMapping("/api/v1/weather-in-city")
    public WeatherResponse weatherInCity(@RequestParam(required = false) String query, HttpServletRequest httpServletRequest) {
        String q = query;
        if (q == null) {
            log.error("received query is null");
            q = httpServletRequest.getRemoteAddr();
        }

        try {
            Response<WeatherResponse> response = Weather.instance().current(Weather.key, q).execute();
            return  response.body();
        } catch (Exception e) {
            log.error(e);
            throw  new RuntimeException(e);
        }

    }
}
