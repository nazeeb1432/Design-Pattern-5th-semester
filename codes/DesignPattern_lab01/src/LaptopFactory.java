public class LaptopFactory extends DeviceFactory{
    @Override
    public Device createDevice(Object... attributes) {
        return new Laptop(attributes);
    }
}
