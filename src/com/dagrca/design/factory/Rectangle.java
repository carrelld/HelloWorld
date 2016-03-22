package com.dagrca.design.factory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:57 PM
 * Purpose:
 */
class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method");
    }
}
