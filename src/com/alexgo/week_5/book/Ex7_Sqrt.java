package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.7 Write a static method sqrt() that takes a double argument and returns the
 * square root of that number.
 * Use Newton’s method.
 *
 * Created by ag on 03-Aug-20 6:14 PM
 */
class Ex7_Sqrt {
  public static void main(String[] args) {
    final int TIMES = 10;
    final int LOW = -10, HIGH = 100;

    for (int i = 1; i <= TIMES; i++) {
      double rnd = LOW + Math.random() * (HIGH + 1); // [-10, 90]
      StdOut.printf("sqrt(%.2f) = %.2f\n", rnd, sqrt(rnd));
    }

    System.out.println();

    // edge cases
    StdOut.printf("sqrt(%.2f) = %.2f\n", Double.POSITIVE_INFINITY, sqrt(Double.POSITIVE_INFINITY));
    StdOut.printf("sqrt(%.2f) = %.2f\n", Double.NEGATIVE_INFINITY, sqrt(Double.NEGATIVE_INFINITY));
    StdOut.printf("sqrt(%.2f) = %.2f\n", Double.NaN, sqrt(Double.NaN));
  }

  public static double sqrt(double x) {
    if (x < 0) return Double.NaN;

    double EPSILON = 1e-10; // accurate to 10 decimal places i.e. error tolerance
    double t = x;
    while (Math.abs(t - x / t) > EPSILON * t)
      t = (t + x / t) / 2.0;

    return t;
  }
}