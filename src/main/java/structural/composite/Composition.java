package structural.composite;

import structural.composite.shape.Shape;

import java.util.LinkedList;
import java.util.List;

public class Composition implements Shape {

    private List<Shape> shapes = new LinkedList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw() {
        shapes.forEach(Shape::draw);
    }
}
