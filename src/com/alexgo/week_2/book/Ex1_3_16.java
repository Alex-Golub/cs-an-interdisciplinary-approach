package com.alexgo.week_2.book;

/**
 * 1.3.16 Write a program that takes an integer command-line argument n and
 * prints all the positive powers of 2 less than or equal to n.
 * Make sure that your program works properly for all values of n.
 *
 * javac Ex1_3_16.java
 * java Ex1_3_16 17
 * 2^0 = 1
 * 2^1 = 2
 * 2^2 = 4
 * 2^3 = 8
 * 2^4 = 16
 *
 * Created by ag on 14-Jul-20 5:09 PM
 */
class Ex1_3_16 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // power - will store powers of 2 starting from 1 (2^0)
    // exp   - to print 2^i
    for (int power = 1, exp = 0; power <= n; power *= 2, exp++) {
      System.out.println("2^" + exp + " = " + power);
    }
  }
}
