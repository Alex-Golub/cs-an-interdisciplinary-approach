package com.alexgo.week_5.assignment;/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class ActivationFunction {
  public static void main(String[] args) {
    double val = Double.parseDouble(args[0]);
    StdOut.printf("heaviside(%s) = %s\n", args[0], heaviside(val));
    StdOut.printf("sigmoid(%s) = %s\n", args[0], sigmoid(val));
    StdOut.printf("tanh(%s) = %s\n", args[0], tanh(val));
    StdOut.printf("softsign(%s) = %s\n", args[0], softsign(val));
    StdOut.printf("sqnl(%s) = %s\n", args[0], sqnl(val));
  }

  // Returns the Heaviside function of x.
  public static double heaviside(double x) {
    if (Double.isNaN(x)) return Double.NaN;

    return x < 0.0 ? 0 : (x == 0 ? 0.5 : 1);
  }

  // Returns the sigmoid function of x.
  public static double sigmoid(double x) {
    return Double.isNaN(x) ? Double.NaN : 1.0 / (1 + Math.exp(-x));
  }

  // Returns the hyperbolic tangent of x.
  // e^x for x >= 20 will lead to Infinity and x <= -20 to -Infinity
  // which leads to division Infinity/Infinity result in NaN
  public static double tanh(double x) {
    if (Double.isNaN(x)) return Double.NaN;
    if (x >= 20) return 1.0;
    if (x <= -20) return -1.0;

    return (1 - Math.exp(-2 * x)) / (1 + Math.exp(-2 * x));
  }

  // Returns the softsign function of x.
  public static double softsign(double x) {
    if (Double.isNaN(x)) return Double.NaN;
    if (Double.isInfinite(x)) return x < 0 ? -1.0 : 1.0;

    return x / (1 + Math.abs(x));
  }

  // Returns the square nonlinearity function of x.
  public static double sqnl(double x) {
    if (Double.isNaN(x)) return Double.NaN;
    if (x <= -2.0) return -1;
    if (x < 0.0) return x + (x * x) / 4;
    if (x < 2.0) return x - (x * x) / 4;

    return 1;
  }

}
