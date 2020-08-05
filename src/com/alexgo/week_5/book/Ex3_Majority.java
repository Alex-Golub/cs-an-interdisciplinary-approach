package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.3 Write a static method majority() that takes three boolean arguments and
 * returns true if at least two of the argument values are true, and false otherwise.
 * Do not use an if statement.
 *
 * Created by ag on 03-Aug-20 5:56 PM
 */
class Ex3_Majority {
  public static void main(String[] args) {

    // uniformly generate 3 random boolean values
    boolean a = Math.random() < 0.3;
    boolean b = Math.random() < 0.6;
    boolean c = Math.random() < 1.0;

    StdOut.printf("(%b, %b, %b) => %b", a, b, c, majority(a, b, c));
  }

  public static boolean majority(boolean a, boolean b, boolean c) {
    return a && b || a && c || b && c;
  }
}
