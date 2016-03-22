package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 1:01 PM
 * Purpose:
 */
class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
