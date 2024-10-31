import java.util.UUID;

public class ModernTable implements Table{

    private String material = "Glass";
    private String color = "Transparent";
    private UUID id;

    public ModernTable(UUID id){
        this.id=id;
    }

    @Override
    public void placeItems() {
        System.out.println("Placing items on a modern coffee table.");
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
