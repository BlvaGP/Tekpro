public interface Borrowable<U> {
    void borrowItem(U borrowerInfo);
    void returnItem();
    boolean isBorrowed();
}