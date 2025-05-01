package Builder_Pattern;

public class SandwichShop {
    private SandwichBuilder sandwichBuilder;

    public SandwichShop(SandwichBuilder sandwichBuilder) {
        this.sandwichBuilder = sandwichBuilder;
    }

    public Sandwich makeSandwich() {
        sandwichBuilder.buildBread();
        sandwichBuilder.buildFilling();
        sandwichBuilder.buildSpread();
        return sandwichBuilder.getSandwich();
    }
}

