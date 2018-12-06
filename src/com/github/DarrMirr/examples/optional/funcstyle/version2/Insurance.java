package com.github.DarrMirr.examples.optional.funcstyle.version2;

import java.util.Optional;

public class Insurance {
    private String name;

    public Insurance(String name) {
        this.name = name;
    }

    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }
}
