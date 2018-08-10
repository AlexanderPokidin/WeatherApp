package com.pokidin.a.weatherapp.api;

import android.util.Log;

import com.pokidin.a.weatherapp.model.Weather;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestClient {
    private static final String TAG = "RestClient";
    private static final String BASE_URL = "https://api.darksky.net/forecast/";
    private static final String KEY = "f50c87610d3400b53637c27f335a4";

    private double lat = 50.45466;
    private double lng = 30.5238;

//    public static final RestClient newInstance = new RestClient();


    public RestClient() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Log.d(TAG, "URL: " + retrofit);

        WeatherAPI weatherAPI = retrofit.create(WeatherAPI.class);
        weatherAPI.weather(KEY, lat, lng).enqueue(new Callback<Weather>() {
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                Log.i(TAG, "" + response);
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {
                Log.e(TAG, "" + t);

            }
        });
    }
}
