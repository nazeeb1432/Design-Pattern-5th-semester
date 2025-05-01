package Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        // Build a Chicken Sandwich
        SandwichBuilder chickenSandwichBuilder = new ChickenSandwichBuilder();
        SandwichShop shop = new SandwichShop(chickenSandwichBuilder);
        Sandwich chickenSandwich = shop.makeSandwich();
        System.out.println("\nChicken Sandwich: " + chickenSandwich);

        // Build an Egg Sandwich
        SandwichBuilder eggSandwichBuilder = new EggSandwichBuilder();
        shop = new SandwichShop(eggSandwichBuilder);
        Sandwich eggSandwich = shop.makeSandwich();
        System.out.println("Egg Sandwich: " + eggSandwich);
    }
}
