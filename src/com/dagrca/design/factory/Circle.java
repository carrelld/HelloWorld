package com.dagrca.design.factory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside the Circle::draw() method");
    }
}
