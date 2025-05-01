package decorator.pattern;

// Abstract Decorator
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee; // Wrapped object

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}

