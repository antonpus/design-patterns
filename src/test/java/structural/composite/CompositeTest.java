package structural.composite;

import org.junit.Test;
import structural.composite.shape.Circle;
import structural.composite.shape.Rectangle;

public class CompositeTest {

    @Test
    public void compositeApi() {

        Composition composition = new Composition();
        composition.addShape(new Circle());
        composition.addShape(new Rectangle());

        composition.draw();
    }
}