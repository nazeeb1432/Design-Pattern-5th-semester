import java.util.UUID;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Creating threads to simulate multithreaded environment
        Thread thread1 = new Thread(() -> {
            FurnitureFactory victorianFactory = VictorianFurnitureFactory.getInstance();
            Chair victorianChair = victorianFactory.createChair();
            Sofa victorianSofa = victorianFactory.createSofa();
            Table victorianTable = victorianFactory.createTable();

            victorianChair.sitOn();
            System.out.println("Victorian Chair ID: " + victorianChair.getUUID());
           

            victorianSofa.lieOn();
            System.out.println("Victorian Sofa ID: " + victorianSofa.getUUID());
            victorianSofa.recline();

            victorianTable.placeItems();
            System.out.println("Victorian Table ID: " + victorianTable.getUUID());
            
        });

        Thread thread2 = new Thread(() -> {
            FurnitureFactory modernFactory = ModernFurnitureFactory.getInstance();
            Chair modernChair = modernFactory.createChair();
            Sofa modernSofa = modernFactory.createSofa();
            Table modernTable = modernFactory.createTable();

            modernChair.sitOn();
            System.out.println("Modern Chair ID: " + modernChair.getUUID());
            

            modernSofa.lieOn();
            System.out.println("Modern Sofa ID: " + modernSofa.getUUID());
            modernSofa.recline();

            modernTable.placeItems();
            System.out.println("Modern Table ID: " + modernTable.getUUID());
           
        });

        Thread thread3 = new Thread(() -> {
            FurnitureFactory rusticFactory = RusticFurnitureFactory.getInstance();
            Chair rusticChair = rusticFactory.createChair();
            Sofa rusticSofa = rusticFactory.createSofa();
            Table rusticTable = rusticFactory.createTable();

            rusticChair.sitOn();
            System.out.println("Rustic Chair ID: " + rusticChair.getUUID());
           

            rusticSofa.lieOn();
            System.out.println("Rustic Sofa ID: " + rusticSofa.getUUID());
            rusticSofa.recline();

            rusticTable.placeItems();
            System.out.println("Rustic Table ID: " + rusticTable.getUUID());
           
        });

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
