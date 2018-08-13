package com.pokidin.a.weatherapp.controller;

import android.util.Log;

import com.pokidin.a.weatherapp.model.Daily;
import com.pokidin.a.weatherapp.model.Datum;

import java.util.ArrayList;

public class Forecaster {
    private static final String TAG = "Forecaster";

    public void forecaster(Daily daily) {
        ArrayList<Datum> mData;
//        mData = new ArrayList<>(daily.getData());
//        for (int i = 0; i < mData.size(); i++) {
//            Log.i(TAG, "" + mData.get(i).getSummary());
//        }
    }

}
