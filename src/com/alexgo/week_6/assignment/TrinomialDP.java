package com.alexgo.week_6.assignment;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2. Trinomial coefficients (dynamic programming).
 * Write a program TrinomialDP.java that takes two integer command-line arguments n and k
 * and computes the trinomial coefficient T(n,k) using dynamic programming.
 * This version should be fast enough to handle larger values of n and k.
 *
 * Created by ag on 15-Aug-20 3:55 PM
 */
public class TrinomialDP {

  // Returns the trinomial coefficient T(n, k).
  public static long trinomial(int n, int k) {
    if (n == 0 && k == 0) return 1;
    if (k < -n || k > n)  return 0;

    long[][] coefficients = new long[n + 1][n + 1];
    coefficients[0][0] = 1;

    for (int i = 1; i <= n; i++) {
      for (int j = 0; j <= i; j++) {
        if      (j == 0) coefficients[i][j] = coefficients[i - 1][j] + 2 * coefficients[i - 1][j + 1];
        else if (j == i) coefficients[i][j] = coefficients[i - 1][j - 1];
        else             coefficients[i][j] = coefficients[i - 1][j - 1] + coefficients[i - 1][j] + coefficients[i - 1][j + 1];
      }
    }
    if (k < 0) return coefficients[n][Math.abs(k)];
    else return coefficients[n][k];
  }

  // Takes two integer command-line arguments n and k and prints T(n, k).
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);
    StdOut.println(trinomial(n, k));
  }
}
