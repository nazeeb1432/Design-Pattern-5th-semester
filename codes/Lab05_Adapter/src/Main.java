//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Modern printer
        ModernPrinterInterface modernPrinter = new ModernPrinter();
        modernPrinter.printDocument("Modern Document");

        // Legacy printer with Object Adapter

        ModernPrinterInterface adapter = new ObjectPrinterAdapter(new LegacyPrinter());
        adapter.printDocument("Legacy Document via Object Adapter");

        // Legacy printer with Class Adapter
        ModernPrinterInterface classAdapter = new ClassPrinterAdapter();
        classAdapter.printDocument("Legacy Document via Class Adapter");
    }
}