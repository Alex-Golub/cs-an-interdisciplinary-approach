package com.alexgo.week_2.web_exercises;

/**
 * 52. Write a program Diamond.java that takes a command-line argument N
 * and prints a (2N + 1)-by-(2N + 1) diamond like the one below.
 *    . . . . * . . . .
 *    . . . * * * . . .
 *    . . * * * * * . .
 *    . * * * * * * * .
 *    * * * * * * * * *
 *    . * * * * * * * .
 *    . . * * * * * . .
 *    . . . * * * . . .
 *    . . . . * . . . .
 *
 * Created by ag on 19-Oct-20 2:39 PM
 */
class Ex52_Diamond {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (Math.abs(i) + Math.abs(j) <= n)
          System.out.print("* ");
        else
          System.out.print(". ");
      }
      System.out.println();
    }
  }
}
