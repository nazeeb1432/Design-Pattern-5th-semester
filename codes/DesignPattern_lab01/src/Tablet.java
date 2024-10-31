public class Tablet implements Device{

    private String model;
    private boolean hasPencil;

    public Tablet(Object[] attributes){
        this.model=(String) attributes[0];
        this.hasPencil=(boolean) attributes[1];
    }

    @Override
    public void powerON(){
        System.out.println("Tablet "+this.model+" turning on");
    }

    @Override
    public void powerOff() {
        System.out.println("Tablet "+this.model+" turning off");
    }

    public void read(){
        System.out.println("Reading an ebook in tablet "+this.model+(hasPencil?" With a pencil":"."));//ternary
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "model='" + model + '\'' +
                ", hasPencil=" + hasPencil +
                '}';
    }
}
