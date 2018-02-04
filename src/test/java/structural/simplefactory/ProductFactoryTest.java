package structural.simplefactory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ProductFactoryTest {

    @Test
    public void createProduct_ProductShouldNotBeNull_WhenUsingFactory() {

        Product product = ProductFactory.createProduct();

        assertNotNull(product);
    }
}