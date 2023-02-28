import java.util.ArrayList;
import java.util.Iterator;

public class DiscJockey {

    SongIterator iter70sSongs;
    SongIterator iter80sSongs;
    SongIterator iter90sSongs;

    public DiscJockey(SongIterator songsOfThe70s, SongIterator songsOfThe80s, SongIterator songsOfThe90s) {
        iter70sSongs = songsOfThe70s;
        iter80sSongs = songsOfThe80s;
        iter90sSongs = songsOfThe90s;
    }

    public void showTheSongs() {
        Iterator songs70s = iter70sSongs.createIterator();
        Iterator songs80s = iter80sSongs.createIterator();
        Iterator songs90s = iter90sSongs.createIterator();

        System.out.println("Songs of the 70s\n");
        printTheSongs(songs70s);

        System.out.println("Songs of the 80s\n");
        printTheSongs(songs80s);

        System.out.println("Songs of the 90s\n");
        printTheSongs(songs90s);

    }

    public void printTheSongs(Iterator iterator) {
        while(iterator.hasNext()) {
            SongInfo songInfo = (SongInfo) iterator.next();

            System.out.println(songInfo.getSongName());
            System.out.println(songInfo.getBandName());
            System.out.println(songInfo.getYearReleased());
        }
    }

}
