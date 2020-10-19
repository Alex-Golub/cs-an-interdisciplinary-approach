package com.alexgo.week_2.web_exercises;

/**
 * 49. Write a program Triangle.java that takes a command-line argument N and
 * prints an N-by-N triangular pattern like the one below.
 *        * * * * * *
 *        . * * * * *
 *        . . * * * *
 *        . . . * * *
 *        . . . . * *
 *        . . . . . *
 *
 * Created by ag on 05-Oct-20 3:29 PM
 */
class Ex49_Triangle {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

//    for (int i = 0; i < n; i++) {
//      for (int j = 0; j < i; j++)
//        System.out.print(". ");
//      for (int k = 0; k < n - i; k++)
//        System.out.print("* ");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i * i <= j * j)
          System.out.print("* ");
        else
          System.out.print(". ");
      }
      System.out.println();
    }
  }
}
