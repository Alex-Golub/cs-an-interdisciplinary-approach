package com.alexgo.week_5.book_2_2;

import com.alexgo.TooKit.Scale;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by ag on 10-Aug-20 12:22 PM
 */
class Ex2_2_6_Scale {
  public static void main(String[] args) {
    double[] a = new double[10];
    for (int i = 0; i < a.length; i++)
      a[i] = StdRandom.uniform(-100, 101); // [-100, 100]

    StdArrayIO.print(a);

    double[] scaled = Scale.linearScale(-10, 10, a);
    StdArrayIO.print(scaled);
  }
}
