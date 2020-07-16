package com.alexgo.week_2.book;

/**
 * 1.3.29 Write a program Checkerboard that takes an integer command-line argument n and uses a loop
 * nested within a loop to print out a two-dimensional n-by-n
 * checkerboard pattern with alternating spaces and asterisks.
 *
 * javac Ex1_3_29_Checkerboard.class
 * java Ex1_3_29_Checkerboard 3 3
 * _ * _
 * * _ *
 * _ * _
 *
 * java Ex1_3_29_Checkerboard 4 4
 * _ * _ *
 * * _ * _
 * _ * _ *
 * * _ * _
 *
 * Created by ag on 16-Jul-20 12:04 PM
 */
class Ex1_3_29_Checkerboard {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++) {
        System.out.print((r + c) % 2 == 0 ? "_ " : "* ");
      }
      System.out.println();
    }
  }
}
