package com.alexgo.week_6.book;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 2.3.14 Modify Htree (program 2.3.4) to animate the drawing of the H-tree.
 * Next, rearrange the order of the recursive calls (and the base case),
 * view the resulting animation, and explain each outcome.
 *
 * Created by ag on 13-Aug-20 1:56 PM
 */
class Ex2_3_14_HTree {
  public static void draw(int n, double size, double x, double y) {
    // Draw an H-tree centered at x, y of depth n and given size.
    if (n == 0) return;

    double x0 = x - size / 2, x1 = x + size / 2;
    double y0 = y - size / 2, y1 = y + size / 2;

    StdDraw.line(x0, y, x1, y);   // -
    StdDraw.line(x0, y0, x0, y1); // |-
    StdDraw.line(x1, y0, x1, y1); // |-|
    StdDraw.show();
    StdDraw.pause(1);

    draw(n - 1, size / 2, x0, y0);
    draw(n - 1, size / 2, x0, y1);
    draw(n - 1, size / 2, x1, y0);
    draw(n - 1, size / 2, x1, y1);

  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdDraw.enableDoubleBuffering();
    draw(n, 0.5, 0.5, 0.5);
  }
}
