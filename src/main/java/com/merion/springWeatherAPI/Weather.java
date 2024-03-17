package com.merion.springWeatherAPI;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.merion.springWeatherAPI.api.WeatherApi;
import jakarta.annotation.PostConstruct;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@Component
public class Weather {

    private static final String HOST = "https://api.weatherapi.com";


    public static final String key = "fc3e8a7550b94adf89d124040241503";

    private  static WeatherApi api;

    private static WeatherApi init() {
        Gson gson = new GsonBuilder().setLenient().create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(HOST)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

      return retrofit.create(WeatherApi.class);

    }

    public   static  WeatherApi instance() {
        if (api == null) {
            api = init();
        }
        return api;
    }


}
