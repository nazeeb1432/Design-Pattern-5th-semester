public class VictorianChair implements Chair{
    private String UUID;
    private String material = "Wood";
    private String color = "Brown";

    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
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
