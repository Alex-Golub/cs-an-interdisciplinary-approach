package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.9 Write a static method lg() that takes a double argument n and returns the
 * base-2 logarithm of n. You may use Java’s Math library.
 *
 * Created by ag on 04-Aug-20 10:18 AM
 */
class Ex9_Log2 {
  public static void main(String[] args) {

    // edge cases
    StdOut.printf("log2(%.2f) = %.2f\n", Double.NaN, lg(Double.NaN));
    StdOut.printf("log2(%.2f) = %.2f\n", Double.POSITIVE_INFINITY, lg(Double.POSITIVE_INFINITY));
    StdOut.printf("log2(%.2f) = %.2f\n\n", Double.NEGATIVE_INFINITY, lg(Double.NEGATIVE_INFINITY));

    for (int i = 1; i <= 5; i++) {
      double rnd = Math.random() * 10;
      StdOut.printf("log2(%.2f) = %.2f\n", rnd, lg(rnd));
    }
  }

  public static double lg(double n) {
    return n <= 0 ? Double.NaN : Math.log(n) / Math.log(2);
  }
}

