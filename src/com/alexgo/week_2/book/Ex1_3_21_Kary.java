package com.alexgo.week_2.book;

/**
 * 1.3.21 Modify Binary to get a program Kary that takes two integer commandline arguments i and k
 * and converts i to base k.
 * Assume that i is an integer in Java’s long data type and that k is an integer between 2 and 16.
 * For bases greater than 10, use the letters A through F to represent
 * the 11th through 16th digits, respectively.
 *
 * javac Ex1_3_21_Kary.class
 * java Ex1_3_21_Kary 9999999 16
 * 98967F
 *
 * java Ex1_3_21_Kary 2748 16
 * ABC
 *
 * java Ex1_3_21_Kary 2748 8
 * 5274
 *
 * java Ex1_3_21_Kary 2748 2
 * 101010111100
 *
 * java Ex1_3_21_Kary 2748 17
 * Base range 2 - 16, given 17
 *
 * Created by ag on 15-Jul-20 10:58 PM
 */
class Ex1_3_21_Kary {
  public static void main(String[] args) {
    long i = Long.parseLong(args[0]);   // number to convert
    int k = Integer.parseInt(args[1]);  // base to convert i to (assuming k = [2, 16]

    // accumulate multiples of base k
    long power = 1;
    while (power <= i / k)
      power *= k;

    while (power > 0) {
      int result;

      if (i < power) {
        // can't cast powers of k from number i
        result = (int) (i % k);
      } else {
        // i is greater then power, cast it from i
        result = (int) (i / power);
        i -= (result * power);
      }

      switch (result) {
        case 10: System.out.print("A"); break;
        case 11: System.out.print("B"); break;
        case 12: System.out.print("C"); break;
        case 13: System.out.print("D"); break;
        case 14: System.out.print("E"); break;
        case 15: System.out.print("F"); break;
        default: System.out.print(result);
      }

      power /= k;
    }
  }

  public static void binary(int n) {
    int power = 1;
    while (power <= n / 2)
      power *= 2;

    // Now power is the largest power of 2 <= n.
    while (power > 0) { // Cast out powers of 2 in decreasing order.
      if (n < power) {
        System.out.print(0);
      } else {
        System.out.print(1);
        n -= power;
      }
      power /= 2;
    }

    System.out.println();
  }
}

