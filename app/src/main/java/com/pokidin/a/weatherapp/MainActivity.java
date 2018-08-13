package com.pokidin.a.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pokidin.a.weatherapp.api.RestClient;
import com.pokidin.a.weatherapp.controller.Forecaster;
import com.pokidin.a.weatherapp.model.Daily;
import com.pokidin.a.weatherapp.model.Weather;

public class MainActivity extends AppCompatActivity {

    Daily mDaily = new Daily();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestClient restClient = new RestClient();

        Forecaster forecaster = new Forecaster();
        forecaster.forecaster(mDaily);

    }
}
