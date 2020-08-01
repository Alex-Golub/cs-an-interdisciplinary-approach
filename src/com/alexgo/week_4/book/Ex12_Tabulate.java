package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.12 Write a program that reads in lines from standard input with each line
 * containing a name and two integers and then uses printf() to print a table with a
 * column of the names, the integers, and the result of dividing the first by the second,
 * accurate to three decimal places.
 * You could use a program like this to tabulate batting averages for baseball players or grades for students.
 *
 * Created by ag on 30-Jul-20 6:15 PM
 */
class Ex12_Tabulate {
  public static void main(String[] args) {
    StdOut.println("Enter name and two integer values");

    String[] lines = new String[0];
    while (!StdIn.isEmpty())
      lines = StdIn.readAllStrings();

    for (int i = 0; i < lines.length - 2; i += 3) {
      String name = lines[i];
      int n1 = Integer.parseInt(lines[i + 1]);
      int n2 = Integer.parseInt(lines[i + 2]);

      StdOut.printf("%-15s%-5d%-5d%-5.3f\n", name, n1, n2, 1.0 * n1 / n2);
    }
  }
}
