package com.alexgo.week_7.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 4.1.1 Implement the static method printTriples() for ThreeSum (program
 * 4.1.1), which prints to standard output all of the triples that sum to zero.
 *
 * Created by ag on 17-Aug-20 8:35 PM
 */
class Ex4_1_1_ThreeSum {
  public static void printTriples(int[] a) {
    int n = a.length;
    for (int i = 0; i < n; i++)
      for (int j = i + 1; j < n; j++)
        for (int k = j + 1; k < n; k++)
          if (a[i] + a[j] + a[k] == 0)
            StdOut.println(a[i] + " " + a[j] + " " + a[k]);
  }

  public static int countTriples(int[] a) { // Count triples that sum to 0.
    int n = a.length;
    int count = 0;
    for (int i = 0; i < n; i++)         // n
      for (int j = i + 1; j < n; j++)   // ~n^2/2
        for (int k = j + 1; k < n; k++) // ~n^3/6 => n(n-1)(n-2)/6 => ~n^3
          if (a[i] + a[j] + a[k] == 0)
            count++;
    return count;
  }

  public static void main(String[] args) {
    int[] a = StdIn.readAllInts(); // Ctrl+D to end input stream
    int count = countTriples(a);
    StdOut.println(count);
    if (count < 10) printTriples(a);
  }
}
