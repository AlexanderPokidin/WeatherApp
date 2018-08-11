package com.pokidin.a.weatherapp.api;

import com.pokidin.a.weatherapp.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface WeatherAPI {

    @GET("/forecast/{apiKey}/{lat},{lng}")
    Call<Weather> weather(@Path("apiKey") String apiKey,
                          @Path("lat") double lat,
                          @Path("lng") double lng);
}
