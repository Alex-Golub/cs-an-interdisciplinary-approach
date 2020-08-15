package com.alexgo.week_6.assignment;

import edu.princeton.cs.algs4.StdDraw;

/**
 * 4. Recursive squares.
 * Write a program RecursiveSquares.java that takes an integer command-line argument n and plots a recursive square pattern of order n.
 * The largest square is centered on the canvas and has side length 0.5.
 * The side length of each square is one-half that of the next largest square.
 *
 * Created by ag on 15-Aug-20 5:25 PM
 */
public class RecursiveSquares {

  // plot a square, centered on (x, y) of the given side length
  // with a light gray background and black border
  public static void drawSquare(double x, double y, double size) {
    StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
    StdDraw.filledSquare(x, y, size / 2);
    StdDraw.setPenColor(StdDraw.BLACK);
    StdDraw.square(x, y, size / 2);
  }

  // plot an order n recursive squares pattern
  // centered on (x, y) of the given side length
  public static void draw(int n, double x, double y, double size) {
    if (n == 0) return;

    drawSquare(x, y, size);

    // recursively draw 4 smaller squares of order n-1
    draw(n - 1, x - size / 2, y - size / 2, size / 2);    // lower left
    draw(n - 1, x - size / 2, y + size / 2, size / 2);    // upper left
    draw(n - 1, x + size / 2, y - size / 2, size / 2);    // lower right
    draw(n - 1, x + size / 2, y + size / 2, size / 2);    // upper right
  }

  // read in an integer command-line argument n and plot an order n recursive
  // squares pattern
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double x = 0.5, y = 0.5;   // center of square
    double size = 0.5;         // side length of square
    draw(n, x, y, size);
  }

}
