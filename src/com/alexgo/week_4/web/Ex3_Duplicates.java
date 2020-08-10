package com.alexgo.week_4.web;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 3. Remove duplicates.
 * Write a program Duplicates.java that reads in a sequence of integers and
 * prints back out the integers, except that it removes repeated values if
 * they appear consecutively.
 * For example, if the input is 1 2 2 1 5 1 1 7 7 7 7 1 1,
 * your program should print out 1 2 1 5 1 7 1.
 *
 * Created by ag on 02-Aug-20 4:54 PM
 */
class Ex3_Duplicates {
  public static void main(String[] args) {
    int prev = StdIn.readInt();
    String noDup = prev + " ";

    while (!StdIn.isEmpty()) {
      int next = StdIn.readInt();
      if (prev != next) {
        noDup += next + " ";
        prev = next;
      }
    }

    StdOut.println(noDup);
  }
}
