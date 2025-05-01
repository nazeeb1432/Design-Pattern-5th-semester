public class VictorianSofa implements Sofa{
    private String UUID;
    private String material = "Velvet";
    private String color = "Red";

    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa.");
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
        System.out.println("Victorian sofa reclined.");
    }

    public String getUUID(){
        return this.UUID;
    }

    public void setUUID(String UUID){
        this.UUID=UUID;
    }

}
