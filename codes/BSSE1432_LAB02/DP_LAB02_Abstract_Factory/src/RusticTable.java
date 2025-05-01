public class RusticTable implements Table{
    private String UUID;
    private String material = "Stone and Wood";
    private String color = "Grey and Brown";


    @Override
    public void placeItems() {
        System.out.println("Placing items on a rustic coffee table.");
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
