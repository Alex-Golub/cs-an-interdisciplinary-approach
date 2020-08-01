package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.7 Write a program that takes an integer command-line argument n, reads in
 * n-1 distinct integers between 1 and n, and determines the missing value.
 *
 * Created by ag on 30-Jul-20 3:32 PM
 */
class Ex7_Missing_Value {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    StdOut.printf("Enter %d distinct numbers in range 1 - %d\n", n - 1, n);

    int nSum = n * (n + 1) / 2;
    int inputSum = 0;

    for (int i = 0; i < n - 1; i++)
      inputSum += StdIn.readInt();

    StdOut.printf("Missing number is %d", nSum - inputSum);

  }
}

// n = 8
// 8 5 4 3 6 2 1 => 29
// sum 1 - 8 8*9 / 2 = 36
// 36 - 29 = 7
