package com.alexgo.week_4.web;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2. Rainfall problem.
 * Write a program Rainfall.java that reads in nonnegative integers (representing rainfall) one at
 * a time until 999999 is entered, and then prints out the average of value (not including 999999).
 *
 * Created by ag on 02-Aug-20 4:49 PM
 */
class Ex2_Rainfall {
  public static void main(String[] args) {
    int totalRainfalls = 0;
    int counter = 0;

    while (true) {
      int rainfall = StdIn.readInt();

      if (rainfall < 0)        continue; // ignore negative values
      if (rainfall == 999_999) break;

      totalRainfalls += rainfall;
      counter++;
    }

    StdOut.printf("%d / %d = %.2f", totalRainfalls, counter, 1.0 * totalRainfalls / counter);

  }
}
