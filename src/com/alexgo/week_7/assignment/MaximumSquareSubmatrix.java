package com.alexgo.week_7.assignment;

import edu.princeton.cs.algs4.StdIn;

/**
 * 3. Maximum square submatrix.
 * Given an n-by-n matrix of 0s and 1s, find a contiguous square submatrix of maximum size that contains only 1s.
 * The maximum square submatrix problem is related to problems that arise in databases,
 * image processing, and maximum likelihood estimation.
 * It is also a popular technical job interview question.
 *
 * NOTES:
 * Size. The size of a square submatrix is its number of rows (or columns).
 *       You may assume that argument to the size() method is a square matrix containing only 0s and 1s.
 *
 * Contiguous. The square submatrix must be contiguous—the row indicies must be consecutive
 *             and the column indices must be consecutive.
 *
 * Performance. The size() method should take time proportional to n^2 in the worst case !!!
 *
 * Input format. Standard input will contain a positive integer n, followed by n lines,
 *               with each line containing n 0s and 1s, separated by whitespace.
 *
 * Created by ag on 23-Aug-20 2:03 PM
 */
public class MaximumSquareSubmatrix {

  // Returns the size of the largest contiguous square submatrix of a[][] containing only 1s.
  public static int size(int[][] a) {
    int n = a.length;
    int max_size = 0;
    int[][] temp = new int[n + 1][n + 1]; // wrap array a with this wrapper array

    for (int i = 1; i < n + 1; i++) {
      for (int j = 1; j < n + 1; j++) {
        if (a[i - 1][j - 1] == 1) { // calc minimum from three values and add 1 to
          int N  = temp[i - 1][j];
          int NW = temp[i - 1][j - 1];
          int W  = temp[i][j - 1];
          int min = Math.min(N, Math.min(NW, W));

          temp[i][j] = 1 + min;

          max_size = Math.max(1 + min, max_size); // update max consecutive 1s if found more then previously
        }
        else temp[i][j] = 0; // is zero encountered ignore it at place 0 int (i,j)
      }
    }

//    StdArrayIO.print(temp);

    return max_size;
  }

  // Reads an n-by-n matrix of 0s and 1s from standard input
  // and prints the size of the largest contiguous square submatrix
  // containing only 1s.
  public static void main(String[] args) {
    int n = StdIn.readInt();
    int[][] a = new int[n][n];

    while (!StdIn.isEmpty())
      for (int i = 0; i < n; i++)
        for (int j = 0; j < n; j++)
          a[i][j] = StdIn.readInt();

    System.out.println(size(a));

//    for (int[] sub : a) System.out.println(Arrays.toString(sub));
  }
}
