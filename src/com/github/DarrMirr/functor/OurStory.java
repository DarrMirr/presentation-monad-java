package com.github.DarrMirr.functor;

public class OurStory {

    public static void main(String[] args) {
        var peanutsForMe = Bag.of(Peanuts.kilo(2));
        var peanutsForBrother = Bag.of(Peanuts.kilo(2))
                                   .map(Peanuts::makeHalf);
    }
}
