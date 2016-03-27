package com.dagrca.moochelsinki;

import java.util.Scanner;

/**
 * User: carrelld
 * Date: 3/24/2016
 * Time: 10:54 AM
 * Purpose:
 */
public class Circumference {
    public static void main(String[] args) {
        int radius;
        double circum;

        Scanner reader = new Scanner(System.in);
        System.out.print("Type the radius: ");
        radius = Integer.parseInt(reader.nextLine());

        circum = 2 * radius * Math.PI;
        System.out.printf("\nCircumference of the circle: %f", circum);
    }
}
