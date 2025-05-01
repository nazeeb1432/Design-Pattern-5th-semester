import java.util.HashMap;
import java.util.Map;

class ProductRegistry {
    private Map<String, Product> prototypes = new HashMap<>();

    public ProductRegistry() {
        // Adding initial prototypes to the registry
        prototypes.put("BasicClothing", new ClothingProduct("T-Shirt", 19.99, "Black", "M"));
        prototypes.put("BasicElectronics", new ElectronicProduct("Smartphone", 699.99, 128, 24));
    }

    public void addPrototype(String key, Product product) {
        prototypes.put(key, product);
    }

    public Product getPrototype(String key) {
        Product prototype = prototypes.get(key);
        return (prototype != null) ? prototype.copy() : null;
    }

    // Method to show all prototypes with their keys and details
    public void showPrototypes() {
        System.out.println("Product Prototypes:");
        for (Map.Entry<String, Product> entry : prototypes.entrySet()) {
            System.out.print( entry.getKey() + " - ");
            entry.getValue().displayDetails();
        }
    }
}


