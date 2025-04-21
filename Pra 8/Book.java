public class Book extends LibraryItem<String> implements Borrowable<String> {
    private boolean borrowed;
    private String borrower;

    public Book(String title, String author, String genre) {
        super(title, author, genre);
        this.borrowed = false;
        this.borrower = null;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + getSpecificInfo());
        System.out.println("Borrowed: " + (borrowed ? "Yes, by " + borrower : "No"));
    }

    @Override
    public void borrowItem(String borrowerInfo) {
        if (!borrowed) {
            borrowed = true;
            borrower = borrowerInfo;
            System.out.println("Book borrowed by " + borrowerInfo);
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    @Override
    public void returnItem() {
        if (borrowed) {
            borrowed = false;
            borrower = null;
            System.out.println("Book returned.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }
}