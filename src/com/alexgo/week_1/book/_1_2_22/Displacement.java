package com.alexgo.week_1.book._1_2_22;

/**
 * 1.2.22
 *  Write a program that takes three double command-line arguments x0, v0,
 *  and t and prints the value of x0 + v0t − gt^2/2, where g is the constant 9.80665.
 *  (Note: This value is the displacement in meters after t seconds when an object is thrown
 *  straight up from initial position x0 at velocity v0 meters per second.)
 *
 * Created by ag on 08-Jul-20 4:00 PM
 */
class Displacement {
  public static void main(String[] args) {
    if (args.length < 3) {
      System.out.println("3 values weren't supplied by command line");
      return;
    }

    double x0 = Double.parseDouble(args[0]);
    double v0 = Double.parseDouble(args[1]);
    double t = Double.parseDouble(args[2]);
    final double G = 9.80665;

    double displacement = x0 + (v0 * t) - (G * t * t) / 2;
    System.out.printf("x0 + v0t − gt^2/2 = %.2f + %.2f * %.2f - (%.2f * %.2f ^ 2) / 2 = %.2fm",
            x0, v0, t, G, t, displacement);

  }
}
