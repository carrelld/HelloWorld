package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 1:00 PM
 * Purpose:
 */
class FactoryProducer {
    static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
