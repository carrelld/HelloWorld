package com.dagrca.moochelsinki;

import java.util.Scanner;

/**
 * User: carrelld
 * Date: 3/24/2016
 * Time: 11:06 AM
 * Purpose: Create a program that gives the course grade based on the following table.
 */
public class Ex018 {
    public static void main(String[] args) {
        int score = -1;
        String grade;

        Scanner reader = new Scanner(System.in);
        while (score < 0 || score > 60) {
            System.out.print("Type the points [0-60]: ");
            score = Integer.parseInt(reader.nextLine());
        }

        if (score < 30) {
            grade = "failed";
        } else if (score < 35) {
            grade = "1";
        } else if (score < 40) {
            grade = "2";
        } else if (score < 45) {
            grade = "3";
        } else if (score < 50) {
            grade = "4";
        } else {
            grade = "5";
        }

        System.out.println("Grade: " + grade);
    }
}
