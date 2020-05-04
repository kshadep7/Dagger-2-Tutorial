package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.DieselEngine;
import com.akash.dagger2tutorial.Car.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    public int provideHorsepower() {
        return horsePower;
    }

    @Provides
    Engine providesEngine(DieselEngine engine) {
        return engine;
    }
}
