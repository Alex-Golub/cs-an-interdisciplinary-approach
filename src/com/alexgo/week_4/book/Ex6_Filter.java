package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.6 Write a filter that reads in a sequence of integers and prints the integers,
 * removing repeated values that appear consecutively. For example, if the input is
 * 1 2 2 1 5 1 1 7 7 7 7 1 1 1 1 1 1 1 1 1, your program should print
 * 1 2 1 5 1 7 1.
 *
 * Created by ag on 30-Jul-20 3:19 PM
 */
class Ex6_Filter {
  public static void main(String[] args) {
    StdOut.println("Enter sequence of numbers (Ctrl-d to stop)");

    int prev = StdIn.readInt();
    String filter = prev + " ";

    while (!StdIn.isEmpty()) {
      int current = StdIn.readInt();

      if (prev != current) {
        filter += current + " ";
        prev = current;
      }

      // same current numbers are ignored
    }

    StdOut.println(filter);
  }
}
