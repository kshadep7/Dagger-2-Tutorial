package com.akash.dagger2tutorial.Car;

public class Wheels {

    // wheels is a third party class which cannot be accessed directly.
    // so we cannot use @Inject here on the constructor
    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
