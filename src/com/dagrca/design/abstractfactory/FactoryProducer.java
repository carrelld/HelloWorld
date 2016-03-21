package com.dagrca.design.abstractfactory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {

        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        else if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }

        return null;
    }
}
