class RealLibraryAccess implements LibraryAccess {
    private LibraryItem item;

    public RealLibraryAccess(LibraryItem item) {
        this.item = item;
    }

    @Override
    public void accessItem(String itemID, User user) {
        item.borrowItem(user.getName());
    }
}
