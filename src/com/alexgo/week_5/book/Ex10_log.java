package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.10 Write a static method lg() that takes an int argument n and returns the
 * largest integer not larger than the base-2 logarithm of n.
 * Do not use the Math library.
 *
 * Created by ag on 04-Aug-20 10:29 AM
 */
class Ex10_log {
  public static void main(String[] args) {
    StdOut.println(lg(8));
    StdOut.println(lg(7));
    StdOut.println(lg(3));
  }

  public static int lg(int n) {
    if (n <= 0) return Integer.MIN_VALUE;
    int powers = 1, i = 0;
    while (powers < n) {
      powers *= 2;
      i++;
    }

    return powers == n ? i - 1 : i - 2;

  }
}
