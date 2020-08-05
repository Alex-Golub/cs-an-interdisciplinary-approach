package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.11 Write a static method signum() that takes an int argument n and returns
 * -1 if n is less than 0, 0 if n is equal to 0, and +1 if n is greater than 0.
 *
 * Created by ag on 04-Aug-20 10:49 AM
 */
class Ex11_Signum {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
      StdOut.println(signum(StdIn.readInt()));
    }
  }

  public static int signum(int n) {
    return n == 0 ? 0 : n < 0 ? -1 : 1; // Integer.compare(n, 0);
  }
}
