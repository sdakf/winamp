public class Movie extends PlaylistElement {


    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String play() {
        return title;
    }
}
