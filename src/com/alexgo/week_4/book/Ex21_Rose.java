package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 1.5.21 Write a program that takes an integer command-line argument n and plots
 * a rose with n petals (if n is odd) or 2n petals (if n is even), by plotting the polar
 * coordinates (r, theta) of the function r = sin(n * theta) for theta ranging from 0 to 2pi radians
 *
 * Created by ag on 31-Jul-20 1:51 PM
 */
class Ex21_Rose {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // # of petals

    StdDraw.setCanvasSize(700, 700);

    StdDraw.setXscale(-1, 1); // sin and cos [-1, 1]
    StdDraw.setYscale(-1, 1);

    double x0 = 0.0, y0 = 0.0;
    for (double t = 0.1; t <= 360.0; t += 0.2) {
      double theta = Math.toRadians(t);
      double r = Math.sin(n * theta);
      double x = r * Math.cos(theta);
      double y = r * Math.sin(theta);
      StdDraw.line(x0, y0, x, y);
      x0 = x;
      y0 = y;
    }
  }
}
