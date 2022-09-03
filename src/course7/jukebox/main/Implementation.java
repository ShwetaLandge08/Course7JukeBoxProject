package course7.jukebox.main;

import course7.jukebox.connection.ConnectionClass;
import course7.jukebox.playlist.PlayList;
import course7.jukebox.songandpodcast.ArtistAndAlbum;
import course7.jukebox.songandpodcast.Podcast;
import course7.jukebox.songandpodcast.Song;
import course7.jukebox.userlogin.Login;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class Implementation {
    public static void main(String[] args) throws ParseException {
        ConnectionClass connectionClass = new ConnectionClass();
        Login login = new Login();
        ArtistAndAlbum a = new ArtistAndAlbum();
        Song song = new Song();
        Podcast podcast = new Podcast();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. New User.");
        System.out.println("2. Existing User.");
        int choice = sc.nextInt();
        login.gotoChoice(choice);
       /* PlayList playList = new PlayList();
        System.out.println("Enter the PlayList Name you want to create.");
        String playlist = sc.nextLine();
        System.out.println("Enter your UserId.");
        int user = sc.nextInt();
        int i = playList.addToPlayListSongAndPodcast(playlist, user);
        System.out.println(i);*/

    }
}
