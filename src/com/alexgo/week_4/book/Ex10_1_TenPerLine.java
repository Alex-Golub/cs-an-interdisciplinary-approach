package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.10 Write a filter TenPerLine that reads from standard input a sequence of
 * integers between 0 and 99 and prints them back, 10 integers per line, with columns
 * aligned.
 * Then write a program RandomIntSeq that takes two integer commandline arguments m and n and prints
 * n random integers between 0 and m-1.
 *
 * Test your programs with the command java RandomIntSeq 200 100 | java TenPerLine.
 *
 * Created by ag on 30-Jul-20 4:40 PM
 */
public class Ex10_1_TenPerLine {
  public static void main(String[] args) {
    final int FROM = 0, TO = 99;
//    StdOut.printf("Enter numbers in range %d - %d (Ctrl-d to stop)\n", FROM, TO);

    final int PER_LINE = 10;
    int counter = 0;

    while (!StdIn.isEmpty()) {
      int value = StdIn.readInt();

      if (value >= FROM && value <= TO) {
        StdOut.printf("%-4d", value);  // left alignment

        counter++;
        if (counter < PER_LINE) StdOut.printf(" ");
        else {
          counter = 0;
          StdOut.println();
        }
      }
    }
  }
}
