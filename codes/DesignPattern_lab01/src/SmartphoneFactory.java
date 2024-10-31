public class SmartphoneFactory extends DeviceFactory{
    @Override
    public Device createDevice(Object... model) {
        return new SmartPhone(model);
    }


}
