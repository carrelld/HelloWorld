package com.dagrca.design.abstractfactory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Insdie Circle::draw() method");
    }
}
