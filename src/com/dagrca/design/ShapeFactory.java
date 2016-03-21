package com.dagrca.design;

/**
 * Created by carrelld on 3/21/2016.
 */
public class ShapeFactory {

    // Use getShape method to get object of type shape
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
