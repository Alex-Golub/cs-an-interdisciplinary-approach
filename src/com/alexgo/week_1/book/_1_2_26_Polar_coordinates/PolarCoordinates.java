package com.alexgo.week_1.book._1_2_26_Polar_coordinates;

/**
 * 1.2.26 Polar coordinates.
 *  Write a program that converts from Cartesian to polar coordinates.
 *  Your program should accept two double commandline arguments x and y and print the
 *  polar coordinates r and θ.
 *
 * Reference: https://mathworld.wolfram.com/PolarCoordinates.html
 *
 *  javac PolarCoordinates.java
 *  java PolarCoordinates x y
 *
 * Created by ag on 09-Jul-20 11:01 AM
 */
class PolarCoordinates {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    // distance from origin (0, 0) to (x, y)
    double r = Math.sqrt(x * x + y * y);

    // two-argument inverse tangent which takes the signs of x and y into account
    // to determine in which quadrant theta lies
    double theta = Math.atan2(y, x);
    double d = Math.toDegrees(theta);

    System.out.printf("Cartesian: (%.2f, %.2f) -> Polar: (%.2f, %.2frad)%n", x, y, r, theta);
    System.out.printf("Cartesian: (%.2f, %.2f) -> Polar: (%.2f, %.2f°)", x, y, r, d);
  }
}
