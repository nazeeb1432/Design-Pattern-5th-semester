class ModernPrinter implements ModernPrinterInterface {
    @Override
    public void printDocument(String content) {
        System.out.println("Modern Printer: Printing document -> " + content);
    }
}