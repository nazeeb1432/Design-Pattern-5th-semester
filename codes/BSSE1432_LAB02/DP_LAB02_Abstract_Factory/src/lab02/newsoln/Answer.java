package lab02.newsoln;

// Abstract Factory Pattern
// Define Furniture interfaces
interface Chair {
    void sitOn();
}

interface Table {
    void use();
}

interface Sofa {
    void lieOn();
}

// Implement Modern style
class ModernChair implements Chair {
    private final int id;
    public ModernChair(int id) { this.id = id; }
    public void sitOn() {
        System.out.println("Sitting on a Modern Chair with ID: " + id);
    }
}

class ModernTable implements Table {
    private final int id;
    public ModernTable(int id) { this.id = id; }
    public void use() {
        System.out.println("Using a Modern Table with ID: " + id);
    }
}

class ModernSofa implements Sofa {
    private final int id;
    public ModernSofa(int id) { this.id = id; }
    public void lieOn() {
        System.out.println("Lying on a Modern Sofa with ID: " + id);
    }
}

// Implement Victorian style
class VictorianChair implements Chair {
    private final int id;
    public VictorianChair(int id) { this.id = id; }
    public void sitOn() {
        System.out.println("Sitting on a Victorian Chair with ID: " + id);
    }
}

class VictorianTable implements Table {
    private final int id;
    public VictorianTable(int id) { this.id = id; }
    public void use() {
        System.out.println("Using a Victorian Table with ID: " + id);
    }
}

class VictorianSofa implements Sofa {
    private final int id;
    public VictorianSofa(int id) { this.id = id; }
    public void lieOn() {
        System.out.println("Lying on a Victorian Sofa with ID: " + id);
    }
}

// Implement Rustic style
class RusticChair implements Chair {
    private final int id;
    public RusticChair(int id) { this.id = id; }
    public void sitOn() {
        System.out.println("Sitting on a Rustic Chair with ID: " + id);
    }
}

class RusticTable implements Table {
    private final int id;
    public RusticTable(int id) { this.id = id; }
    public void use() {
        System.out.println("Using a Rustic Table with ID: " + id);
    }
}

class RusticSofa implements Sofa {
    private final int id;
    public RusticSofa(int id) { this.id = id; }
    public void lieOn() {
        System.out.println("Lying on a Rustic Sofa with ID: " + id);
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Table createTable();
    Sofa createSofa();
}

// Singleton Factory Manager for generating unique IDs
class IDManager {
    private static IDManager instance;
    private int currentID = 0;

    private IDManager() {}

    public static synchronized IDManager getInstance() {
        if (instance == null) {
            instance = new IDManager();
        }
        return instance;
    }

    public synchronized int getNextID() {
        return ++currentID;
    }
}

// Concrete Factories
class ModernFurnitureFactory implements FurnitureFactory {
    private final IDManager idManager = IDManager.getInstance();
    public Chair createChair() {
        return new ModernChair(idManager.getNextID());
    }
    public Table createTable() {
        return new ModernTable(idManager.getNextID());
    }
    public Sofa createSofa() {
        return new ModernSofa(idManager.getNextID());
    }
}

class VictorianFurnitureFactory implements FurnitureFactory {
    private final IDManager idManager = IDManager.getInstance();
    public Chair createChair() {
        return new VictorianChair(idManager.getNextID());
    }
    public Table createTable() {
        return new VictorianTable(idManager.getNextID());
    }
    public Sofa createSofa() {
        return new VictorianSofa(idManager.getNextID());
    }
}

class RusticFurnitureFactory implements FurnitureFactory {
    private final IDManager idManager = IDManager.getInstance();
    public Chair createChair() {
        return new RusticChair(idManager.getNextID());
    }
    public Table createTable() {
        return new RusticTable(idManager.getNextID());
    }
    public Sofa createSofa() {
        return new RusticSofa(idManager.getNextID());
    }
}

// Client
public class AbstractFactoryWithSingletonDemo {
    public static void main(String[] args) {
        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        FurnitureFactory rusticFactory = new RusticFurnitureFactory();

        // Creating Modern Furniture
        Chair modernChair = modernFactory.createChair();
        Table modernTable = modernFactory.createTable();
        Sofa modernSofa = modernFactory.createSofa();

        // Creating Victorian Furniture
        Chair victorianChair = victorianFactory.createChair();
        Table victorianTable = victorianFactory.createTable();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Creating Rustic Furniture
        Chair rusticChair = rusticFactory.createChair();
        Table rusticTable = rusticFactory.createTable();
        Sofa rusticSofa = rusticFactory.createSofa();

        // Using the furniture
        modernChair.sitOn();
        modernTable.use();
        modernSofa.lieOn();

        victorianChair.sitOn();
        victorianTable.use();
        victorianSofa.lieOn();

        rusticChair.sitOn();
        rusticTable.use();
        rusticSofa.lieOn();
    }
}
