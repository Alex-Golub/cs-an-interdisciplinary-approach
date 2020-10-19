package com.alexgo.week_2.web_exercises;

/**
 * 64. Sorting networks.
 * Write a program Sort3.java with three if statements
 * (and no loops) that reads in three
 * integers a, b, and c from the command line and
 * prints them out in ascending order.
 *
 * Created by ag on 19-Oct-20 4:18 PM
 */
class Ex64_Sort3 {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    if (a > b) {
      a = a + b;
      b = a - b;
      a = a - b;
    }
    if (a > c) {
      a = a + c;
      c = a - c;
      a = a - c;
    }
    if (b > c) {
      b = b + c;
      c = b - c;
      b = b - c;
    }

    System.out.println(a + " " + b + " " + c);
  }


}
