package com.alexgo.week_5.book;

/**
 * 2.1.21 Write a static method multiply() that takes two square matrices of the
 * same dimension as arguments and produces their product (another square matrix
 * of that same dimension). Extra credit : Make your program work whenever the
 * number of columns in the first matrix is equal to the number of rows in the second
 * matrix.
 *
 * Created by ag on 04-Aug-20 2:05 PM
 */
class Ex21_Matrix_Multiplication {
  public static void main(String[] args) {
    double[][] a = {{1, 2, 3}, {4, 5, 6}};   // 2x3
    double[][] b = {{2, 1}, {1, 2}, {3, 5}}; // 3x2

    print(a);
    System.out.println();
    print(b);
    System.out.println();
    print(multiply(a, b));

  }

  private static void print(double[][] a) {
    // case where multiplication was not possible to avoid NullPointerException
    if (a == null) return;

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j]);
        if (j + 1 < a[i].length) System.out.print(" \t");
      }
      System.out.println();
    }

  }

  // two matrix a(m,n) and b(p,q)
  // a x b is valid only if n = p and product matrix is c(m, q)
  public static double[][] multiply(double[][] a, double[][] b) {

    // multiplication is not possible
    if (a[0].length != b.length) return null;

    double[][] c = new double[a.length][b[0].length];
    for (int i = 0; i < a.length; i++)
      for (int j = 0; j < b[i].length; j++)
        for (int k = 0; k < b.length; k++)
          c[i][j] += a[i][k] * b[k][j];

    return c;
  }
}
