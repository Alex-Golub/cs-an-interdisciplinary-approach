package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 1.5.26 Write a program Circles that draws filled circles of random radii at random positions in
 * the unit square, producing images like those below.
 * Your program should take four command-line arguments:
 * the number of circles,
 * the probability that each circle is black,
 * the minimum radius,
 * and the maximum radius.
 *
 * Created by ag on 01-Aug-20 5:50 PM
 */
class Ex26_Circles {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double p = Double.parseDouble(args[1]);
    double minR = Double.parseDouble(args[2]);
    double maxR = Double.parseDouble(args[3]);

    for (int i = 1; i <= n; i++) {
      // set circle color
      StdDraw.setPenColor(Math.random() < p ? StdDraw.BLACK : StdDraw.WHITE);

      // pick random position
      double x = Math.random();
      double y = Math.random();

      // pick random radius and draw circle
      StdDraw.filledCircle(x, y, Math.random() < 0.5 ? minR : maxR);
    }
  }
}
