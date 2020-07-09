package com.alexgo.week_1.book._1_2_19;

/**
 * 1.2.19
 * Write a program that takes two integer command-line arguments a and b
 * and prints a random integer between a and b, inclusive.
 *
 * Created by ag on 08-Jul-20 3:05 PM
 */
class RandomNo {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    int max = Math.max(a, b);
    int min = Math.min(a, b);

    int rndNo = (int) (Math.random() * (max - min + 1)) + min; // [min, max]
    System.out.println(rndNo);

  }
}
