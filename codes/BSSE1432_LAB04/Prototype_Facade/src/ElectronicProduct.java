class ElectronicProduct implements Product {
    private String name;
    private String category;
    private double price;
    private int storageCapacity;
    private int batteryLife;

    public ElectronicProduct(String name, double price, int storageCapacity, int batteryLife) {
        this.name = name;
        this.category = "Electronics";
        this.price = price;
        this.storageCapacity = storageCapacity;
        this.batteryLife = batteryLife;
    }

    // Copy constructor for cloning
    public ElectronicProduct(ElectronicProduct source) {
        this.name = source.name;
        this.category = source.category;
        this.price = source.price;
        this.storageCapacity = source.storageCapacity;
        this.batteryLife = source.batteryLife;
    }

    @Override
    public Product copy() {
        return new ElectronicProduct(this);
    }

    public void customizeElectronicProduct(int storageCapacity,int batteryLife){
        setStorageCapacity(storageCapacity);
        setBatteryLife(batteryLife);
    }

    private void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    private void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void displayDetails() {
        System.out.println("ElectronicProduct [name=" + name + ", category=" + category + ", price=" + price +
                ", storageCapacity=" + storageCapacity + "GB, batteryLife=" + batteryLife + " hours]");
    }
}
