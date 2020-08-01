package com.alexgo.week_4.assignment;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * Shannon entropy.
 * Write a program ShannonEntropy.java that takes a command-line integer m;
 * reads a sequence of integers between 1 and m from standard input;
 * and prints the Shannon entropy to standard output, with 4 digits after the decimal point.
 * <p>
 * The Shannon entropy of a sequence of integers is given by the formula:
 * where pi denotes the proportion of integers whose value is i.
 * If pi=0, then treat pi log2pi as 0.
 * <p>
 * The Shannon entropy is a measure of the rate of information produced by a random source,
 * such as the outcomes of flipping a fair coin or rolling a loaded die.
 * It is a fundamental concept in information theory and data compression.
 * <p>
 * Created by ag on 01-Aug-20 6:04 PM
 */
public class ShannonEntropy {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    double h = 0.0;
    int counter = 0;

    // Read and count occurrence
    int[] nums = new int[m + 1]; // [1, m]
    while (!StdIn.isEmpty()) {
      int value = StdIn.readInt();
      if (value >= 1 && value <= m) { // ignore values less then 1 and grater then m
        nums[value]++;
        counter++;
      }
    }

    // Calculate Shannon entropy
    for (int i = 1; i <= m; i++) {
      double pi = (nums[i] == 0) ? 0 : (1.0 * nums[i] / counter);
      h += (pi == 0) ? 0 : pi * Math.log(pi) / Math.log(2);
    }

    StdOut.printf("%.4f", -h);
  }
}

