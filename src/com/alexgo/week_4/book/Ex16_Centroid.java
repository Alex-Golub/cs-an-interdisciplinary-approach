package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.16 Given the positions and masses of a sequence of objects, write a program
 * to compute their center-of-mass, or centroid. The centroid is the average position of
 * the n objects, weighted by mass. If the positions and masses are given by (xi, yi, mi),
 * then the centroid (x, y, m) is given by
 * m = m1 + m2 + ... + mn
 * x = (m1 x1 + ... + mn xn) / m
 * y = (m1 y1 + ... + mn yn ) / m
 *
 * Created by ag on 31-Jul-20 10:33 AM
 */
class Ex16_Centroid {
  public static void main(String[] args) {
    double m = 0.0, x = 0.0, y = 0.0;

    StdOut.printf("Enter sequence of objects x, y, m (Ctrl-d to stop)\n");
    while (!StdIn.isEmpty()) {
      double xi = StdIn.readDouble();
      double yi = StdIn.readDouble();
      double mi = StdIn.readDouble();

      m += mi;
      x += mi * xi;
      y += mi * yi;
    }

    StdOut.printf("Centroid of objects is (%.3f, %.3f) with total mass of %.3fkg",
            x / m, y / m, m);
  }
}
