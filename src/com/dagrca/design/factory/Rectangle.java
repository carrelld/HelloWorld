package com.dagrca.design.factory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
