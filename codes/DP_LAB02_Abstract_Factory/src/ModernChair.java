import java.util.UUID;

public class ModernChair implements Chair{
    private String material = "Plastic";
    private String color = "White";// Default height
    private UUID id;

    public ModernChair(UUID id) {
        this.id = id;
    }
    @Override
    public void sitOn() {
        System.out.println("Sitting on a modern chair.");
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
