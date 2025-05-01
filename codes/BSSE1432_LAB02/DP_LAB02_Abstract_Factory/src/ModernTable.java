public class ModernTable implements Table{
    private String UUID;
    private String material = "Glass";
    private String color = "Transparent";


    @Override
    public void placeItems() {
        System.out.println("Placing items on a modern coffee table.");
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getColor() {
        return color;
    }
    public String getUUID(){
        return this.UUID;
    }

    public void setUUID(String UUID){
        this.UUID=UUID;
    }
}
