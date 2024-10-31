import java.util.UUID;

public class VictorianSofa implements Sofa{

    private String material = "Velvet";
    private String color = "Red";
    private UUID id;

    public VictorianSofa(UUID id){
        this.id=id;
    }

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

    @Override
    public UUID getUUID() {
        return this.id;
    }
}
