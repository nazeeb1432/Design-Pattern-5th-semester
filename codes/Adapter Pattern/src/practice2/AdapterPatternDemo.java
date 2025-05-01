package practice2;

// Step 5: Test the Adapter
public class AdapterPatternDemo {
    public static void main(String[] args) {
        // Adaptee
        Voltage220V voltage220V = new Voltage220V();

        // Adapter
        Voltage5V adapter = new VoltageAdapter(voltage220V);

        // Client
        Device device = new Device();
        device.charge(adapter);//the adapter is being passed to the client
    }
}
