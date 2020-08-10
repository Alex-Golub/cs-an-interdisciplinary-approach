package com.alexgo.week_5.assignment;/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class Divisors {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);

    StdOut.printf("gcd(%s, %s) = %s\n", n1, n2, gcd(n1, n2));
    StdOut.printf("lcm(%s, %s) = %s\n", n1, n2, lcm(n1, n2));
    StdOut.printf("areRelativelyPrime(%s, %s) = %s\n", n1, n2, areRelativelyPrime(n1, n2));
    StdOut.printf("totient(%s) = %s\n", n1, totient(n1));
    StdOut.printf("totient(%s) = %s\n", n2, totient(n2));
  }

  // Returns the greatest common divisor of a and b.
  public static int gcd(int a, int b) {
    if (a == 0 && b == 0) return 0;

    // Euclid’s algorithm
    a = Math.abs(a);
    b = Math.abs(b);
    while (b != 0) {
      int t = a;
      a = b;
      b = t % b;
    }

    return a;
  }

  // Returns the least common multiple of a and b.
  // lcm(a, b) x hcf(a, b) = a x b
  public static int lcm(int a, int b) {
    if (a == 0 || b == 0) return 0;

    // perform division before multiplication to prevent integer overflow
    return Math.abs(a) * (Math.abs(b) / Divisors.gcd(a, b));
  }

  // Returns true if a and b are relatively prime; false otherwise.
  // Two integers a and b are relatively prime if and only if gcd(a, b) == 1
  public static boolean areRelativelyPrime(int a, int b) {
    return Divisors.gcd(a, b) == 1;
  }

  // Returns the number of integers between 1 and n that are
  // relatively prime with n.
  public static int totient(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;

    int counter = 0;
    for (int i = 1; i < n; i++)
      counter += Divisors.areRelativelyPrime(n, i) ? 1 : 0;

    return counter;
  }
}
