//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        Table victorianTable = victorianFactory.createTable();

        victorianChair.sitOn();
        victorianSofa.lieOn();
        victorianSofa.recline();
        victorianTable.placeItems();

        System.out.println();

        // Modern furniture set
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        Table modernCoffeeTable = modernFactory.createTable();

        modernChair.sitOn();
        modernSofa.lieOn();
        modernSofa.recline();
        modernCoffeeTable.placeItems();


        System.out.println();

        // Rustic furniture set
        FurnitureFactory rusticFactory = new RusticFurnitureFactory();
        Chair rusticChair = rusticFactory.createChair();
        Sofa rusticSofa = rusticFactory.createSofa();
        Table rusticCoffeeTable = rusticFactory.createTable();

        rusticChair.sitOn();
        rusticSofa.lieOn();
        rusticSofa.recline();
        rusticCoffeeTable.placeItems();

    }
}