package Builder_Pattern;

public interface SandwichBuilder {
    void buildBread();
    void buildFilling();
    void buildSpread();
    Sandwich getSandwich();
}

