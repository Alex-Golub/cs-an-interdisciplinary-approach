package com.alexgo.week_2.web_exercises;

import java.util.Arrays;

/**
 * 48. Making change.
 * Write a program that reads in a command line integer N (number of pennies)
 * and prints the best way (fewest number of coins) to make change using US
 * coins (quarters, dimes, nickels, and pennies only).
 * For example, if N = 73 then print
 * 2 quarters
 * 2 dimes
 * 3 pennies
 *
 * Created by ag on 05-Oct-20 2:47 PM 
 */
class Ex48_Change {
  public static void main(String[] args) {
    int   N      = Integer.parseInt(args[0]);
    int[] coins  = new int[] {1, 5, 10, 25};
    int[] change = new int[4]; // [pennies, nickels, dimes, quarters]

    // greedy algorithm.
    // That is, dispense as many quarters as possible,
    // then dimes, then nickels, and finally pennies.
    for (int i = coins.length - 1; N > 0; i--) {
      System.out.println(Arrays.toString(change) + " N = " + N);
      while (N - coins[i] >= 0) {
        change[i]++;
        N -= coins[i];
        System.out.print(Arrays.toString(change));
        System.out.printf(" N = %d - %d\n", N + coins[i], coins[i]);
      }
    }

//    int q = N / 25;
//    int d = (N - q * 25) / 10;
//    int n = (N - (q * 25 + d * 10)) / 5;
//    int p = N - (q * 25 + d * 10 + n * 5);

    System.out.println(change[3] + " quarters");
    System.out.println(change[2] + " dimes");
    System.out.println(change[1] + " nickles");
    System.out.println(change[0] + " pennies");
  }
}
