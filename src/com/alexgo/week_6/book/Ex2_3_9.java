package com.alexgo.week_6.book;

/**
 * 2.3.9 Write a recursive program Ruler to plot the subdivisions of a ruler using StdDraw, as in program 1.2.1.
 *
 * Created by ag on 12-Aug-20 5:15 PM
 */
class Ex2_3_9 {
  public static void main(String[] args) {
    System.out.println(ruler(3));
  }

  public static String ruler(int n) { // TODO: Plot
    if (n <= 0) return " ";
    return ruler(n - 1) + n + ruler(n - 1);
  }
}
