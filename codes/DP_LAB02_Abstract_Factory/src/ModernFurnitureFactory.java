import java.util.UUID;

public class ModernFurnitureFactory implements FurnitureFactory{
    private static volatile ModernFurnitureFactory instance;

    private ModernFurnitureFactory() { }

    public static ModernFurnitureFactory getInstance() {
        if (instance == null) {
            synchronized (ModernFurnitureFactory.class) {
                if (instance == null) {
                    instance = new ModernFurnitureFactory();
                }
            }
        }
        return instance;
    }


    @Override
    public Chair createChair() {
        return new ModernChair(UUID.randomUUID());
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa(UUID.randomUUID());
    }

    @Override
    public Table createTable() {
        return new ModernTable(UUID.randomUUID());
    }
}
