public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("Document1.txt", 1000);
        FileSystemComponent file2 = new File("Image1.jpg", 2000);

        Folder documentsFolder = new Folder("Documents");
        documentsFolder.addComponent(file1);

        Folder picturesFolder = new Folder("Pictures");
        picturesFolder.addComponent(file2);

        Folder rootFolder = new Folder("Root");
        rootFolder.addComponent(documentsFolder);
        rootFolder.addComponent(picturesFolder);

        System.out.println("Total size of " + rootFolder.getName() + ": " + rootFolder.getSize() + " bytes");
        System.out.println("Size of " + documentsFolder.getName() + ": " + documentsFolder.getName() + " bytes");
        System.out.println("Size of " + picturesFolder.getName() + ": " + picturesFolder.getSize() + " bytes");
    }
}