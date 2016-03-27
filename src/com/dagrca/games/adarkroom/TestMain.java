package com.dagrca.games.adarkroom;

import java.util.Scanner;

/**
 * User: dave
 * Date: 3/23/2016
 * Time: 9:49 PM
 * Purpose: make sure individual components are working as intended
 */
public class TestMain {
    public static void main(String[] args) {
        Timer timer = new Timer("Test");
        Thread t_timer = new Thread(timer);
        t_timer.start();

        String a = "";
        while (!a.equalsIgnoreCase("END")) {
            Scanner in = new Scanner(System.in);
            a = in.nextLine();
            System.out.println(a);
        }
    }
}
