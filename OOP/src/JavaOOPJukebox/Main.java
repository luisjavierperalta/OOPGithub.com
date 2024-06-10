package JavaOOPJukebox;

public class Main { //1
    //2
    public static void main(String[] args) {
        //3 Create playlist & CDPlayer new objects instances
        Playlist playlist = new Playlist();
        CDPlayer cdPlayer = new CDPlayer();

        //3.1 Create jukebox new object instance
        Jukebox jukebox = new Jukebox(playlist, cdPlayer);

        //4 User Interaction @Placeholder for UI
        Song song1 = new Song ("Bohemian Rhapsody", "Queen ");
        Song song2 = new Song ("Hotel California", "Eagles");

        //4.1 Adding songs to playlist
        jukebox.addToPlaylist(song1);
        jukebox.addToPlaylist(song2);

        //4.2 Play the jukebox
        jukebox.play();


    }
}
