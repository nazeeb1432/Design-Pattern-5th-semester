package practice2;

public class VoltageAdapter implements Voltage5V{
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V=voltage220V;
    }

    @Override
    public int provide5v(){
        int inputVoltage=voltage220V.provide220v();
        int convertedVoltage=inputVoltage/44;

        System.out.println("Converted to " + convertedVoltage + "V.");
        return convertedVoltage;
    }
}
