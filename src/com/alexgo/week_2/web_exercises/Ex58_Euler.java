package com.alexgo.week_2.web_exercises;

/**
 * 58. Euler's sum of powers conjecture.
 * Disprove the conjecture by finding positive integers a, b, c, d, and e
 * such that a^5 + b^5 + c^5 + d^5= e^5.
 * Write a program Euler.java that reads in a command line parameter N
 * and exhaustively searches for all such solutions
 * with a, b, c, d, and e less than or equal to N.
 *
 * Created by ag on 19-Oct-20 3:51 PM
 */
class Ex58_Euler {
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]); // try with 100, 150, 500(will take some time)
    long a5, b5, c5, d5, e5;

    for (long e = 1; e <= n; e++) {
      e5 = e * e * e * e * e;

      for (long a = 1; a <= n; a++) {
        a5 = a * a * a * a * a;
        if (a5 + a5 + a5 + a5 > e5)
          break;

        for (long b = a; b <= n; b++) {
          b5 = b * b * b * b * b;
          if (a5 + b5 + b5 + b5 > e5)
            break;

          for (long c = b; c <= n; c++) {
            c5 = c * c * c * c * c;
            if (a5 + b5 + c5 + c5 > e5)
              break;

            for (long d = c; d <= n; d++) {
              d5 = d * d * d * d * d;
              long sum = a5 + b5 + c5 + d5;

              if (sum > e5)
                break;
              if (sum == e5)
                System.out.println(a + "^5 + " + b + "^5 + " + c + "^5 + " + d + "^5 = " + e + "^5");
            }
          }
        }
      }
    }
  }
}
