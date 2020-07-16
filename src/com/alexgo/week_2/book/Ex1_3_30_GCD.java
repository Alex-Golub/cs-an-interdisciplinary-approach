package com.alexgo.week_2.book;

/**
 * 1.3.30 Write a program GreatestCommonDivisor that finds the greatest common
 * divisor (gcd) of two integers using Euclid’s algorithm, which is an iterative computation based
 * on the following observation: if x is greater than y, then if y divides x,
 * the gcd of x and y is y; otherwise, the gcd of x and y is the same as the gcd of x % y
 * and y.
 *
 * gcd{a,b} = gcd{|a|,b} = gcd{a,|b|} = gcd{|a|,|b|}
 * proof: https://proofwiki.org/wiki/GCD_for_Negative_Integers
 *
 * javac Ex1_3_30_GCD.class
 * java Ex1_3_30_GCD 91 53
 * Euclid's Algorithm: GCD(91, 53) = 1
 * Brute Force: GCD(91, 53) = 1
 *
 * java Ex1_3_30_GCD 25 15
 * GCD(25, 15) = 5
 *
 * java Ex1_3_30_GCD -15 25
 * Euclid's Algorithm: GCD(-15, 25) = 5
 * Brute Force: GCD(-15, 25) = 5
 *
 * Created by ag on 16-Jul-20 12:29 PM
 */
class Ex1_3_30_GCD {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);

    euclidAlgorithm(x, y);

    gcd_v2(x, y);
  }

  private static void gcd_v2(int x, int y) {
    System.out.printf("Brute Force: GCD(%d, %d) = ", x, y);
    int gcd = 1;
    x = Math.abs(x);
    y = Math.abs(y);

    // GCD is at least the difference between two number or less
    for (int i = Math.abs(x - y); i >= 1; i--) {
      if (x % i == 0 && y % i == 0) {
        gcd = i;
        break;
      }
    }
    System.out.println(gcd);
  }

  private static void euclidAlgorithm(int x, int y) {
    System.out.printf("Euclid's Algorithm: GCD(%d, %d) = ", x, y);

    // Allow to calculate gcd of negative numbers
    x = Math.abs(x);
    y = Math.abs(y);

    while (y != 0) {
      int t = x;
      x = y;
      y = t % y;
    }

    System.out.println(x);
  }
}
