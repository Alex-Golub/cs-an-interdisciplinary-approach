package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.1 Write a program that reads in integers (as many as the user enters) from
 * standard input and prints the maximum and minimum values.
 *
 * Created by ag on 29-Jul-20 4:58 PM
 */
class Ex1_MinMax {
  public static void main(String[] args) {
    StdOut.print("Enter numbers (Ctrl-d to stop): ");
    int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

    while (!StdIn.isEmpty()) {
      int num = StdIn.readInt();
      if (num > max) max = num;
      if (num < min) min = num;
    }

    StdOut.printf("Maximum #: %d, Minimum #: %d", max, min);

  }
}
