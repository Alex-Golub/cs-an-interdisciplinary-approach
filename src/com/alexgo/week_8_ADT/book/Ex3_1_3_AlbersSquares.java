package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * 3.1.3 Modify AlbersSquares (program 3.1.2) to take nine command-line arguments
 * that specify three colors and then draws the six squares showing all the Albers
 * squares with the large square in each color and the small square in each different color
 *
 * Created by ag on 28-Aug-20 1:45 PM
 */
class Ex3_1_3_AlbersSquares {
  public static void main(String[] args) {
    int r1 = Integer.parseInt(args[0]);
    int g1 = Integer.parseInt(args[1]);
    int b1 = Integer.parseInt(args[2]);
    Color c1 = new Color(r1, g1, b1);

    int r2 = Integer.parseInt(args[3]);
    int g2 = Integer.parseInt(args[4]);
    int b2 = Integer.parseInt(args[5]);
    Color c2 = new Color(r2, g2, b2);

    int r3 = Integer.parseInt(args[6]);
    int g3 = Integer.parseInt(args[7]);
    int b3 = Integer.parseInt(args[8]);
    Color c3 = new Color(r3, g3, b3);

    StdDraw.setXscale(-1, 2);
    StdDraw.setYscale(-1, 1);

    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(-0.75, 0.5, 0.2);
    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(-0.75, 0.5, 0.1);

    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(-0.30, 0.5, 0.2);
    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(-0.30, 0.5, 0.1);

    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(0.15, 0.5, 0.2);
    StdDraw.setPenColor(c3);
    StdDraw.filledSquare(0.15, 0.5, 0.1);

    StdDraw.setPenColor(c3);
    StdDraw.filledSquare(0.60, 0.5, 0.2);
    StdDraw.setPenColor(c1);
    StdDraw.filledSquare(0.60, 0.5, 0.1);

    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(1.05, 0.5, 0.2);
    StdDraw.setPenColor(c3);
    StdDraw.filledSquare(1.05, 0.5, 0.1);

    StdDraw.setPenColor(c3);
    StdDraw.filledSquare(1.50, 0.5, 0.2);
    StdDraw.setPenColor(c2);
    StdDraw.filledSquare(1.50, 0.5, 0.1);





  }
}
