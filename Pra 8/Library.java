import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem<?>> items = new ArrayList<>();

    public <T> void addItem(LibraryItem<T> item) {
        items.add(item);
    }

    public void displayAllItems() {
        for (LibraryItem<?> item : items) {
            item.displayInfo();
            System.out.println();
        }
    }
}