class ClothingProduct implements Product {
    private String name;
    private String category;
    private double price;
    private String color;
    private String size;

    public ClothingProduct(String name, double price, String color, String size) {
        this.name = name;
        this.category = "Clothing";
        this.price = price;
        this.color = color;
        this.size = size;
    }

    // Copy constructor for cloning
    public ClothingProduct(ClothingProduct source) {
        this.name = source.name;
        this.category = source.category;
        this.price = source.price;
        this.color = source.color;
        this.size = source.size;
    }

    @Override
    public Product copy() {
        return new ClothingProduct(this);
    }

    public void customizeClothing(String color,String size){
        setColor(color);
        setSize(size);
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setSize(String size) {
        this.size = size;
    }

    @Override
    public void displayDetails() {
        System.out.println("ClothingProduct [name=" + name + ", category=" + category + ", price=" + price +
                ", color=" + color + ", size=" + size + "]");
    }
}
