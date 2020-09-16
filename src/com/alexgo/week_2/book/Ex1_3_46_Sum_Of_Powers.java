package com.alexgo.week_2.book;

/**
 * 1.3.46 Euler’s sum-of-powers conjecture.
 * In 1769 Leonhard Euler formulated a generalized version of Fermat’s Last Theorem,
 * conjecturing that at least n nth powers are needed to obtain a sum that is itself
 * an nth power, for n > 2.
 * Write a program to disprove Euler’s conjecture (which stood until 1967), using a
 * quintuply nested loop to find four positive integers whose 5th power sums to the 5th
 * power of another positive integer.
 * That is, find a, b, c, d, and e such that a^5 + b^5 + c^5 + d^5 = e^5.
 * Use the long data type.
 *
 * Created by ag on 16-Sep-20 3:20 PM
 */
class Ex1_3_46_Sum_Of_Powers {
  public static void main(String[] args) {
    long limit = Long.parseLong(args[0]);
    long a5, b5, c5, d5, e5;

    for (long e = 1; e <= limit; e++) {
      e5 = e * e * e * e * e;

      for (long a = 1; a <= limit; a++) {
        a5 = a * a * a * a * a;
        if (a5 + a5 + a5 + a5 > e5) break;

        for (long b = a; b <= limit; b++) {
          b5 = b * b * b * b * b;
          if (a5 + b5 + b5 + b5 > e5) break;

          for (long c = b; c <= limit; c++) {
            c5 = c * c * c * c * c;
            if (a5 + b5 + c5 + c5 > e5) break;

            for (long d = c; d <= limit; d++) {
              d5 = d * d * d * d * d;
              if (a5 + b5 + c5 + d5 > e5) break;

              if (a5 + b5 + c5 + d5 == e5)
                System.out.printf("%d^5 + %d^5 + %d^5 + %d^5 = %d^5\n",
                        a, b, c, d, e);
            }
          }
        }
      }
    }
  }
}
