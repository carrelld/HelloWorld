package com.dagrca.design.abstractfactory;

/**
 * Created by carrelld on 3/21/2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method");
    }
}
