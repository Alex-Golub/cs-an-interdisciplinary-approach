package com.alexgo.week_3.web;

/**
 * 2. Above average.
 * 90% of incoming college students rate themselves as above average.
 * Write a program AboveAverage.java that takes a command-line argument n,
 * reads in n integers from standard input, and prints the fraction of values
 * that are strictly above the average value.
 *
 * javac Ex2_AboveAverage.class
 * java Ex2_AboveAverage n a1 a2 a3 a4 ... an
 *
 * java Ex2_AboveAverage 5 98 89 80 85 100
 * 98 89 80 85 100
 * Average 90.4
 * 98
 * 100
 *
 * Created by ag on 27-Jul-20 11:57 AM
 */
class Ex2_AboveAverage {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // Store values, and calculate sum
    int[] values = new int[n];
    int sum = 0;
    for (int i = 0; i < args.length - 1; i++) {
      values[i] = Integer.parseInt(args[i + 1]);
      sum += values[i];
    }

    // Print values
    for (int val : values)
      System.out.print(val + " ");

    double average = 1.0 * sum / n;
    System.out.println("\nAverage " + average);

    // Print values that are strictly above average
    for (int val : values)
      if (val > average)
        System.out.println(val);
  }
}
