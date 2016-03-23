package com.dagrca.projecteuler;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 12:11 PM
 * Purpose: Solve the project euler problem 1
 *
 * If we list all the natural numbers below 10 that are multiples of
 * 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * THIS CODE IS COPIED FROM GITHUB
 * https://github.com/nayuki/Project-Euler-solutions/blob/master/java/p001.java
 *
 */
public class p001 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new p001().run());
    }

    @Override
    public String run() {

        int sum = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return Integer.toString(sum);
    }

}
