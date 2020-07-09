package com.alexgo.week_1.book._1_2_30_Uniform_numbers;

/**
 * 1.2.30 Uniform random numbers.
 *  Write a program that prints five uniform random numbers between 0 and 1,
 *  their average value, and their minimum and maximum values.
 *  Use Math.random(), Math.min(), and Math.max().
 *
 * Created by ag on 09-Jul-20 12:06 PM
 */
class UniformNumbers {
  public static void main(String[] args) {
    final int NUMBERS = 5;

    // Numbers will be stored in array of size NUMBERS
    double[] rndNumbers = new double[NUMBERS];

    double max = Double.MIN_VALUE;
    double min = Double.MAX_VALUE;
    double total = 0;

    // Get numbers and find max and min
    for (int i = 0; i < NUMBERS; i++) {
      rndNumbers[i] = Math.random(); // [0, 1)

      System.out.println((i + 1) + ": " + rndNumbers[i]);

      max = Math.max(max, rndNumbers[i]);
      min = Math.min(min, rndNumbers[i]);

      total += rndNumbers[i];
    }

    System.out.println("\nAverage: " + (total / NUMBERS) + "\nMax: " + max + "\nMin: " + min);

  }
}
