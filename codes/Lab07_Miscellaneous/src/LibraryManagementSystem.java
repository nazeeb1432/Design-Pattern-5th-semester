import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryConfigManager config = LibraryConfigManager.getInstance();
        System.out.println("Library Configurations:");
        System.out.println("Late Fee: $" + config.getLateFee());
        System.out.println("Borrowing Limit: " + config.getBorrowingLimit());
        System.out.println("Opening Hours: " + config.getOpeningHours());

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Library System ---");
        System.out.print("Enter item type (book/magazine): ");
        String itemType = scanner.nextLine();

        System.out.print("Enter item title: ");
        String itemTitle = scanner.nextLine();

        LibraryItem item = LibraryItemFactory.createLibraryItem(itemType, itemTitle);

        System.out.print("Enter your name: ");
        String userName = scanner.nextLine();

        System.out.print("Do you have permission to borrow restricted items? (yes/no): ");
        boolean hasPermission = scanner.nextLine().equalsIgnoreCase("yes");

        User user = new User(userName, hasPermission);
        LibraryAccess proxy = new LibraryAccessProxy(item);

        System.out.println("\nAttempting to access the item...");
        proxy.accessItem(itemTitle, user);

        scanner.close();
    }
}
