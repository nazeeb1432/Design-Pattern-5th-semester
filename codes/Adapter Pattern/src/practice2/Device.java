package practice2;


class Device {
    public void charge(Voltage5V voltage) {
        int providedVoltage = voltage.provide5v();
        if (providedVoltage == 5) {
            System.out.println("Device is charging with 5V.");
        } else {
            System.out.println("Cannot charge. Incorrect voltage: " + providedVoltage + "V.");
        }
    }
}
