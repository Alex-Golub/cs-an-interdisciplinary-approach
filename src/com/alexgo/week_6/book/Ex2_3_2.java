package com.alexgo.week_6.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.3.2 Write a recursive function that takes an integer n as its argument and returns ln(n!)
 *
 * Created by ag on 12-Aug-20 4:20 PM
 */
class Ex2_3_2 {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
      int n = StdIn.readInt();
      StdOut.printf("%d! = %f\n", n, lnFactorial(n));
    }
  }

  /**
   * ln(n!) = ln(n * (n-1) * (n-2) * ... * 2 * 1)
   *        = ln(n) + ln(n-1) + ln(n-2) + ... + ln(2) + ln(1)
   */
  public static double lnFactorial(int n) {
    if (n < 0)  return Double.NaN;
    if (n == 0) return Double.NEGATIVE_INFINITY;
    if (n == 1) return 0;
    return Math.log(n) + lnFactorial(n - 1);
  }
}


