package com.alexgo.week_3.web;

/**
 * 4. 8 queens checker.
 * A permutation of the integer 0 to n-1 corresponds to a placement of queens on an n-by-n chessboard
 * so that no two queens are in the same row or column.
 *
 * Write a program QueensChecker.java that determines whether or not a permutation corresponds
 * to a placement of queens so that no two are in the same row, column, or diagonal.
 * As an example, the permutation { 4, 1, 3, 0, 2 } is a legal placement:
 *      * * * Q *
 *      * Q * * *
 *      * * * * Q
 *      * * Q * *
 *      Q * * * *
 * Try to do it without using any extra arrays besides the length n input permutation q.
 *
 * Hint: to determine whether setting q[i] conflicts with q[j] for i < j.
 *      if q[i] equals q[j]: two queens are placed in the same row
 *      if q[i] - q[j] equals j - i: two queens are on same major diagonal
 *      if q[j] - q[i] equals j - i: two queens are on same minor diagonal
 *
 * Created by ag on 27-Jul-20 12:54 PM
 */
class Ex4__QueensChecker {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // dimensions of chessboard

    // initialize
    int[] q = new int[n];
    for (int i = 0; i < n; i++)
      q[i] = i;

    // permute
    for (int i = 0; i < n; i++) {
      int r = (int) (Math.random() * (i + 1));
      int t = q[r];
      q[r] = q[i];
      q[i] = t;
    }

    // print permutation
    for (int i = 0; i < n; i++) {
      System.out.print(q[i]);
      if (i + 1 < n) System.out.print(" ");
      else           System.out.println();
    }

    // print checkerboard
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (q[j] == i) System.out.print("Q");
        else           System.out.print("*");

        if (j + 1 < n) System.out.print(" ");
        else           System.out.println();
      }
    }

    // queens placement for this permutation is valid?


  }
}
