package com.alexgo.week_1.book._1_2_18;

/**
 * 1.2.18
 *  Write a program that takes two integer command-line arguments x and y
 *  and prints the Euclidean distance from the point (x, y) to the origin (0, 0).
 *
 * Created by ag on 08-Jul-20 2:58 PM
 */
class Distance {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    /* d(p, q) = ((pX - qX)^2 + (pY - qY)^2)^1/2 */
    double d = Math.sqrt(x * x + y * y);
    System.out.println("d(p, 0) = " + d);
  }
}
