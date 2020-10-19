package com.alexgo.week_2.web_exercises;

/**
 * 50. Write a program Ex.java that takes a command-line argument
 * N and prints a (2N + 1)-by-(2N + 1) ex like the one below.
 * Use two for loops and one if-else statement.
 *      * . . . . . *
 *      . * . . . * .
 *      . . * . * . .
 *      . . . * . . .
 *      . . * . * . .
 *      . * . . . * .
 *      * . . . . . *
 *
 * Created by ag on 19-Oct-20 1:42 PM
 */
class Ex50_Ex {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (i == j || i == -j)
          System.out.print("* ");
        else
          System.out.print(". ");
      }
      System.out.println();
    }
  }
}
