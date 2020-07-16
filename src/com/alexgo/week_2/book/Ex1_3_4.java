package com.alexgo.week_2.book;

/**
 * 1.3.4 Write a code fragment that prints true if the double variables x and y are
 * both strictly between 0 and 1 i.e. (0, 1), and false otherwise
 *
 * Created by ag on 13-Jul-20 6:34 PM
 */
class Ex1_3_4 {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);

    if (x > 0.0 && x < 1.0 && y > 0.0 && y < 1.0)
      System.out.println("true");
    else
      System.out.println("false");
  }
}
