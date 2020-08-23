package com.alexgo.week_7.assignment;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2. Ramanujan numbers.
 * An integer n is a Ramanujan number if can be expressed as the sum of two positive cubes in two different ways.
 * That is, there are four distinct positive integers a, b, c, and d such that n = a^3 + b^3 = c^3 + d^3.
 * For example 1729 = 13+123 = 93+103.
 * Write a program Ramanujan.java that takes a long integer command-line argument n and prints true if it is a
 * Ramanujan number, and false otherwise.
 *
 * NOTE: Your program should take time proportional to n^1/3 in the worst case.
 * It should be fast enough to process any 64-bit long integer in a fraction of a second.
 *
 * Created by ag on 23-Aug-20 1:03 PM
 */
public class Ramanujan {
  // Is n a Ramanujan number?
  // Consider all values less then n^1/3.
  // Using two indices check whether n-(i^3 + j^3) == 0 ? we have a pair (i,j)
  // otherwise if differance is negative then decreases j
  // else differance is positive increase i
  public static boolean isRamanujan(long n) {
    long i = 0;
    long j = (long) Math.cbrt(n);
    int pairs = 0;
    while (i < j) {
      long prod = i * i * i + j * j * j;
      long diff = n - prod;

      if (diff == 0) {
        pairs++;
//        System.out.printf("%d^3 + %d^3 = %d\n", i, j, n); // print pairs
        i++;
        j--;
      } else
        if (diff < 0) j--;
        else          i++;
    }

    return pairs >= 2; // to be Ramanujan number we must have at-least 2 distinct pairs
  }

  // Takes a long integer command-line arguments n and prints true if
  // n is a Ramanujan number, and false otherwise.
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]);
    StdOut.println(isRamanujan(n));

    // Ramanujan numbers range [0, TIMES)
//    final int TIMES = 9_000_000;
//    for (int i = 0; i < TIMES; i++)
//      if (isRamanujan(i))
//        StdOut.printf("%,d\n", i);
  }
}
