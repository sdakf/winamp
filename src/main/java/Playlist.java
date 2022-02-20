import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist extends X {

    private PlayOrder playOrder;

    private List<X> elements = new ArrayList<>();

    public Playlist(PlayOrder playOrder) {
        this.playOrder = playOrder;
    }

    public void addElement(X element) {
        elements.add(element);
    }

    public String play() {
        List<String> elementsToDisplay = new ArrayList<>();
        for (X element : elements) {
            elementsToDisplay.add(element.play() + "\n");
        }
        return elementsToDisplay.stream()
                .collect(Collectors.joining());
    }


}
