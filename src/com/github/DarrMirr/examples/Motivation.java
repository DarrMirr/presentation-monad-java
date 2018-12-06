package com.github.DarrMirr.examples;

import java.util.Optional;
import java.util.stream.Stream;

public class Motivation {

    public static void main(String[] args) {
        long count = Stream.of("Дима", "Женя", "Артём", "Аня", "Саша")
                .map(String::chars)
                .flatMap(intStream -> intStream.mapToObj(n -> (char) n))
                .filter(ch -> ch == 'а')
                .count();
        System.out.println(count);

        Optional.of("Железнодорожный")
                .map(String::chars)
                .flatMap(intStream -> Optional.of(intStream.count()))
                .ifPresent(System.out::println);
    }
}
