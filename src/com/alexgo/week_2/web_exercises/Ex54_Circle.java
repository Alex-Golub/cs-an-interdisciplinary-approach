package com.alexgo.week_2.web_exercises;

/**
 * Created by ag on 19-Oct-20 2:49 PM
 */
class Ex54_Circle {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int i = -n; i <= n; i++) {
      for (int j = -n; j <= n; j++) {
        if (i * i + j * j <= n * n) System.out.print("* ");
        else System.out.print(". ");
      }
      System.out.println();
    }
  }
}
