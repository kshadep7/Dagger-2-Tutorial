package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.Rims;
import com.akash.dagger2tutorial.Car.Tires;
import com.akash.dagger2tutorial.Car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    @Provides
    static Tires provideTyres() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
