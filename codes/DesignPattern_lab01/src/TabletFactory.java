public class TabletFactory extends DeviceFactory {
    @Override
    public Device createDevice(Object... attributes) {
        return new Tablet(attributes);
    }
}
