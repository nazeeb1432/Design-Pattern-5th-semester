package decorator.pattern;

public class CoffeeShop {
    public static void main(String[] args) {
        Coffee coffee = new BasicCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        coffee = new WhippedCreamDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());
    }
}
