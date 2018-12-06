package com.github.DarrMirr.examples.stream;

public class Track {
    private String name;
    private int rating;

    public Track(String name, int rating) {
        this.name = name;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
