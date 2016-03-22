package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 1:00 PM
 * Purpose:
 */
class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        else if (color.equalsIgnoreCase("BLUE")) {
            return new Blue();
        }
        else if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }

        return null;
    }
}
