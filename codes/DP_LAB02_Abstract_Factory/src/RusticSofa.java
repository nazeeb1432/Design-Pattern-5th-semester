import java.util.UUID;

public class RusticSofa implements Sofa{

    private String material = "Leather and Burlap";
    private String color = "Tan";
    private UUID id;

    public RusticSofa(UUID id){
        this.id=id;
    }

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

    @Override
    public UUID getUUID() {
        return this.id;
    }
}
