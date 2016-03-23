package com.dagrca.projecteuler;

import java.util.List;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 2:07 PM
 * Purpose: Implement solution to Project Euler problem 3 using a class to
 * do prime factorization
 *
 */
public class p003_2 implements EulerSolution{

    public static void main(String[] args) {
        System.out.println(new p003_2().run());
    }

    @Override
    public String run() {
        PrimeFactors primeFactors = new PrimeFactors(600851475143L);
        List list = primeFactors.getPrimeFactors();
        return list.get(list.size() - 1).toString();
    }
}
