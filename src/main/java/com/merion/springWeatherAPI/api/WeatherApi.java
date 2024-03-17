package com.merion.springWeatherAPI.api;


import com.merion.springWeatherAPI.dto.WeatherResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("/v1/current.json")
    Call<WeatherResponse> current(@Query("key") String key, @Query("q") String query);
}
