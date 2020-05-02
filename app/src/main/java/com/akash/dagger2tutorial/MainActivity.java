package com.akash.dagger2tutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.akash.dagger2tutorial.Car.Car;
import com.akash.dagger2tutorial.Dagger.CarComponent;
import com.akash.dagger2tutorial.Dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.create();
        // Normal dependency Injection
//        car = component.getCar();
        // for field injection
        // directly getting car variable ready at line 10
        component.inject(this);
        car.drive();
    }
}
