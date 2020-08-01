package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.15 Write a program that takes three double command-line arguments x, y,
 * and z, reads from standard input a sequence of point coordinates (xi, yi, zi), and
 * prints the coordinates of the point closest to (x, y, z). Recall that the square of the
 * distance between (x , y , z) and (xi, yi, zi) is (x  xi)2 + (y  yi)2 + (z  zi)2.
 * For efficiency, do not use Math.sqrt().
 *
 * Created by ag on 31-Jul-20 10:19 AM
 */
class Ex15_Closest {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);

    double[] closest = new double[3];
    double closestSoFar = Double.MAX_VALUE;

    while (!StdIn.isEmpty()) {
      double xi = StdIn.readDouble();
      double yi = StdIn.readDouble();
      double zi = StdIn.readDouble();

      double d = Math.pow(x - xi, 2) + Math.pow(y - yi, 2) + Math.pow(z - zi, 2);

      if (d < closestSoFar) {
        closest[0] = xi;
        closest[1] = yi;
        closest[2] = zi;
        closestSoFar = d;
      }
    }

    StdOut.printf("Closest coordinate to (%.2f, %.2f, %.2f) is (%.2f, %.2f, %.2f)",
            x, y, z, closest[0], closest[1], closest[2]);
  }
}
