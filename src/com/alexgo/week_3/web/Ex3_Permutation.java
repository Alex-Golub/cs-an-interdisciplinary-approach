package com.alexgo.week_3.web;

/**
 * 3. Random permutation.
 * Write a program Permutation.java so that it takes a command-line argument N and prints a random
 * permutation of the integers 0 through N-1.
 * Also print a checkerboard visualization of the permutation.
 * As an example, the permutation { 4, 1, 3, 0, 2 } corresponds to:
 *      4 1 3 0 2
 *      * * * Q *
 *      * Q * * *
 *      * * * * Q
 *      * * Q * *
 *      Q * * * *
 *
 * Created by ag on 27-Jul-20 12:07 PM
 */
class Ex3_Permutation {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // fill 0 to n-1
    int[] permutation = new int[n];
    for (int i = 0; i < n; i++)
      permutation[i] = i;

    // use shuffling algorithm to create permutation
    for (int i = 0; i < n; i++) {
      int r = (int) (Math.random() * (i + 1)); // [0,1), [0, 2), [0, 3), ... [0, i - 1)

      // swap r-th values with i-th
      int temp = permutation[i];
      permutation[i] = permutation[r];
      permutation[r] = temp;
    }

    // print permutation
    for (int i = 0; i < n; i++) {
      System.out.print(permutation[i]);

      // dont print end trailing white space
      if (i + 1 < n) System.out.print(" ");
      else           System.out.println();
    }

    // print checkerboard
    for (int row = 0; row < n; row++) {
      for (int col = 0; col < n; col++) {
        if (permutation[col] == row) System.out.print("Q");
        else                         System.out.print("*");

        if (col + 1 < n) System.out.print(" ");
        else             System.out.println();
      }
    }
  }
}
