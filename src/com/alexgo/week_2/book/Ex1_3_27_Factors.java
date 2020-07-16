package com.alexgo.week_2.book;

/**
 * 1.3.27 Modify Factors to print just one copy each of the prime divisors.
 *
 * javac Ex1_3_27_Factors.class
 * java Ex1_3_27_Factors 451265412
 * 2 2 3 13 541 5347
 *
 * 11ms
 * 2 3 13 541 5347
 * 7ms
 *
 * Created by ag on 16-Jul-20 11:25 AM
 */
class Ex1_3_27_Factors {
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]);

    primeFactorization_v1(n);
    System.out.println();
    primeFactorization_v2(n);
  }

  private static void primeFactorization_v1(long n) {
    long start = System.currentTimeMillis();

    for (long factor = 2; factor <= n / factor; factor++) { // Test potential factor.
      while (n % factor == 0) { // Cast out and print factor.
        n /= factor;
        System.out.print(factor + " ");
      } // Any factor of n must be greater than factor.
    }
    if (n > 1) System.out.print(n);

    System.out.println("\n" + (System.currentTimeMillis() - start) + "ms");
  }

  private static void primeFactorization_v2(long n) {
    long start = System.currentTimeMillis();

    for (int factor = 2; factor <= n / factor; factor++) {
      if (n % factor == 0) {
        System.out.print(factor + " ");

        // cast out all possible factors from n
        while (n % factor == 0) n /= factor;
      }
    }

    if (n > 1) System.out.print(n);

    System.out.println("\n" + (System.currentTimeMillis() - start) + "ms");
  }
}
