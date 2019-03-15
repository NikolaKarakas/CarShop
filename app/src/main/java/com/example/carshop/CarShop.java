package com.example.carshop;

import android.app.Application;

import com.firebase.client.Firebase;

public class CarShop extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
