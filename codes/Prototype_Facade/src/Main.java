import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String color;
        String size;
        int storage;
        int battery;

        Scanner sc=new Scanner(System.in);
        ProductRegistry registry = new ProductRegistry();
        //show available prototypes
        registry.showPrototypes();

        // Cloning a clothing prototype
        Product clonedClothing = registry.getPrototype("BasicClothing");
        if (clonedClothing != null) {
            clonedClothing.displayDetails();
        }
        //customized clothing
        System.out.println("Enter color and size to custom:");
        System.out.println("Color: ");
        color=sc.nextLine();
        System.out.println("Size:");
        size=sc.nextLine();
        ClothingProduct customized1= (ClothingProduct) clonedClothing;
        customized1.customizeClothing(color,size);

        System.out.println("Your customized cloth is ready:");
        customized1.displayDetails();





        // Customizing the cloned clothing product

        System.out.println("Now lets customize our electronic product:");
        // Cloning an electronic prototype
        Product clonedElectronic = registry.getPrototype("BasicElectronics");
        if (clonedElectronic != null) {
            clonedElectronic.displayDetails();
        }

        System.out.println("Enter storageCapacity and batteryCapacity of choice:");
        System.out.println("storageCapacity: ");
        storage=sc.nextInt();
        System.out.println("batteryCapacity:");
        battery=sc.nextInt();
        ElectronicProduct customized2=(ElectronicProduct) clonedElectronic;
        customized2.customizeElectronicProduct(storage,battery);

        System.out.println("Your customized electronic is ready:");
        customized2.displayDetails();

        System.out.println("Thank u for shopping with us!");


        // Customizing the cloned electronic product


    }
}
