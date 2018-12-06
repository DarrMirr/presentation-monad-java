package com.github.DarrMirr.examples.optional.funcstyle.version1;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        var person = new Person(new Car(new Insurance(null)));
//        var person = new Person(new Car(new Insurance("OSAGO")));
//        var person = new Person(new Car(null));
//        var person = new Person(null);
        var insuranceName = getInsuranceName(person);
        System.out.println(insuranceName);
    }

    public static String getInsuranceName(Person person) {
        return Optional
                .ofNullable(person)
                .map(Person::getCar)
                .map(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }
}
