package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.6 Write a static method sigmoid() that takes a double argument x and returns
 * the double value obtained from the sigmoid formula
 *
 * https://en.wikipedia.org/wiki/Sigmoid_function
 *
 * Created by ag on 03-Aug-20 6:10 PM
 */
class Ex6_Sigmoid {
  public static void main(String[] args) {
    double rnd = Math.random() * 101; // [0, 100]
    StdOut.printf("sigmoid(%.2f) = %.2f", rnd, sigmoid(rnd));
  }

  public static double sigmoid(double x) {
    return 1.0 / (1 + Math.exp(-x));
  }
}
