package com.alexgo.week_7.book;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * 4.1.3 Write a program FourSum that reads long integers from standard input, and
 * counts the number of 4-tuples that sum to zero.
 * Use a quadruple nested loop.
 * What is the order of growth of the running time of your program?
 * Estimate the largest input size that your program can handle in an hour.
 * Then, run your program to validate your hypothesis.
 *
 * Created by ag on 19-Aug-20 3:30 PM
 */
class Ex4_1_3_FourSum {
  public static void main(String[] args) {
//    long[] a = StdIn.readAllLongs();

    final int NUM_ELEMENTS = 125;
    long[] a = generateArray(NUM_ELEMENTS);

    long start = System.currentTimeMillis();
    long count = fourSum(a, a.length);
    long end = System.currentTimeMillis();

    StdOut.printf("%d (%.2f seconds)\n", count, (end - start) / 1000.0);

    //    N     T(N) (seconds)    T(N)/T(N/2)
    //  123               0.03
    //  250               0.42    0.42/0.03 = 14
    //  500               5.62    13.38
    // 1000              80.01    14.23
    // 2000     80.01(14)=1120    13.99

    // => order of growth is:
    // lg14 = x => 2^x
    // ~= 14 ~=x = 3... => n^3

    // in an hour (3600sec)
    // => n^3 ~= 3600
    // => n = cbrt(3600) ~= 15.32
    // 15.32^3 = 3595 elements are required for our program to run for one-hour
  }

  private static long[] generateArray(int size) {
    long[] a = new long[size];
    for (int i = 0; i < size; i++)
      a[i] = StdRandom.uniform(-1_000_000, 1_000_001); // [-1,000,000, 1,000,000]
    return a;
  }

  private static long fourSum(long[] a, int n) {
    long count = 0;
    for (int i = 0; i < n; i++)                 // n
      for (int j = i + 1; j < n; j++)           // n - 1
        for (int k = j + 1; k < n; k++)         // n - 2
          for (int l = k + 1; l < n; l++)       // n - 3 => n(n-1)(n-2)(n-3) ~n^4 where n is size of input
            if (a[i] + a[j] + a[k] + a[l] == 0)
              count++;

    return count;
  }
}
