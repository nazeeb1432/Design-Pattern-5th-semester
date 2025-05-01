public class CompositePatternFileSystemExample {
    public static void main(String[] args) {
        // Create files
        File file1 = new File("File1.txt", "This is a sample content");
        File file2 = new File("File2.txt", "Another example content");
        File file3 = new File("File3.txt", "Keyword exists here");

        // Create folders
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");
        Folder rootFolder = new Folder("RootFolder");

        // Build the tree structure
        folder1.add(file1);
        folder1.add(file2);
        folder2.add(file3);
        rootFolder.add(folder1);
        rootFolder.add(folder2);

        // Search for a keyword
        String keyword = "Keyword";
        rootFolder.search(keyword);
    }
}
