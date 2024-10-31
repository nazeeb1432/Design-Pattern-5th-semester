import java.util.UUID;

public class VictorianChair implements Chair{

    private String material = "Wood";
    private String color = "Brown";
    private UUID id;

    public VictorianChair(UUID id){
        this.id=id;
    }
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

    @Override
    public UUID getUUID() {
        return id;
    }
}
