package com.alexgo.week_2.assignment;

/**
 * 1. Generalized harmonic numbers.
 * Write a program GeneralizedHarmonic.java that takes two integer command-line arguments n and r
 * and uses a for loop to compute the nth generalized harmonic number of order r,
 * which is defined by the following formula:
 *
 * Note: you may assume that n is a positive integer.
 *
 * The generalized harmonic numbers are closely related to the Riemann zeta function,
 * which plays a central role in number theory.
 *
 * Created by ag on 16-Jul-20 5:06 PM
 */
public class GeneralizedHarmonic {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int r = Integer.parseInt(args[1]);

    double ghn = 0.0;
    for (int i = 1; i <= n; i++) {
      ghn += 1 / Math.pow(i, r);
    }

    System.out.println(ghn);
  }
}
