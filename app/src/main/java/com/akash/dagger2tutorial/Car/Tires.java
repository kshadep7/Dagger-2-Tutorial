package com.akash.dagger2tutorial.Car;

import android.util.Log;

public class Tires {
    // third party class
    private static final String TAG = "Car";

    public Tires() {
    }

    public void inflate() {
        Log.d(TAG, "inflate: Tyres inflated");
    }
}
