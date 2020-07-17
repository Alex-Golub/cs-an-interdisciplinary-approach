package com.alexgo.week_2.book;

/**
 * 1.3.36 Counting primes.
 * Write a program PrimeCounter that takes an integer
 * command-line argument n and finds the number of primes less than or equal to n.
 * Use it to print out the number of primes less than or equal to 10 million. Note : If
 * you are not careful, your program may not finish in a reasonable amount of time!
 *
 * Best approach to use https://www.geeksforgeeks.org/sieve-of-eratosthenes/
 * discussed in next chapter (arrays)
 *
 * Created by ag on 16-Jul-20 4:36 PM
 */
class Ex1_3_36_PrimeCounter {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    final int PER_ROW = 10;

    long start = System.currentTimeMillis();

    for (int i = 2, r = 0; i <= n; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");

        r++;
        if (r % PER_ROW == 0) {
          System.out.println();
        }
      }
    }

    System.out.println("\n" + (System.currentTimeMillis() - start) / 1000.0 + "sec");
  }

  private static boolean isPrime(int n) {
    for (int i = 2, sqrt = (int) Math.sqrt(n); i < sqrt; i++) {
      if (n % i == 0) return false;
    }

    return true;
  }
}
