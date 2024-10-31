public class SmartPhone implements Device{

    private String model;
    private String phoneNumber;

    public SmartPhone(Object[] attributes) {
        this.model = (String)attributes[0];
        this.phoneNumber = (String)attributes[1];
    }

    @Override
    public void powerON(){
        System.out.println("Smartphone "+this.model+ " turning on");
    }

    @Override
    public void powerOff() {
        System.out.println("Smartphone "+this.model+ " turning Off");
    }

    public void call(){
        System.out.println("Phone is calling with number: "+this.phoneNumber);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "model='" + model + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
