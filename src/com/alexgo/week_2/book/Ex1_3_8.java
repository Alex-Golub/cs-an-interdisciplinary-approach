package com.alexgo.week_2.book;

/**
 * 1.3.8 Rewrite TenHellos to make a program Hellos that takes the number of
 * lines to print as a command-line argument. You may assume that the argument is
 * less than 1000.
 *
 * Hint: Use i % 10 and i % 100 to determine when to use st, nd, rd, or th for printing the i-th Hello.
 *
 * Created by ag on 13-Jul-20 7:30 PM
 */
class Ex1_3_8 {
  public static void main(String[] args) {
    int lines = Integer.parseInt(args[0]);

    for (int i = 1; i <= lines; i++) {
      if (i % 100 / 10 == 1) System.out.println(i + "-th hello");
      else if (i % 10 == 1)  System.out.println(i + "-st hello");
      else if (i % 10 == 2)  System.out.println(i + "-nd hello");
      else if (i % 10 == 3)  System.out.println(i + "-rd hello");
      else                   System.out.println(i + "-th hello");
    }
  }
}
