package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.Car;
import com.akash.dagger2tutorial.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("capacity") int capacity);

        CarComponent build();
    }
}
