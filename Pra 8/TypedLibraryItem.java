public class TypedLibraryItem<T, U extends Enum<U>> extends LibraryItem<T> {
    private U itemType;

    public TypedLibraryItem(String title, String author, T specificInfo, U itemType) {
        super(title, author, specificInfo);
        this.itemType = itemType;
    }

    public U getItemType() {
        return itemType;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Specific Info: " + getSpecificInfo());
        System.out.println("Item Type: " + itemType);
    }
}