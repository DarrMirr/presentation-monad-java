package com.github.DarrMirr.examples.stream.objstyle;

import com.github.DarrMirr.examples.stream.Album;
import com.github.DarrMirr.examples.stream.Track;
import com.github.DarrMirr.examples.stream.discography.ArethaFranklin;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(findFavoriteSongs());
    }

    public static List<Track> findFavoriteSongs() {
        var favoriteSongs = new ArrayList<Track>();
        for (Album album : ArethaFranklin.getAlbums()) {
            for (Track track : album.getTracks()) {
                if (track.getRating() == 5) {
                    favoriteSongs.add(track);
                }
            }
        }
        favoriteSongs.sort(new Comparator<>() {
            public int compare(Track t1, Track t2) {
                return t1.getName().compareTo(t2.getName());
            }});
        return favoriteSongs;
    }
}
