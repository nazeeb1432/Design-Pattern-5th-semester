import java.util.UUID;

public class RusticChair implements Chair{

    private String material = "Reclaimed Wood";
    private String color = "Natural Brown";
    private UUID id;

    public RusticChair(UUID id){
        this.id=id;
    }


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

    @Override
    public UUID getUUID() {
        return this.id;
    }
}
