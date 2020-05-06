package com.akash.dagger2tutorial;

import android.app.Application;

import com.akash.dagger2tutorial.Dagger.CarComponent;
import com.akash.dagger2tutorial.Dagger.DaggerCarComponent;

public class MyApplication extends Application {

    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1000)
                .build();
    }
    public CarComponent getAppComponent(){
        return component;
    }
}
