package com.github.DarrMirr.examples.optional.objstyle;

public class Person {
    private Car car;

    public Person(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }
}
