package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.2 Write a static method odd() that takes three boolean arguments and returns
 * true if an odd number of the argument values are true, and false otherwise.
 *
 * Created by ag on 03-Aug-20 5:49 PM
 */
class Ex2_Odd {
  public static void main(String[] args) {

    // uniformly generate 3 random boolean values
    boolean a = Math.random() < 0.3;
    boolean b = Math.random() < 0.6;
    boolean c = Math.random() < 1.0;

    StdOut.printf("(%b, %b, %b) => %b", a, b, c, odd(a, b, c));
  }

  public static boolean odd(boolean a, boolean b, boolean c) {
    int count = 0;
    if (a) count++;
    if (b) count++;
    if (c) count++;

    return count % 2 == 1;
  }
}
