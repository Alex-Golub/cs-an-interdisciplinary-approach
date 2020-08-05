package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.5 Write a static method areTriangular() that takes three double arguments
 * and returns true if they could be the sides of a triangle (none of them is greater
 * than or equal to the sum of the other two).
 *
 * Created by ag on 03-Aug-20 6:03 PM
 */
class Ex5_Triangular {
  public static void main(String[] args) {

    double a = 1 + Math.random() * 100; // [1, 100]
    double b = 1 + Math.random() * 100;
    double c = 1 + Math.random() * 100;

    StdOut.printf("Can be triangle (%.2f, %.2f, %.2f) => %b",
            a, b, c, areTriangular(a, b, c));
  }

  public static boolean areTriangular(double a, double b, double c) {
    return (a + b > c) && (a + c > b) && (b + c > a);
  }
}
