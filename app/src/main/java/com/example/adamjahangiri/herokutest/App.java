package com.example.adamjahangiri.herokutest;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("12345")
        .clientKey("12345")
        .server("https://giri1991test.herokuapp.com/")
        .build());
    }
}
