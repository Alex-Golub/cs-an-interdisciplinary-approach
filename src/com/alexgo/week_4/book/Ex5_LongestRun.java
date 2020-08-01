package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.5 Write a program that reads in a sequence of integers and prints both the
 * integer that appears in a longest consecutive run and the length of that run. For
 * example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1, then your program should
 * print Longest run: 4 consecutive 7s.
 *
 * Created by ag on 29-Jul-20 5:50 PM
 */
class Ex5_LongestRun {
  public static void main(String[] args) {
    StdOut.println("Enter sequence of numbers (Ctrl-d to stop)");

    int current = StdIn.readInt();
    int currentLength = 1;
    int maxNumSoFar = current;
    int maxLenSoFar = currentLength;

    while (!StdIn.isEmpty()) {
      int value = StdIn.readInt();

      if (value != current) { // run of current number is over

        // check if length of current number is longer the maximum length so far
        if (maxLenSoFar < currentLength) {
          maxNumSoFar = current;
          maxLenSoFar = currentLength;
        }

        current = value;
        currentLength = 1;
      } else {
        currentLength++;
      }
    }

    StdOut.printf("Longest run: %d consecutive %ds",
            Math.max(currentLength, maxLenSoFar), Math.max(current, maxNumSoFar));
  }
}
