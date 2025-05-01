import java.util.UUID;

public class ModernSofa implements Sofa{

    private String material = "Leather";
    private String color = "Black";
    private UUID id;

    public ModernSofa(UUID id){
        this.id=id;
    }

    @Override
    public void lieOn() {
        System.out.println("Lying on a modern sofa.");
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
        System.out.println("Modern sofa reclined.");
    }

    @Override
    public UUID getUUID() {
        return id;
    }
}
