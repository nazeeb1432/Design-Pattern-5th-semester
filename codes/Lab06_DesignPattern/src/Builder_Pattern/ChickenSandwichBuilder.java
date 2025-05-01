package Builder_Pattern;

public class ChickenSandwichBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public ChickenSandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void buildBread() {
        sandwich.setBread("Regular Bread");
    }

    @Override
    public void buildFilling() {
        sandwich.setFilling("Grilled Chicken");
    }

    @Override
    public void buildSpread() {
        sandwich.setSpread("Cheese");
    }

    @Override
    public Sandwich getSandwich() {
        return this.sandwich;
    }
}
