public class VictorianTable implements Table{
    private String UUID;
    private String material = "Wood";
    private String color = "Dark Brown";

    @Override
    public void placeItems() {
        System.out.println("Placing items on a Victorian coffee table.");
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
