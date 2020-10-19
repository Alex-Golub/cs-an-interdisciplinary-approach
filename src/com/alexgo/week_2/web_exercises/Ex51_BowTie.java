package com.alexgo.week_2.web_exercises;

/**
 * 51. Write a program BowTie.java that takes a command-line argument N
 * and prints a (2N + 1)-by-(2N + 1) bowtie like the one below.
 * Use two for loops and one if-else statement.
 *      * . . . . . *
 *      * * . . . * *
 *      * * * . * * *
 *      * * * * * * *
 *      * * * . * * *
 *      * * . . . * *
 *      * . . . . . *
 *
 * Created by ag on 19-Oct-20 2:18 PM
 */
class Ex51_BowTie {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (i * i <= j * j)
          System.out.print("* ");
        else
          System.out.print(". ");
      }
      System.out.println();
    }
  }
}
