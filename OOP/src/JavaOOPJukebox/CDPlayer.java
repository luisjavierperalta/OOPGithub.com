package JavaOOPJukebox;

//This class simulates @CDPlayer functionality
//Allow playing a song, and retrieving current song
public class CDPlayer { //1
    //2
    private Song currentSong;
    //3
    public void playSong(Song song) {
        this.currentSong = song;
        //Simulates playing the song @Placeholder for audio playback system business logic
        System.out.println("Now playing:"+ song.getTitle());
    }
    //4
    public Song getCurrentSong() {
        return currentSong;
    }
}
