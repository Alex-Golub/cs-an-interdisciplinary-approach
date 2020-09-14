package com.alexgo.week_2.book;

/**
 * 1.3.28 Run quick experiments to determine the impact of using the termination
 * condition (factor <= n/factor) instead of (factor < n) in Factors in program 1.3.9.
 *
 * For each method, find the largest n such that when you type in an n-digit
 * number, the program is sure to finish within 10 seconds.
 *
 * Created by ag on 16-Jul-20 11:46 AM
 */
class Ex1_3_28_Factors_test {
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]);   // 1111111111111111111
    System.out.println("Number is: " + n + "\n");

    long start = System.currentTimeMillis();
    primeFactorization_v1(n); // factor <= n / factor
    System.out.println((System.currentTimeMillis() - start) / 1000.0 + " sec");

    System.out.println();

    start = System.currentTimeMillis();
    primeFactorization_v2(n); // factor < n
    System.out.println((System.currentTimeMillis() - start) / 1000.0 + " sec");
  }

  private static void primeFactorization_v1(long n) {
    for (int factor = 2; factor <= n / factor; factor++) {
      while (n % factor == 0) {
        System.out.print(factor + " ");
        n /= factor;
      }
    }

    if (n > 1) System.out.println(n); // print if n is prime number

  }

  private static void primeFactorization_v2(long n) {
    for (int factor = 2; factor < n; factor++) {
      while (n % factor == 0) {
        System.out.print(factor + " ");
        n /= factor;
      }
    }
    if (n > 1) System.out.println(n);
  }
}
