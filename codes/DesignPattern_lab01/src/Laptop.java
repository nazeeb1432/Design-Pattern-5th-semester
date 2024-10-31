public class Laptop implements Device{


    private String model;
    private String gpu;

    public Laptop(Object[] attributes) {
        this.model = (String) attributes[0];
        this.gpu=(String) attributes[1];
    }

    @Override
    public void powerON(){
        System.out.println("Laptop turning on");
    }

    @Override
    public void powerOff() {
        System.out.println("Laptop turning off");
    }

    public void code(){
        System.out.println("Coding in laptop "+this.model);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "model='" + model + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
