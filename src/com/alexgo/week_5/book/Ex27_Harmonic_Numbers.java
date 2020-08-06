package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.27 Harmonic numbers.
 * Write a program Harmonic that contains three static
 * methods harmoinc(), harmoincSmall(), and harmonicLarge() for computing the harmonic numbers.
 * The harmonicSmall() method should just compute the sum ,
 * the harmonicLarge() method should use the approximation Hn,
 * and the harmonic() method should call harmonicSmall() for n < 100 and harmonicLarge() otherwise.
 *
 * Created by ag on 05-Aug-20 2:30 PM
 */
class Ex27_Harmonic_Numbers {
  public static void main(String[] args) {
    StdOut.printf("H(%d) = %.2f\n", 2, harmonic(2));
    StdOut.printf("H(%d) = %.2f\n", 10, harmonic(10));
    StdOut.printf("H(%d) = %.2f\n", 10_000, harmonic(10_000));
    StdOut.printf("H(%d) = %.2f\n", 1_000_000, harmonic(1_000_000));
  }

  public static double harmonicSmall(int n) {
    double sum = 0.0;
    for (int i = 1; i <= n; i++)
      sum += 1.0 / i;

    return sum;
  }

  public static double harmonicLarge(int n) {
    double EULERS_CONSTANT = 0.577215664901532;
    return Math.log(n) + EULERS_CONSTANT + 1.0 / (2 * n) - 1.0 / (12 * n * n) + 1.0 / (120 * Math.pow(n, 4));
  }

  public static double harmonic(int n) {
    return n < 100 ? harmonicSmall(n) : harmonicLarge(n);
  }
}