package JavaOOPJukebox;

/*
This class simulates @Jukebox physical device with buttons for the jukebox for triggering @Jukebox functionalities when pressed
 */
public class JukeboxHardwareDevice { //1
    //2
    private Jukebox jukebox;
    //3
    public JukeboxHardwareDevice(Jukebox jukebox) {
        this.jukebox = jukebox;
    }
    //4
    public void playButtonPushed() {
        jukebox.play();
    }

    public void selectButtonPushed(int selection) {
        jukebox.selectSong();
    }
}
