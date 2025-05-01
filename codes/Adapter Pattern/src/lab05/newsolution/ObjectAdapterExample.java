package lab05.newsolution;

// Step 1: Define the Target Interface (Modern Printing System)
interface Printer {
    void print(String document);
}

// Step 2: Create a Modern Printer that implements the Target Interface
class ModernPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Modern Printer is printing: " + document);
    }
}

// Step 3: Create the Adaptee (Legacy Printer with an outdated method)
class LegacyPrinter {
    public void legacyPrint(String text) {
        System.out.println("Legacy Printer is printing: " + text);
    }
}

// Step 4: Create the Adapter (Object Adapter)
class PrinterAdapter implements Printer {
    private LegacyPrinter legacyPrinter;

    // Constructor to wrap the Adaptee
    public PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String document) {
        // Delegate to the legacy print method
        legacyPrinter.legacyPrint(document);
    }
}

// Step 5: Test the Object Adapter
public class ObjectAdapterDemo {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        modernPrinter.print("Document 1");

        LegacyPrinter legacyPrinter = new LegacyPrinter();
        Printer adapter = new PrinterAdapter(legacyPrinter);
        adapter.print("Document 2");
    }
}
//class Adapter:
// Step 1: Define the Target Interface (Modern Printing System)
interface Printer {
    void print(String document);
}

// Step 2: Create a Modern Printer that implements the Target Interface
class ModernPrinter implements Printer {
    @Override
    public void print(String document) {
        System.out.println("Modern Printer is printing: " + document);
    }
}

// Step 3: Create the Adaptee (Legacy Printer with an outdated method)
class LegacyPrinter {
    public void legacyPrint(String text) {
        System.out.println("Legacy Printer is printing: " + text);
    }
}

// Step 4: Create the Adapter (Class Adapter)
class PrinterClassAdapter extends LegacyPrinter implements Printer {
    @Override
    public void print(String document) {
        // Directly call the legacy print method
        legacyPrint(document);
    }
}

// Step 5: Test the Class Adapter
public class ClassAdapterDemo {
    public static void main(String[] args) {
        Printer modernPrinter = new ModernPrinter();
        modernPrinter.print("Document 1");

        Printer adapter = new PrinterClassAdapter();
        adapter.print("Document 2");
    }
}

