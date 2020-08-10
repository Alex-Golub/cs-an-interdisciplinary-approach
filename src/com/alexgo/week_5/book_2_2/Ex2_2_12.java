package com.alexgo.week_5.book_2_2;

import com.alexgo.TooKit.Matrix;

import static edu.princeton.cs.algs4.StdOut.println;

/**
 * 2.2.12 Write a library Matrix
 *
 * Created by ag on 10-Aug-20 1:16 PM
 */
class Ex2_2_12 {
  public static void main(String[] args) {
    // test dot product
    double[] a = {1,2,3};
    double[] b = {-1,-2,-3};
    println(Matrix.dot(a, b));
//    println(Matrix.dot(null, b));
//    println(Matrix.dot(new double[] {1,2}, b));




    // edge cases
//    println(Matrix.multiply(null, new double[][] {{1}, {2}}));                               // one is null
//    println(Matrix.multiply(new double[][]{{1, 2, 3}, {13}}, new double[][]{{1}, {2}}));       // first array is ragged
//    println(Matrix.multiply(new double[][]{{1, 2, 3}, {1, 2, 3}}, new double[][]{{1}, {2}}));  // different dimensions

  }
}
