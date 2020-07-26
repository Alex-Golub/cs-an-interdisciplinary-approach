package com.alexgo.week_3.assignment;

/**
 * 1. Discrete distribution.
 * Write a program DiscreteDistribution.java that takes an integer command-line argument m,
 * followed by a sequence of positive integer command-line arguments a1,a2,…,an,
 * and prints m random indices (separated by whitespace), choosing each index i with probability proportional to ai.
 *
 * Geometrically, this subdivides the interval [0,Sn) into n sub-intervals [Si−1,Si),
 * with the length of subinterval i proportional to ai.
 * For example, if the discrete distribution is defined by
 * (a1,a2,a3,a4,a5,a6)=(10,10,10,10,10,50),
 * then the cumulative sums are
 * (S1,S2,S3,S4,S5,S6)=(10,20,30,40,50,100)
 *
 * Created by ag on 25-Jul-20 1:27 PM
 */
public class DiscreteDistribution {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);

    // cumulative sums Si=a1+a2+…+ai and S0=0
    int[] sums = new int[args.length];
    for (int i = 1; i < sums.length; i++)
      sums[i] = sums[i - 1] + Integer.parseInt(args[i]);

    while (m > 0) {
      // random integer r uniformly between [0, Sn)
      int r = (int) (Math.random() * sums[sums.length - 1]);

      // unique index i between [1, n] such that Si−1 ≤ r < Si.
      for (int i = 0; i < sums.length - 1; i++) {
        if (sums[i] <= r && r < sums[i + 1]) {
          System.out.print(i + 1);
          break;
        }
      }

      m--;
      if (m != 0)
        System.out.print(" ");
    }
  }
}
