package com.dagrca.projecteuler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 1:41 PM
 * Purpose: Generate list of prime factors for a given number
 */
public class PrimeFactors {

    private long number;
    private List<Long> primeFactors = new ArrayList<Long>();

    public PrimeFactors(long number) {
        this.number = number;
        this.findFactors();
    }

    private void findFactors() {
        long number = this.number;
        long p = 0;
        while(p < number) {
            p = this.getFactor(number);
            this.primeFactors.add(p);
            number /= p;
        }
    }

    private long getFactor(long number) {
        // Check 2 before checking all odds
        if (number % 2 == 0) {
            return 2;
        }
        // Check all odds up to sqrt of number
        for (long divisor = 3, uBound = (long) Math.sqrt(number); divisor < uBound; divisor += 2) {
            if (number % divisor == 0) {
                return divisor;
            }
        }
        // Otherwise number is already prime
        return number;
    }

    public List getPrimeFactors() {
//        for (Long i : this.primeFactors) {
//            System.out.println(i);
//        }

        return this.primeFactors;
    }

    public long getNumber() {
        return this.number;
    }
}
