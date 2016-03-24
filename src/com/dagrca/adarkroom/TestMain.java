package com.dagrca.adarkroom;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 9:49 PM
 * Purpose: make sure individual components are working as intended
 */
public class TestMain {
    public static void main(String[] args) {
        Fire fire = new Fire();
        Thread burn = new Thread(fire);
        burn.start();
    }
}
