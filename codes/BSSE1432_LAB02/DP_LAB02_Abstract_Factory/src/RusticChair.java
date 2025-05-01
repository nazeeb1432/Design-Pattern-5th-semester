public class RusticChair implements Chair{
    private String UUID;
    private String material = "Reclaimed Wood";
    private String color = "Natural Brown";


    @Override
    public void sitOn() {
        System.out.println("Sitting on a rustic chair.");
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
