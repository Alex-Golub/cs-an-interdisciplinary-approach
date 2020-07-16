package com.alexgo.week_2.book;

/**
 * 1.3.10 Write a program that takes an integer command-line argument n, uses
 * Math.random() to print n uniform random values between 0 and 1, and then
 * prints their average value (see exercise 1.2.30).
 *
 * Created by ag on 13-Jul-20 8:10 PM
 */
class Ex1_3_10 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    final int PER_LINE = 3;

    for (int i = 1; i <= n; i++) {
      System.out.print(Math.random() + "  ");
      if (i % PER_LINE == 0) System.out.println();
    }

    String ruler = "1";
    for (int i = 2; i <= 100; i++) // n = 100
      ruler = ruler + " " + i + " " + ruler;
    System.out.println(ruler);
  }
}
