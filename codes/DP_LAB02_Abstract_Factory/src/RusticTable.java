import java.util.UUID;

public class RusticTable implements Table{

    private String material = "Stone and Wood";
    private String color = "Grey and Brown";
    private UUID id;

    public RusticTable(UUID id){
        this.id=id;
    }


    @Override
    public void placeItems() {
        System.out.println("Placing items on a rustic coffee table.");
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
