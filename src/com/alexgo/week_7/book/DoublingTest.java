package com.alexgo.week_7.book;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

/**
 * Created by ag on 17-Aug-20 6:19 PM
 */
public class DoublingTest {
  public static double timeTrial(int n) { // Compute time to solve a random input of size n.
    int[] a = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = StdRandom.uniform(2000000) - 1000000;
    Stopwatch timer = new Stopwatch();
    int count = Ex4_1_1_ThreeSum.countTriples(a);
    return timer.elapsedTime();
  }

  public static void main(String[] args) { // Print table of doubling ratios.
    for (int n = 512; true; n *= 2) { // Print doubling ratio for problem size n.
      double previous = timeTrial(n / 2); // running time for n/2
      double current = timeTrial(n);        // running time for n
      double ratio = current / previous;    // ratio of running times
      StdOut.printf("%7d %4.2f\n", n, ratio);
    }
  }
}



