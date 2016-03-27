package com.dagrca.moochelsinki;

import java.util.Scanner;

/**
 * User: carrelld
 * Date: 3/24/2016
 * Time: 11:14 AM
 * Purpose: Create a program that checks whether the given year is a leap year.
 */
public class Ex021 {
    public static void main(String[] args) {
        int year;

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a year: ");
        year = Integer.parseInt(reader.nextLine());

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("The year is a leap year.");
        } else if (year % 400 == 0) {
            System.out.println("The year is a leap year.");
        } else {
            System.out.println("The year is not a leap year.");
        }
    }
}
