package creational.simplefactory;

import org.apache.commons.lang3.RandomStringUtils;

public class ProductFactory {

    public static Product createProduct() {
        return new Device(generateId());
    }

    private static String generateId() {
        return RandomStringUtils.randomAlphabetic(10);
    }
}
