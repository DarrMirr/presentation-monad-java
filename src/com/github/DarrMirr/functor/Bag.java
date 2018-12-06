package com.github.DarrMirr.functor;

import java.util.function.Function;

public final class Bag<T> {
    private final T value;

    private Bag(T value) {
        this.value = value;
    }

    public static <T> Bag<T> of(T value) {
        return new Bag<>(value);
    }

    public <U> Bag<U> map(Function<T, U> mapper) {
        return new Bag<>(mapper.apply(value));
    }
}
