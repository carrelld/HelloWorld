package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:55 PM
 * Purpose:
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Insdie Circle::draw() method");
    }
}
