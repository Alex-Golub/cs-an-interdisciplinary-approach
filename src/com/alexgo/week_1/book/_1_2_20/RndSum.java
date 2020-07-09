package com.alexgo.week_1.book._1_2_20;

/**
 * 1.2.20
 *  Write a program that prints the sum of two random integers between 1 and
 *  6 (such as you might get when rolling dice).
 *
 * Created by ag on 08-Jul-20 3:44 PM
 */
class RndSum {
  public static void main(String[] args) {
    int DICE_SIDES = 6;

    int n1 = (int) (Math.random() * DICE_SIDES) + 1;  // [0, 5] + 1 => [1, 6]
    int n2 = (int) (Math.random() * DICE_SIDES) + 1;

    System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
  }
}
