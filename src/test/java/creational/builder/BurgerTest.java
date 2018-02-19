package creational.builder;

import org.junit.Test;

public class BurgerTest {

    @Test
    public void builderApi() {

        new Burger.BurgerBuilder()
                .addBread(true)
                .addCheese(true)
                .addTomato(true)
                .build();
    }
}