package JavaOOPJukebox;

public class Jukebox { //1
    //2
    private Playlist playlist;
    private CDPlayer cdPlayer;

    //3
    public Jukebox(Playlist playlist, CDPlayer cdPlayer) {
        this.playlist = playlist;
        this.cdPlayer = cdPlayer;
    }
    //4
    public void addToPlaylist(Song song) {
        playlist.addSong(song);
    }
    //5

    public void selectSong() {
        Song song = Selection.selectSong();
        if (song != null) {
            addToPlaylist(song);
        }
    }
    //6
    public void play() {
        while (!playlist.isEmpty()) {
            Song song = playlist.getNextSong();
            cdPlayer.playSong(song);
        }
    }
    //7

}
