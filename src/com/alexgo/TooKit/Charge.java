package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdOut;

/**
 * Implementation of data type for charged particles.
 * <p>
 * Created by ag on 01-Sep-20 8:07 PM
 */
public class Charge {
  private final double rx, ry;
  private final double q;

  public Charge(double x0, double y0, double q0) {
    rx = x0;
    ry = y0;
    q = q0;
  }

  public double potentialAt(double x, double y) {
    double k = 8.99e09;
    double dx = x - rx;
    double dy = y - ry;

    return k * q / Math.sqrt(dx * dx + dy * dy);
  }

  public String toString() {
    return q + " at (" + rx + ", " + ry + ")";
  }

  // Minimal test client for this data type
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    Charge c1 = new Charge(0.51, 0.63, 21.3);
    Charge c2 = new Charge(0.13, 0.94, 81.9);

    StdOut.println(c1);
    StdOut.println(c2);

    double v1 = c1.potentialAt(x, y);
    double v2 = c2.potentialAt(x, y);

    StdOut.printf("%.2e\n", (v1 + v2));
  }
}
