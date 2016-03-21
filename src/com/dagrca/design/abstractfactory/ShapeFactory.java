package com.dagrca.design.abstractfactory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    Color getColor(String color) {
        return null;
    }

    @Override
    Shape getShape(String shape) {

        if (shape == null) {
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if (shape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        else if (shape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;

    }
}
