package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Created by ag on 31-Jul-20 1:21 PM
 */
class Ex20_Diamonds_Clubs_Spades_Hearts {
  public static void main(String[] args) {

    // Diamond
    StdDraw.setPenColor(StdDraw.RED);
    double[] x = new double[] { .10, .15, .20, .15 };
    double[] y = new double[] { .85, .75, .85, .95 };
    StdDraw.filledPolygon(x, y);

    // Heart
    StdDraw.setPenColor(StdDraw.BLACK);
    double[] hx = new double[] { .50, .75, .99, .75 };
    double[] hy = new double[] { .85, .75, .85, .95 };
    StdDraw.filledPolygon(hx, hy);
    // TODO

  }
}
