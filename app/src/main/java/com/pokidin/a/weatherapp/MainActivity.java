package com.pokidin.a.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pokidin.a.weatherapp.api.RestClient;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RestClient restClient = new RestClient();


    }
}
