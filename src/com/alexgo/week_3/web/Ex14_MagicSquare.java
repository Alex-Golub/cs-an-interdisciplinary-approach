package com.alexgo.week_3.web;

/**
 * 14. Magic squares.
 * Write a program MagicSquare.java that reads in an odd integer N from the command line and prints
 * out an N-by-N magic square.
 * The square contains each of the integers between 1 and N^2 exactly once,
 * such that all row sums, column sums, and diagonal sums are equal.
 *      4  9  2    11 18 25  2  9
 *      3  5  7    10 12 19 21  3
 *      8  1  6     4  6 13 20 22
 *                 23  5  7 14 16
 *                 17 24  1  8 15
 *
 * One simple algorithm is to assign the integers 1 to N^2 in ascending order,
 * starting at the bottom, middle cell.
 * Repeatedly assign the next integer to the cell adjacent diagonally to the right and down.
 * If this cell has already been assigned another integer, instead use the cell adjacently above.
 * Use wrap-around to handle border cases.
 *
 * Created by ag on 27-Jul-20 1:16 PM
 */
class Ex14_MagicSquare {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    if (n < 1 || n % 2 == 0) {
      System.out.println("n is either less then 1 or not odd number");
      return;
    }

    int[][] magic = new int[n][n]; // FIXME

    // print magic square
    for (int r = 0; r < n; r++) {
      for (int c = 0; c < n; c++) {
        System.out.print(magic[r][c]);
        if (c + 1 < n) System.out.print(" \t");
        else           System.out.println();
      }
    }
  }
}
