package com.dagrca.moochelsinki;

import java.util.Scanner;

/**
 * User: carrelld
 * Date: 3/24/2016
 * Time: 10:49 AM
 * Purpose:
 */
public class Divider {
    public static void main(String[] args) {
        int num1;
        int num2;
        float div;

        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        num2 = Integer.parseInt(reader.nextLine());

        div = num1 / (float) num2;
        System.out.printf("\nDivision: %d / %d = %.2f", num1, num2, div);
    }
}
