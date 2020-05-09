package com.akash.dagger2tutorial;

import android.app.Application;

import com.akash.dagger2tutorial.Dagger.AppComponent;
import com.akash.dagger2tutorial.Dagger.DaggerAppComponent;

public class MyApplication extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
