package JavaOOPJukebox;

import java.util.LinkedList;
import java.util.Queue;

// //1 This class represent a Playlist
// Manage Queue for adding/retrieving next songs
// Check if playlist is empty
public class Playlist { //1
    //2
    private Queue<Song> songs;

    //3
    public Playlist() {
        this.songs = new LinkedList<>();
    }
    //4
    public void addSong(Song song) {
        songs.add(song);
    }
    //5
    public Song getNextSong() {
        return songs.poll(); //Return & removes 1st song
    }
    //6 //Check if playlist is empty
    public boolean isEmpty() {
        return songs.isEmpty();
    }


}
