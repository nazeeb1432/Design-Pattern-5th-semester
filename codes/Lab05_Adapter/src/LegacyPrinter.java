class LegacyPrinter implements LegacyPrinterInterface {
    @Override
    public void printWithLegacySystem(String content) {
        System.out.println("Legacy Printer: Printing document with legacy system -> " + content);
    }
}
