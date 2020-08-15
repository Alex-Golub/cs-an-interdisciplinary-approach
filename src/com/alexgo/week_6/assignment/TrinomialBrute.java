package com.alexgo.week_6.assignment;

import edu.princeton.cs.algs4.StdOut;

/**
 * 1. Trinomial coefficients (brute force).
 * Write a program TrinomialBrute.java that takes two integer command-line arguments n and k
 * and computes the corresponding trinomial coefficient.
 *
 * Created by ag on 15-Aug-20 3:49 PM
 */
public class TrinomialBrute {
  // Returns the trinomial coefficient T(n, k).
  // This approach is hopeless slow for moderately large values of n and k.
  public static long trinomial(int n, int k) {
    if (n == 0 && k == 0) return 1;
    if (k < -n || k > n)  return 0;
    return trinomial(n - 1, k - 1) + trinomial(n - 1, k) + trinomial(n - 1, k + 1);
  }

  // Takes two integer command-line arguments n and k and prints T(n, k).
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);
    StdOut.println(trinomial(n, k));
  }
}
