// Singleton Configuration Manager
class LibraryConfigManager {
    private static LibraryConfigManager instance;
    private double lateFee;
    private int borrowingLimit;
    private String openingHours;

    private LibraryConfigManager() {
        // Default configuration
        this.lateFee = 1.0;
        this.borrowingLimit = 5;
        this.openingHours = "9:00 AM - 5:00 PM";
    }

    public static LibraryConfigManager getInstance() {
        if (instance == null) {
            instance = new LibraryConfigManager();
        }
        return instance;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }

    public int getBorrowingLimit() {
        return borrowingLimit;
    }

    public void setBorrowingLimit(int borrowingLimit) {
        this.borrowingLimit = borrowingLimit;
    }

    public String getOpeningHours() {
        return openingHours;
    }

    public void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }
}
