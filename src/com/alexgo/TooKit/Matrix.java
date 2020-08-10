package com.alexgo.TooKit;

/**
 * Created by ag on 10-Aug-20 1:11 PM
 */
public class Matrix {

  public static double dot(double[] a, double[] b) {
    validateArray(a);
    validateArray(b);

    if (a.length != b.length)
      throw new IllegalArgumentException("Arrays are not the same length");

    double product = 0.0;
    for (int i = 0; i < a.length; i++)
      product += a[i] * b[i];

    return product;
  }

  /**
   * Matrix multiplication is defined:
   * 1. ac - a # of columns
   *    br - b # of rows
   *    a x b defined iff ac == br
   * 2. ar - a # of rows
   *    bc - b # of colums
   *    if step 1 holds the a x b = c
   *    c dimensions are rows = ar, colums = bc
   *
   * @param a first matrix
   * @param b second matrix
   * @return product matrix of a and b
   */
  public static double[][] multiply(double[][] a, double[][] b) {
    validateMultiplication(a, b);

    int m = a.length;
    int q = b[0].length;
    double[][] product = new double[m][q];
    for (int r = 0; r < m; r++) {
      // TODO
    }

    return product;
  }

  private static void validateMultiplication(double[][] a, double[][] b) {
    validateRagged(a);
    validateRagged(b);

    if (a[0].length != b.length)
      throw new IllegalArgumentException("a columns != b rows. multiplication is not possible");
  }

  private static void validateRagged(double[][] a) {
    validateMatrix(a);

    int col = a[0].length;
    for (int i = 0; i < a.length; i++)
      if (a[i].length != col)
        throw new IllegalArgumentException("Array is ragged");
  }

  private static void validateMatrix(double[][] a) {
    if (a == null) throw new IllegalArgumentException("Matrix is null");
  }

  private static void validateArray(double[] a) {
    if (a == null) throw new IllegalArgumentException("Array is null");
  }


}
