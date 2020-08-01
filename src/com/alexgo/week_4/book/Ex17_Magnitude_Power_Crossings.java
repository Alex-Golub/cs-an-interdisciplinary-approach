package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.17 Write a program that reads in a sequence of real numbers between -1 and
 * +1 and prints their average magnitude, average power, and the number of zero
 * crossings.
 * The average magnitude is the average of the absolute values of the data values.
 * The average power is the average of the squares of the data values.
 * The number of zero crossings is the number of times a data value transitions from a strictly
 * negative number to a strictly positive number, or vice versa.
 * These three statistics are widely used to analyze digital signals.
 *
 * Created by ag on 31-Jul-20 10:47 AM
 */
class Ex17_Magnitude_Power_Crossings {
  public static void main(String[] args) {
    final int FROM = -1;
    final int TO = 1;
    StdOut.printf("Enter sequence of #'s in range [%d, %d] (Ctrl-d to stop)\n", FROM, TO);

    double prevNumber = StdIn.readDouble();
    double absSum = Math.abs(prevNumber) > TO ? 0.0 : prevNumber;
    double squaresSum = Math.abs(prevNumber) > TO ? 0.0 : prevNumber * prevNumber;
    int zeroCrossings = 0;
    int numsCounter = 1;

    while (!StdIn.isEmpty()) {
      double value = StdIn.readDouble();
      if (Math.abs(value) > TO) continue; // out of range values are skipped

      absSum += Math.abs(value);
      squaresSum += value * value;
      zeroCrossings += (prevNumber > 0 && value < 0 || prevNumber < 0 && value > 0) ? 1 : 0;
      numsCounter++;
      prevNumber = value;
    }

    StdOut.printf("average magnitude = %.3f\naverage power = %.3f\nzero crossings = %d",
            absSum / numsCounter, squaresSum / numsCounter, zeroCrossings);
  }
}
