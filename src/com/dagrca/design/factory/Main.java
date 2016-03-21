package com.dagrca.design.factory;

public class Main {

    public static void main(String[] args) {
//	    System.out.println("Hello World!");

        ShapeFactory shapeFactory = new ShapeFactory();

        // Get an object of [type]
        Shape shape1 = shapeFactory.getShape("circle");
        Shape shape2 = shapeFactory.getShape("square");
        Shape shape3 = shapeFactory.getShape("Rectangle");

        // Call the draw methods of each
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}
