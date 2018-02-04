package structural.abstractfactory;

import org.junit.Test;

public class ProductFactoryTest {

    @Test
    public void clientApi() {

        ProductFactory deviceFactory = new DeviceFactory();

        deviceFactory.createProduct();
        deviceFactory.createPriceList();
    }
}