class ClassPrinterAdapter extends LegacyPrinter implements ModernPrinterInterface {
    @Override
    public void printDocument(String content) {
        // Directly calls the legacy print method as it's inherited
        printWithLegacySystem(content);
    }
}