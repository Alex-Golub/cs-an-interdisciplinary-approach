package com.alexgo.week_3.book;

import java.util.Arrays;

/**
 * 1.4.19 Write a program that multiplies two square boolean matrices, using the or
 * operation instead of + and the and operation instead of *.
 *
 * Created by ag on 24-Jul-20 9:13 PM
 */
public class Ex19_Boolean_Multiplication {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    boolean[][] a = generateMatrix(n);
    boolean[][] b = generateMatrix(n);

    printMatrix(a);
    System.out.println();
    printMatrix(b);
    System.out.println();

    boolean[][] logicalOrMul = or(a, b, n);
    printMatrix(logicalOrMul);
    System.out.println();

    boolean[][] logicalAndMal = and(a, b, n);
    printMatrix(logicalAndMal);
    System.out.println();
  }

  private static boolean[][] and(boolean[][] a, boolean[][] b, int n) {
    boolean[][] mat = new boolean[n][n];

    for (boolean[] row : mat)
      Arrays.fill(row, true);

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        for (int k = 0; k < n; k++)
          if (!a[i][k] || !b[k][j]) {
            mat[i][j] = false;
            break;
          }

    return mat;
  }

  private static boolean[][] or(boolean[][] a, boolean[][] b, int n) {
    boolean[][] mat = new boolean[n][n];

    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        for (int k = 0; k < n; k++)
          if (a[i][k] || b[k][j]) {
            mat[i][j] = true;
            break;
          }

    return mat;
  }

  private static boolean[][] generateMatrix(int n) {
    boolean[][] mat = new boolean[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        mat[i][j] = Math.random() < 0.5;

    return mat;
  }

  private static void printMatrix(boolean[][] a) {
    for (boolean[] row : a) {
      for (boolean ele : row) {
        System.out.print(ele + "\t");
      }
      System.out.println();
    }
  }
}
