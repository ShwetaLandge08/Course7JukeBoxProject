package course7.jukebox.main;

import course7.jukebox.connection.ConnectionClass;
import course7.jukebox.userlogin.Login;
import java.text.ParseException;
import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) throws ParseException {
        ConnectionClass connectionClass = new ConnectionClass();
        Login login = new Login();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. New User.");
        System.out.println("2. Existing User.");
        int choice = sc.nextInt();
        login.gotoChoice(choice);
        /*PlayList playList = new PlayList();
        Podcast podcast = new Podcast();
        Song song = new Song();
        List<Podcast> shweta = playList.showListOfPodcastForGivenUser("Shweta", 1);
        podcast.displayPodcastList(shweta);
        List<Song> shweta1 = playList.showListOfSongForGivenUser("Shweta", 1);
        song.displaySongList(shweta1);*/

    }
}
