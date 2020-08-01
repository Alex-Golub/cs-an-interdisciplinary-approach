package com.alexgo.week_4.assignment;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 2. Checkerboard.
 * Write a program Checkerboard.java that takes a command-line integer n and plots an n-by-n
 * checkerboard pattern to standard drawing.
 * Color the squares blue and light gray, with the bottom-left square blue.
 *
 * Created by ag on 01-Aug-20 8:05 PM
 */
public class Checkerboard {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    StdDraw.setXscale(0, n);
    StdDraw.setYscale(0, n);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        StdDraw.setPenColor((i + j) % 2 == 0 ? StdDraw.BLUE : StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(.5 + j, .5 + i, .5);
      }
    }
  }
}
