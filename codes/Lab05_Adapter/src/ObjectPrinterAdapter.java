class ObjectPrinterAdapter implements ModernPrinterInterface {
    private final LegacyPrinterInterface legacyPrinter;

    public ObjectPrinterAdapter(LegacyPrinterInterface legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void printDocument(String content) {
        // Delegates the print request to the legacy printer’s method
        legacyPrinter.printWithLegacySystem(content);
    }
}
