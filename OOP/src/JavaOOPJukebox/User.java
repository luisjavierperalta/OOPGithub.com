package JavaOOPJukebox;

//This class represent the @Jukebox's user interacting with the software, allow user to select and initiate playback
public class User { //1
    //2
    private Jukebox jukebox;
    //3
    public User(Jukebox jukebox) {
        this.jukebox = jukebox;
    }

    //4
    public void selectSong(Selection selection) {
        Song song = selection.selectSong();
        jukebox.addToPlaylist(song);
    }
    //5
    public void play() {
        jukebox.play();
    }
}
