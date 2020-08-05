package com.alexgo.week_5.book;

import java.util.Arrays;

/**
 * 2.1.16 Write a static method scale() that takes a double array as its argument
 * and has the side effect of scaling the array so that each element is between 0 and 1
 *
 * Created by ag on 04-Aug-20 12:06 PM
 */
class Ex16_Scale {
  public static void main(String[] args) {
    double[] a = new double[10];

    // random array generator
    for (int i = 0; i < a.length; i++)
      a[i] = Math.random() * 21 - 10; // [-10, 10]

    System.out.println(Arrays.toString(a));
    scale(a);
    System.out.println(Arrays.toString(a));
  }

  public static void scale(double[] a) {
   double min = getMin(a);
   double max = getMax(a);

   for (int i = 0; i < a.length; i++)
     a[i] = (a[i] - min) / (max - min);
  }

  private static double getMax(double[] a) {
    double max = Double.NEGATIVE_INFINITY;
    for (double val : a)
      if (val > max) max = val;

    return max;
  }

  private static double getMin(double[] a) {
    double min = Double.POSITIVE_INFINITY;
    for (double val : a)
      if (val < min) min = val;

    return min;
  }
}
