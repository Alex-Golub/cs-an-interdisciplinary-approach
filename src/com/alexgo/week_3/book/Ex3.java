package com.alexgo.week_3.book;

import java.util.Arrays;

/**
 * 1.4.3 Given two vectors of length n that are represented with one-dimensional
 * arrays, write a code fragment that computes the Euclidean distance between them
 * (the square root of the sums of the squares of the differences between corresponding elements).
 *
 * Created by ag on 22-Jul-20 8:06 PM
 */
class Ex3 {
  public static void main(String[] args) {
    int[] a = {1, 2, 3, 4, 5, 6, 7};
    int[] b = {7, 6, 5, 4, 3, 2, 1};

    int n = a.length;
    double sum = 0.0;

    for (int i = 0; i < n; i++)
      sum += Math.pow(a[i] - b[i], 2);

    double distance = Math.sqrt(sum);
    System.out.println("Distance (" + Arrays.toString(a) + ", " + Arrays.toString(b) + ") = " + distance);
  }
}
