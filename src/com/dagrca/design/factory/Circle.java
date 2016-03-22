package com.dagrca.design.factory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:58 PM
 * Purpose:
 */
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Inside the Circle::draw() method");
    }
}
