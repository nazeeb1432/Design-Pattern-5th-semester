class LibraryAccessProxy implements LibraryAccess {
    private LibraryItem item;
    private RealLibraryAccess realAccess;

    public LibraryAccessProxy(LibraryItem item) {
        this.item = item;
    }

    @Override
    public void accessItem(String itemID, User user) {
        if (user.hasPermission()) {
            if (realAccess == null) {
                realAccess = new RealLibraryAccess(item);
            }
            realAccess.accessItem(itemID, user);
        } else {
            System.out.println(user.getName() + " does not have permission to access: " + item.getDetails());
        }
    }
}
