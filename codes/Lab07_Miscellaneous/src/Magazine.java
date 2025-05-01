class Magazine implements LibraryItem {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    @Override
    public String getDetails() {
        return "Magazine Title: " + title;
    }

    @Override
    public void borrowItem(String user) {
        System.out.println(user + " borrowed the magazine: " + title);
    }
}