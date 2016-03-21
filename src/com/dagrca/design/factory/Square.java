package com.dagrca.design.factory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method");
    }
}
