package com.alexgo.week_2.book;

/**
 * 1.3.31 Write a program RelativelyPrime that takes an integer command-line
 * argument n and prints an n-by-n table such that there is an * in row i and column
 * j if the gcd of i and j is 1 (i and j are relatively prime) and a space in that position
 * otherwise.
 *
 * Created by ag on 16-Jul-20 1:16 PM
 */
class Ex1_3_31_RelativelyPrime {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // Headers numbers
    for (int i = 1; i <= n; i++) System.out.printf("%5d", i);
    System.out.println();

    for (int i = 1; i <= n; i++) {
      System.out.printf("%-4d", i);
      for (int j = 1; j <=n ;j++) {
        System.out.printf("%-5s", gcd(i, j) == 1 ? "*" : " ");
      }
      System.out.println();
    }
  }

  private static int gcd(int i, int j) {
    while (j != 0) {
      int t = i;
      i = j;
      j = t % j;
    }
    return i;
  }
}
