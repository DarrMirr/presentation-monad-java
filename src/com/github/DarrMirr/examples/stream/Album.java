package com.github.DarrMirr.examples.stream;

import java.util.List;

public class Album {
    private List<Track> tracks;

    public Album(List<Track> tracks) {
        this.tracks = tracks;
    }

    public List<Track> getTracks() {
        return tracks;
    }
}
