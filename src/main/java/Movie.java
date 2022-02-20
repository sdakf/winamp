public class Movie extends X {


    public Movie(String title) {
        this.title = title;
    }

    @Override
    public String play() {
        return title;
    }
}
