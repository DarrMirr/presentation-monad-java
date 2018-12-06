package com.github.DarrMirr.examples.optional.objstyle;

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
        if (person == null ||
                person.getCar() == null ||
                person.getCar().getInsurance() == null) {
            return "Unknown";
        }
        return person.getCar().getInsurance().getName();
    }
}
