package com.github.DarrMirr.examples.stream.discography;

import com.github.DarrMirr.examples.stream.Album;
import com.github.DarrMirr.examples.stream.Track;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArethaFranklin {

    public static List<Album> getAlbums() {
        Track track01 = new Track("Son of a Preacher Man", 5);
        Track track02 = new Track("Share Your Love with Me", 2);
        Track track03 = new Track("The Dark End of the Street", 1);
        Track track04 = new Track("Let It Be", 5);
        Track track05 = new Track("Eleanor Rigby", 3);
        Track track06 = new Track("This Girl's in Love with You", 3);
        Track track07 = new Track("It Ain't Fair", 3);
        Track track08 = new Track("The Weight", 0);
        Track track09 = new Track("Call Me", 2);
        Track track10 = new Track("Sit Down and Cry", 3);
        return Collections.singletonList(new Album(Arrays.asList(track01, track02, track03, track04, track05, track06, track07, track08, track09, track10)));
    }
}
