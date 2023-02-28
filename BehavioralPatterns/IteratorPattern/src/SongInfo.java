public class SongInfo {

    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearRelease) {
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearRelease;
    }

    public String getSongName() {
        return songName;
    }

    public String getBandName() {
        return bandName;
    }

    public int getYearReleased() {
        return yearReleased;
    }

}
