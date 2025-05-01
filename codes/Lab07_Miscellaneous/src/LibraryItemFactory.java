// Factory Class
class LibraryItemFactory {
    public static LibraryItem createLibraryItem(String type, String title) {
        if (type.equalsIgnoreCase("book")) {
            return new Book(title);
        } else if (type.equalsIgnoreCase("magazine")) {
            return new Magazine(title);
        }
        throw new IllegalArgumentException("Invalid item type");
    }
}
