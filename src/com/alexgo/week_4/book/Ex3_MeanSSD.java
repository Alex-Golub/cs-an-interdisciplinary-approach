package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.3 Write a program that takes an integer command-line argument n, reads n
 * floating-point numbers from standard input, and prints their mean (average value)
 * and sample standard deviation.
 *
 * Created by ag on 29-Jul-20 5:12 PM
 */
class Ex3_MeanSSD {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    double sum = 0;
    double squaresSum = 0;
    StdOut.printf("Enter %d floating-point #'s\n", n);

    for (int i = 0; i < n; i++) {
      double value = StdIn.readDouble();
      sum += value;
      squaresSum += Math.pow(value, 2);
    }

    double mean = sum / n;
    double ssd = Math.sqrt((squaresSum - 2 * mean * sum + n * Math.pow(mean, 2)) / (n - 1)); // simplification
    StdOut.printf("mean = %.2f, sample standard deviation = %.2f", mean, ssd);
  }
}
