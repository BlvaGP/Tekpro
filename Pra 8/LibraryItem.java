public abstract class LibraryItem<T> {
    private String title;
    private String author;
    private T specificInfo;

    public LibraryItem(String title, String author, T specificInfo) {
        this.title = title;
        this.author = author;
        this.specificInfo = specificInfo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public T getSpecificInfo() {
        return specificInfo;
    }

    public abstract void displayInfo();
}