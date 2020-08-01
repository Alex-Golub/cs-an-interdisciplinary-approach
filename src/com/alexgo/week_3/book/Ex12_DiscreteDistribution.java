package com.alexgo.week_3.book;

/**
 * 1.4.12 Write a program DiscreteDistribution that takes a variable number of
 * integer command-line arguments and prints the integer i with probability proportional
 * to the ith command-line argument.
 *
 * FIXME???
 *
 * Created by ag on 23-Jul-20 5:24 PM
 */
public class Ex12_DiscreteDistribution {
  public static void main(String[] args) {

    // read in frequency of occurrence of n values
    int n = args.length;
    int[] freq = new int[n];
    for (int i = 0; i < n; i++)
      freq[i] = Integer.parseInt(args[i]);

    // compute total count of all frequencies
    int total = 0;
    for (int i = 0; i < n; i++)
      total += freq[i];

    // generate random integer with probability proportional to frequency
    int r = (int) (total * Math.random());   // integer in [0, total)
    int sum = 0;
    int event = -1;
    for (int i = 0; i < n && sum <= r; i++) {
      sum += freq[i];
      event = i;
    }

    System.out.println(event);
  }
}
