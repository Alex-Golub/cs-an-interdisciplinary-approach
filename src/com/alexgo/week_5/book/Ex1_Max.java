package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.1 Write a static method max3() that takes three int arguments and returns
 * the value of the largest one. Add an overloaded function that does the same thing
 * with three double values.
 *
 * Created by ag on 03-Aug-20 5:40 PM
 */
class Ex1_Max {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
//      int a = StdIn.readInt();
//      int b = StdIn.readInt();
//      int c = StdIn.readInt();

//      StdOut.printf("Max from (%d, %d, %d) is %d\n", a, b, c, max3(a, b, c));

      double a = StdIn.readDouble();
      double b = StdIn.readDouble();
      double c = StdIn.readDouble();

      StdOut.printf("Max from (%.2f, %.2f, %.2f) is %.2f\n", a, b, c, max3(a, b, c));
    }

  }

  public static int max3(int a, int b, int c) {
    return Math.max(a, Math.max(b, c));
  }

  public static double max3(double a, double b, double c) {
    return Math.max(a, Math.max(b, c));
  }
}
