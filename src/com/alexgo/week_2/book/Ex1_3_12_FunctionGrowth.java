package com.alexgo.week_2.book;

/**
 * 1.3.12 Write a program FunctionGrowth that prints a table of the values log n, n,
 * n loge n, n 2, n 3, and 2 n for n = 16, 32, 64, ... , 2,048. Use tabs (\t characters) to align
 * columns.
 *
 * Created by ag on 13-Jul-20 8:38 PM
 */
class Ex1_3_12_FunctionGrowth {
  public static void main(String[] args) {
    System.out.printf("%-22s%-10s%-22s%-10s%-15s%-25s%n", "logn", "n", "nlogn", "n^2", "n^3", "2^n");
    for (int n = 16; n <= 2048; n *= 2) {
      double log10n = Math.log10(n);
      double nlogn = n * Math.log(n);
      long nSquare = n * n;
      long nCube = n * n * n;
      long powerOfn = (long) Math.pow(2, n);

      System.out.printf("%-22.16f%,-10d%-22f%-10d%-15d%-25d%n", log10n, n, nlogn, nSquare, nCube, powerOfn);
    }
  }
}
