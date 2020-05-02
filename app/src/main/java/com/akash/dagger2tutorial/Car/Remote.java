package com.akash.dagger2tutorial.Car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Car";
    @Inject
    public Remote() {
    }

    void setListener(Car car){
        Log.d(TAG, "setListener: remote enabled");
    }
}
