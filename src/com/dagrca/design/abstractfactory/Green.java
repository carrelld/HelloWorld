package com.dagrca.design.abstractfactory;

/**
 * User: carrelld
 * Date: 3/21/2016
 * Time: 12:51 PM
 * Purpose:
 */
class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}
