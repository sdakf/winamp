import org.junit.jupiter.api.Test;

public class PlayListTest {

    @Test
    void play() {
        Movie movie1 = new Movie("Casablanca");
        Movie movie2 = new Movie("Saw");
        Music music1 = new Music("Kazik", "12 groszy");
        Music music2 = new Music("Mydełko Fa", "Cycolina");

        Playlist playlist = new Playlist(PlayOrder.NORMAL);
        playlist.addElement(movie1);
        playlist.addElement(movie2);
        playlist.addElement(music1);
        playlist.addElement(music2);

        System.out.println(playlist.play());


    }
}
