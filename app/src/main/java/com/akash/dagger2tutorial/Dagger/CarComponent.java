package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.Car;
import com.akash.dagger2tutorial.MainActivity;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
