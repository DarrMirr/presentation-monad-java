package com.github.DarrMirr.examples.stream.funcstyle;

import com.github.DarrMirr.examples.stream.Album;
import com.github.DarrMirr.examples.stream.Track;
import com.github.DarrMirr.examples.stream.discography.ArethaFranklin;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(findFavoriteSongs());

    }

    public static List<Track> findFavoriteSongs() {
        return ArethaFranklin
                .getAlbums()
                .stream()
                .map(Album::getTracks)
                .flatMap(List::stream)
                .filter(track -> track.getRating() == 5)
                .sorted(Comparator.comparing(Track::getName))
//                .sorted(Comparator.comparing(track -> track.getName()))
//                .sorted((t1, t2) -> t1.getName().compareTo(t2.getName()))
                .collect(Collectors.toList());
    }
}
