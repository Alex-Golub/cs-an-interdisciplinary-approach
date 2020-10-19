package com.alexgo.week_2.web_exercises;

/**
 * 39. Write a program NPerLine.java that takes an integer command-line
 * argument n and prints the integers from 10 to 99 with n integers per line.
 *
 * Created by ag on 28-Sep-20 5:39 PM 
 */
class Ex39_NPerLine {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    final int FROM = 10, TO = 99;
    for (int i = FROM; i <= TO; i++) {
      System.out.print(i + " ");
      if ((i - FROM + 1) % n == 0)
        System.out.println();
    }
  }
}
