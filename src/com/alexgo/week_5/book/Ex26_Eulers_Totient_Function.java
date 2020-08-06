package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.26 Euler’s totient function.
 * Euler’s totient function is an important function
 * in number theory: φ(n) is defined as the number of positive integers less than or
 * equal to n that are relatively prime with n (no factors in common with n other than 1).
 *
 * Write a class with a static method that takes an integer argument n and returns
 * φ(n), and a main() that takes an integer command-line argument, calls the method
 * with that argument, and prints the resulting value.
 *
 * https://en.wikipedia.org/wiki/Euler%27s_totient_function
 *
 * Created by ag on 05-Aug-20 12:45 PM
 */
class Ex26_Eulers_Totient_Function {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
      int n = StdIn.readInt();
      StdOut.printf("φ(%d) = %,d\n", n, totient(n));
    }
  }

  private static int totient(int n) {
    boolean[] primeFactors = factorize(n);

    // Euler's product formula
    int phi = n;
    for (int i = 2; i < primeFactors.length; i++)
      if (primeFactors[i]) phi *= (1 - 1.0 / i);

    return phi;
  }

  // Prime factorization of a number i.e. n = p1 x p2 x p3 x ... pi
  // This method does not count power of factors of a number
  private static boolean[] factorize(int n) {
    boolean[] factors = new boolean[n + 1];

    for (int f = 2; f <= n / f; f++) {
      while (n % f == 0) {  // remove factor from n as long as reminder is zero
        factors[f] = true;
        n /= f;
      }

      // factor can't be removed equally from n, go to next factor
    }

    if (n > 1) factors[n] = true;

    return factors;
  }


}
