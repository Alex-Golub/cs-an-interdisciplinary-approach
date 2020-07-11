package com.alexgo.week_1.assignment;

/**
 * 3. Floating-point numbers and the Math library.
 * The great-circle distance is the length of the shortest path between two points (x1,y1) and (x2,y2)
 * on the surface of a sphere, where the path is constrained to be along the surface.
 *
 * Write a program GreatCircle.java that takes four double command-line arguments
 * x1, y1, x2, and y2—the latitude and longitude (in degrees) of two points on the surface of the
 * earth—and prints the great-circle distance (in kilometers) between them.
 *
 * Created by ag on 11-Jul-20 9:13 PM
 */
public class GreatCircle {
  public static void main(String[] args) {
    double x1 = Math.toRadians(Double.parseDouble(args[0]));
    double y1 = Math.toRadians(Double.parseDouble(args[1]));
    double x2 = Math.toRadians(Double.parseDouble(args[2]));
    double y2 = Math.toRadians(Double.parseDouble(args[3]));

    final double R = 6371.0;

    double d = 2 * R * Math.asin(
            Math.sqrt(
                    Math.pow(Math.sin((x1 - x2) / 2), 2) +
                    Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2)
            ));

    System.out.println(d + " kilometers");
  }
}
