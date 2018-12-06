package com.github.DarrMirr.monad;

public class OneDayStory {

    public static void main(String[] args) {
        var peanutsDouble = Bag.of(Peanuts.kilo(2))
                               .flatMap(Peanuts::toDouble);
    }
}
