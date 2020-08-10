package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.29 Terrain analysis.
 * Suppose that a terrain is represented by a two-dimensional grid of elevation values (in meters).
 * A peak is a grid point whose four neighboring cells (left, right, up, and down) have strictly lower elevation values.
 * Write a program Peaks that reads a terrain from standard input and then computes and
 * prints the number of peaks in the terrain.
 *
 * Created by ag on 02-Aug-20 2:57 PM
 */
class Ex29_Peaks {
  public static void main(String[] args) {
    StdOut.print("Enter n: ");
    int n = StdIn.readInt();
    StdOut.print("Enter m: ");
    int m = StdIn.readInt();

    int[][] terrain = new int[n][m];

    // Generate random terrain
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        terrain[i][j] = (int) (Math.random() * 21) - 10; // [-10, 10]

    // print terrain
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        StdOut.printf("%4d", terrain[i][j]);
        if (j + 1 < m) StdOut.print(" ");
        else           StdOut.println();
      }
    }

    // calculate peaks
    int peaks = 0;
    for (int i = 1; i < n - 1; i++) { // ignore edges
      for (int j = 1; j < m - 1; j++) {
          int currentPoint = terrain[i][j];
          int N = terrain[i - 1][j];
          int W = terrain[i][j + 1];
          int S = terrain[i + 1][j];
          int E = terrain[i][j - 1];
          if (currentPoint > N && currentPoint > W && currentPoint > S && currentPoint > E) {
            peaks++;
            StdOut.printf("Peak at (%d, %d)\n", i, j);
          }
      }
    }

    StdOut.println("\nTotal # of peaks " + peaks);
  }
}
