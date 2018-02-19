package creational.abstractfactory;

public class Device implements Product {
    @Override
    public String getType() {
        return Device.class.getSimpleName();
    }
}
