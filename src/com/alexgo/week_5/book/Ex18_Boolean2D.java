package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 2.1.18 Write a static method readBoolean2D() that reads a two-dimensional
 * boolean matrix (with dimensions) from standard input and returns the resulting
 * two-dimensional array.
 *
 * Created by ag on 04-Aug-20 12:35 PM
 */
class Ex18_Boolean2D {
  public static void main(String[] args) {
    for (boolean[] r : readBoolean2D())
      System.out.println(Arrays.toString(r));
  }

  public static boolean[][] readBoolean2D() {
    StdOut.print("Enter # rows: ");
    int m = StdIn.readInt();
    StdOut.print("Enter # columns: ");
    int n = StdIn.readInt();

    while (m <= 0 || n <= 0) {
      StdOut.printf("%d and %d must be grater then zero, try again\n", m, n);
      StdOut.print("Enter # rows: ");
      m = StdIn.readInt();
      StdOut.print("Enter # columns: ");
      n = StdIn.readInt();
    }

    boolean[][] bool = new boolean[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        StdOut.printf("(%d, %d) boolean value is => ", i, j);
        bool[i][j] = StdIn.readBoolean();
      }
    }

    return bool;
  }
}
