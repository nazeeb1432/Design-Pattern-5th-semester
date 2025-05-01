package Proxy;
import java.util.Scanner;


// Client Code
public class ImageViewerProgram {
    public static void main(String[] args) {
        // List of image filenames
        Image[] images = {
                new ImageProxy("photo1.jpg"),
                new ImageProxy("photo2.jpg"),
                new ImageProxy("photo3.jpg")
        };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display filenames only
            System.out.println("\nImage list:");
            for (Image image : images) {
                System.out.println("- " + image.getFilename());
            }

            // Prompt the user to select an image by filename
            System.out.print("\nEnter the filename of the image you want to view: ");
            String selectedFilename = scanner.nextLine();

            // Search for the image by filename and display it if found
            boolean found = false;
            for (Image image : images) {
                if (image.getFilename().equals(selectedFilename)) {
                    image.display();  // Only loads and displays the selected image
                    found = true;
                    break;
                }
            }

            // If the filename doesn't match any image in the list
            if (!found) {
                System.out.println("Image not found: " + selectedFilename);
            }

            // Ask if the user wants to continue
            System.out.print("\nDo you want to view another image? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (!response.equals("yes")) {
                System.out.println("Exiting program.");
                break;
            }
        }

        scanner.close();
    }
}

