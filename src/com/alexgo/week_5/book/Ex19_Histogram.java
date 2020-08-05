package com.alexgo.week_5.book;

import java.util.Arrays;

/**
 * 2.1.19 Write a static method histogram() that takes an int array a[] and an
 * integer m as arguments and returns an array of length m whose ith element is the
 * number of times the integer i appeared in a[].
 * Assuming the values in a[] are all between 0 and m-1,
 * the sum of the values in the returned array should equal a.length.
 *
 * Created by ag on 04-Aug-20 12:45 PM
 */
class Ex19_Histogram {
  public static void main(String[] args) {
    int[] a = new int[5];
    final int m = 7;
    for (int i = 0; i < a.length; i++)
      a[i] = (int) (Math.random() * m); // [0, m-1]

    System.out.println(Arrays.toString(a));

    System.out.println(Arrays.toString(histogram(a, m)));
  }

  public static int[] histogram(int[] a, int m) {
    int[] b = new int[m];
    for (int value : a)
      b[value]++;

    return b;
  }



}
