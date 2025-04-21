public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book = new Book("Pemrograman Java", "John Doe", "Teknologi");
        TypedLibraryItem<String, ItemType> typedItem =
                new TypedLibraryItem<>("Majalah IT", "Jane Smith", "Edisi Oktober", ItemType.MAGAZINE);

        library.addItem(book);
        library.addItem(typedItem);

        System.out.println("Semua Item di Perpustakaan:");
        library.displayAllItems();

        BorrowableItemCollection<Book> borrowableCollection = new BorrowableItemCollection<>();
        borrowableCollection.addBorrowableItem(book);

        book.borrowItem("Belva");
        System.out.println("\nSetelah Peminjaman:");
        borrowableCollection.displayBorrowableItems();

        book.returnItem();
        System.out.println("\nSetelah Pengembalian:");
        borrowableCollection.displayBorrowableItems();
    }
}