package creational.abstractfactory;

public class DeviceFactory implements ProductFactory {
    @Override
    public Product createProduct() {
        return new Device();
    }

    @Override
    public PriceList createPriceList() {
        return new DevicePriceList();
    }
}
