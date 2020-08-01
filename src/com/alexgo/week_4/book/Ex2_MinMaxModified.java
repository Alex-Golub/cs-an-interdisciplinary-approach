package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.2 Modify your program from the previous exercise to insist that the integers
 * must be positive (by prompting the user to enter positive integers whenever the
 * value entered is not positive).
 *
 * Created by ag on 29-Jul-20 5:06 PM
 */
class Ex2_MinMaxModified {
  public static void main(String[] args) {
    StdOut.println("Enter positive numbers (Ctrl-d to stop)");

    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    while (!StdIn.isEmpty()) {
      int value = StdIn.readInt();
      if (value < 0) StdOut.println("Only positive values are allowed, try again");
      else {
        if (value > max) max = value;
        if (value < min) min = value;
      }
    }

    StdOut.printf("Maximum #: %d, Minimum #: %d", max, min);
  }
}
