class Book implements LibraryItem {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getDetails() {
        return "Book Title: " + title;
    }

    @Override
    public void borrowItem(String user) {
        System.out.println(user + " borrowed the book: " + title);
    }
}
