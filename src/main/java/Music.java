public class Music extends PlaylistElement {

    private String artist;

    public Music(String artist, String title) {
        this.artist = artist;
        this.title = title;
    }

    @Override
    public String play() {
        return artist + ", " + title;
    }
}
