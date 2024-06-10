package JavaOOPJukebox;

public class Song { //1 This class represent a Song with basic fields
    //2
    private String title;
    private String artist;

    //3
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;

    }

    //4
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
