package com.dagrca.design.abstractfactory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method");
    }
}
