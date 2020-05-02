package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.DieselEngine;
import com.akash.dagger2tutorial.Car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
