package com.dagrca.moochelsinki;

import java.util.Scanner;

/**
 * User: carrelld
 * Date: 3/24/2016
 * Time: 10:40 AM
 * Purpose:  Exercise 8: Program that asks user for 2 ints and prints their sum
 */
public class Adder {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());

        sum = num1 + num2;
        System.out.println("\nSum of the number: " + sum);
    }
}
