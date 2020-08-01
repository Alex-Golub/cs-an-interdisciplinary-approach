package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * Then write a program RandomIntSeq that takes two integer commandline arguments m and n and prints
 * n random integers between 0 and m-1.
 *
 * Created by ag on 30-Jul-20 5:42 PM
 */
public class Ex10_2_RandomIntSeq {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    for (int i = 0; i < n; i++)
      StdOut.print((int) (Math.random() * m) + " ");  // [0, m-1]
  }
}
