package com.alexgo.week_3.assignment;

/**
 * 2. Thue–Morse weave.
 * Write a program ThueMorse.java that takes an integer command-line argument n and prints an n-by-n
 * pattern like the ones below.
 * Include two space characters between each + and - character.
 *
 * The Thue–Morse sequence is an infinite sequence of 0s and 1s that is constructed by starting
 * with 0 and successively appending the BITWISE NEGATION (INTERCHANGE 0s AND 1s) OF THE EXISTING SEQUENCE.
 *
 * Here are the first few steps of this construction:
 * 0
 * 01
 * 0110
 * 01101001
 * 0110100110010110
 *
 * To visualize the Thue–Morse sequence, create an n-by-n pattern by printing a + (plus sign)
 * in row i and column j if bits i and j in the sequence are equal, and a - (minus sign) if they are different.
 *
 * Note: you may assume that n is a positive integer (but it need not be a power of 2).
 *
 * Created by ag on 25-Jul-20 2:12 PM
 */
public class ThueMorse {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int[] thue = new int[n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {

        if      (j == 0)     thue[j] = 0;
        else if (j % 2 == 0) thue[j] = thue[j / 2];
        else                 thue[j] = 1 - thue[j - 1];

        if (thue[j] == thue[i]) System.out.print("+");
        else                    System.out.print("-");

        if (j + 1 < n)
          System.out.print("  ");
      }
      System.out.println();
    }
  }
}