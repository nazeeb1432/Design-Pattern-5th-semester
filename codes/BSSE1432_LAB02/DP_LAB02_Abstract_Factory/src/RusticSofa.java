public class RusticSofa implements Sofa{
    private String UUID;
    private String material = "Leather and Burlap";
    private String color = "Tan";

    @Override
    public void lieOn() {
        System.out.println("Lying on a rustic sofa.");
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void recline() {
        System.out.println("Rustic sofa reclined.");
    }

    public String getUUID(){
        return this.UUID;
    }

    public void setUUID(String UUID){
        this.UUID=UUID;
    }
}
