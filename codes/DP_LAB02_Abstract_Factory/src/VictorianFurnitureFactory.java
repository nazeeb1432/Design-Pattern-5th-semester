import java.util.UUID;

public class VictorianFurnitureFactory implements FurnitureFactory{

    private static volatile VictorianFurnitureFactory instance;

    private VictorianFurnitureFactory() { }

    public static VictorianFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (VictorianFurnitureFactory.class) {
                if (instance == null) {
                    instance = new VictorianFurnitureFactory();
                }
            }
        }
        return instance;
    }



    @Override
    public Chair createChair() {
        return new VictorianChair(UUID.randomUUID());
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa(UUID.randomUUID());
    }

    @Override
    public Table createTable() {
        return new VictorianTable(UUID.randomUUID());
    }
}
