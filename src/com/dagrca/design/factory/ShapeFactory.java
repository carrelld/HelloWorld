package com.dagrca.design.factory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:58 PM
 * Purpose:
 */
class ShapeFactory {

    // Use getShape method to get object of type shape
    Shape getShape(String shapeType) {
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
