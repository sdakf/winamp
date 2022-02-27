import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Playlist extends PlaylistElement {

    public static final int LOOP_ITERATOR = 10;
    private PlayOrder playOrder;

    private List<PlaylistElement> elements = new ArrayList<>();

    public Playlist(PlayOrder playOrder) {
        this.playOrder = playOrder;
    }

    public void addElement(PlaylistElement element) {
        elements.add(element);
    }

    public String play() {
        List<String> elementsToDisplay = new ArrayList<>();
        switch (playOrder) {
            case NORMAL:
                elementsToDisplay.addAll(playNormal(elements));
            case LOOP:
                for (int i = 0; i < LOOP_ITERATOR; i++) {
                    elementsToDisplay.addAll(playNormal(elements));
                }
            case RANDOM:
                List<PlaylistElement> elementsCopy = new ArrayList<>(elements);
                Collections.shuffle(elementsCopy);
                elementsToDisplay.addAll(playNormal(elementsCopy));
        }
        return elementsToDisplay.stream()
                .collect(Collectors.joining());
    }

    private List<String> playNormal(List<PlaylistElement> elements) {
//        for (PlaylistElement element : elements) {
//            .add(element.play() + "\n");
//        }
        return elements.stream()
                .map(e -> e.play() + "\n")
                .collect(Collectors.toList());
    }


}
