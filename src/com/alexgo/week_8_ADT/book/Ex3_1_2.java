package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.Picture;

import java.awt.*;

/**
 * 3.1.2 Write a program that takes from the command line three integers between
 * 0 and 255 that represent red, green, and blue values of a color and then creates and
 * shows a 256-by-256 Picture in which each pixel has that color.
 *
 * Created by ag on 28-Aug-20 1:38 PM
 */
class Ex3_1_2 {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    Picture pic = new Picture(256, 256);
    for (int col = 0; col < pic.width(); col++)
      for (int row = 0; row < pic.height(); row++)
        pic.set(col, row, new Color(r, g, b));

    pic.show();
  }
}
