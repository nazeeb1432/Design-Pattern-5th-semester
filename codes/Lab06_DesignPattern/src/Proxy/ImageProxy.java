package Proxy;

class ImageProxy implements Image {
    private HighResolutionImage highResImage;
    private String filename;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (highResImage == null) {
            highResImage = new HighResolutionImage(filename);
        }
        highResImage.display();
    }

    @Override
    public String getFilename() {
        return filename;
    }
}
