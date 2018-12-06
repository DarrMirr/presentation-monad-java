package com.github.DarrMirr.monad;

public class Peanuts {
    private int value;

    public Peanuts(int value) {
        this.value = value;
    }

    public static Peanuts kilo(int value) {
        return new Peanuts(value);
    }

    public Peanuts makeHalf() {
        return new Peanuts(value / 2);
    }

    public Bag<Peanuts> toDouble() {
        return Bag.of(Peanuts.kilo(value * 2));
    }
}
