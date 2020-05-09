package com.akash.dagger2tutorial.Dagger;

import com.akash.dagger2tutorial.Car.Car;
import com.akash.dagger2tutorial.CustomPerActivityScope;
import com.akash.dagger2tutorial.MainActivity;

import dagger.Subcomponent;

@CustomPerActivityScope
@Subcomponent(modules = {WheelsModule.class, DieselEngineModule.class})
public interface ActivityComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

/*
    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("power") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("capacity") int capacity);

        Builder appComponent(AppComponent appComponent);

        ActivityComponent build();
    }
*/
}
