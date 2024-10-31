import java.util.UUID;

public class VictorianTable implements Table{

    private String material = "Wood";
    private String color = "Dark Brown";
    private UUID id;

    public VictorianTable(UUID id){
        this.id=id;
    }


    @Override
    public void placeItems() {
        System.out.println("Placing items on a Victorian coffee table.");
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
