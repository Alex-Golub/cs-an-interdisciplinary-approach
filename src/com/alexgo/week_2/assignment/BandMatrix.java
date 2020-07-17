package com.alexgo.week_2.assignment;

/**
 * 2. Band matrices.
 * Write a program BandMatrix.java that takes two integer command-line arguments n and width and
 * prints an n-by-n pattern like the ones below, with a zero (0) for each element whose distance
 * from the main diagonal is strictly more than width, and an asterisk (*) for each entry that is
 * not, and two spaces between each 0 or *.
 *
 * Here, distance means the minimum number of cells you have to move (either left, right, up, or down)
 * to reach any element on the main diagonal.
 *
 * Note: you may assume that n and width are non-negative integer.
 *
 * Band matrices are matrices whose nonzero entries are restricted to a diagonal band.
 * They arise frequently in numerical linear algebra.
 *
 * Created by ag on 16-Jul-20 5:12 PM
 */
public class BandMatrix {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        int eleDist = i + j;
        int mainDiagonal = i + i;

        // if element from right then distance is positive
        // otherwise distance is negative so take absolute no.
        boolean distFromDiagonal = Math.abs(eleDist - mainDiagonal) > width;
        if (distFromDiagonal) System.out.print("0");
        else                  System.out.print("*");

        // don't ignore trailing whitespace
        if (j + 1 < n) System.out.print(" ");
      }
      System.out.println();
    }
  }
}
