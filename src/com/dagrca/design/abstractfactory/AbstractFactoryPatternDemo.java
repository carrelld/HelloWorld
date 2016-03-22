package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:54 PM
 * Purpose:
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {

        // Shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // Get circle object
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // Get Blue object
        Color color1 = colorFactory.getColor("BLUE");
        color1.fill();
    }

}
