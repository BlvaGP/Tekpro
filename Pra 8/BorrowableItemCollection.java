import java.util.ArrayList;
import java.util.List;

public class BorrowableItemCollection<V extends LibraryItem<?> & Borrowable<?>> {
    private List<V> borrowableItems = new ArrayList<>();

    public void addBorrowableItem(V item) {
        borrowableItems.add(item);
    }

    public void displayBorrowableItems() {
        for (V item : borrowableItems) {
            item.displayInfo();
            System.out.println("Is Borrowed: " + item.isBorrowed());
            System.out.println();
        }
    }
}