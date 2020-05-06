package com.akash.dagger2tutorial.Car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    // what if engine is an interface
    // same as wheels -> create module
    @Inject
    Car(Engine engine, Wheels wheels, Driver driver) {
        this.engine = engine;
        this.wheels = wheels;
        this.driver = driver;
    }

    @Inject
    void enabledRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.start();
        Log.d(TAG, "drive:" + driver + " drives " + this);
    }
}
