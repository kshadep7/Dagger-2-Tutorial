package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.Engine;
import com.akash.dagger2tutorial.Car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}