package com.dagrca.projecteuler;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 12:39 PM
 * Purpose: Solve project Euler problem 3
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 *
 *
 *
 */
public class p003 implements EulerSolution {

    public static void main(String[] args) {
        System.out.println(new p003().run());
    }

    @Override
    public String run() {
        long num = 600851475143L;

        while(true) {
            long primeFactor = findFactor(num);
            if (primeFactor < num) {
                num /= primeFactor;
            } else {
                return Long.toString(num);
            }
        }
    }

    public long findFactor(long num) {
        // Check 2 before checking all odds
        if (num % 2 == 0) {
            return 2;
        }
        // Check all odds up to sqrt of num
        for (long i = 3, uBound = (long) Math.sqrt(num); i < uBound; i += 2) {
            if (num % i == 0) {
                return i;
            }
        }
        // Otherwise num is already prime
        return num;
    }
}
