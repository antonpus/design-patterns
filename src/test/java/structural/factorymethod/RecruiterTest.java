package structural.factorymethod;


import org.junit.Test;

public class RecruiterTest {

    @Test
    public void howToUseFactoryMethod() {

        new PMLookingRecruiter().runInterview();
        new DevLookingRecruiter().runInterview();
    }
}