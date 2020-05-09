package com.akash.dagger2tutorial;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.akash.dagger2tutorial.Car.Car;
import com.akash.dagger2tutorial.Dagger.ActivityComponent;
import com.akash.dagger2tutorial.Dagger.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((MyApplication) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(150));

        // Normal dependency Injection
//        car = component.getCar();
        // for field injection
        // directly getting car variable ready at line 10
        component.inject(this);
        car1.drive();
        car2.drive();
    }
}
