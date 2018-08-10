package com.pokidin.a.weatherapp.api;

import com.pokidin.a.weatherapp.model.Weather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface WeatherAPI {

    @GET("key/{key}")
    Call<Weather> weather(@Path("key") String key, @Query("latitude") double lat, @Query("longitude") double lng);
}
