package com.dagrca.projecteuler;

/**
 * User: carrelld
 * Date: 3/23/2016
 * Time: 12:17 PM
 * Purpose: Interface to help with testing all solutions
 */

/**
 * Interface for Project Euler Java solutions
 * by Project Nayuki
 *
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 */


// This forces every solution class to implement a common interface,
// which is helpful for unit testing like in the EulerTest implementation.

public interface EulerSolution {
    public String run();
}
