package com.alexgo.week_2.book;

/**
 * 1.3.34 Ramanujan’s taxi.
 * Verify this claim by writing a program
 * that takes an integer command-line argument n and prints all integers less than or
 * equal to n that can be expressed as the sum of two cubes in two different ways. In
 * other words, find distinct positive integers a, b, c, and d such that a^3 + b^3 = c^3 + d^3.
 * Use four nested for loops.
 *
 * Created by ag on 16-Jul-20 2:23 PM
 */
class Ex1_3_34_Ramanujans_taxi {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    for (int a = 1; a <= n; a++) {
      int a3 = a * a * a;
      if (a3 > n) break;

      for (int b = a; b <= n; b++) {
        int b3 = b * b * b;
        if (a3 + b3 > n) break;

        for (int c = a + 1; c <= n; c++) {
          int c3 = c * c * c;
          if (c3 > a3 + b3) break;

          for (int d = c; d <= n; d++) {
            int d3 = d * d * d;
            if (c3 + d3 > a3 + b3) break;

            if (c3 + d3 == a3 + b3)
              System.out.printf("%,d = %,d^3 + %,d^3 = %,d^3 + %,d^3%n", a3 + b3, a3, b3, c3, d3);
          }
        }
      }
    }
  }
}
