package Builder_Pattern;

public class EggSandwichBuilder implements SandwichBuilder {
    private Sandwich sandwich;

    public EggSandwichBuilder() {
        this.sandwich = new Sandwich();
    }

    @Override
    public void buildBread() {
        sandwich.setBread("Toasted Bread");
    }

    @Override
    public void buildFilling() {
        sandwich.setFilling("Fried Egg");
    }

    @Override
    public void buildSpread() {
        sandwich.setSpread("Sauce");
    }

    @Override
    public Sandwich getSandwich() {
        return this.sandwich;
    }
}

