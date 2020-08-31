package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.In;

import static com.alexgo.TooKit.RandomGenerators.txtRandomString;
import static com.alexgo.TooKit.StringProcessing.merge;

/**
 * 3.1.25 Write a program Merge that takes a delimiter string followed by an arbitrary number of
 * file names as command-line arguments;
 * concatenates the corresponding lines of each file, separated by the delimiter;
 * and then prints the result to
 * standard output, thus performing the opposite operation of Split (program 3.1.9).
 *
 * Created by ag on 31-Aug-20 8:28 PM
 */
class Ex3_1_25_Merge {
  public static void main(String[] args) {

    // Create 2 files of random strings
    txtRandomString(2, 30, 5);

    String delimiter = args[0];

    for (int i = 1; i < args.length; i++) {
      In in = new In(args[i]);
      String[] lines = in.readAllLines();
      System.out.println(merge(lines, delimiter));
    }
  }
}
