package com.alexgo.week_2.web_exercises;

/**
 * 1. Write a program RollDie.java that generates the result of rolling a
 * fair six-sided die (an integer between 1 and 6).
 *
 * Created by ag on 17-Jul-20 3:41 PM
 */
class Ex1_RollDie {
  public static void main(String[] args) {
    final int NO_OF_ROLLS = 20;
    final int PER_LINE = 5;
    final int SIDES = 6;

    for (int i = 1; i <= NO_OF_ROLLS; i++) {
      int rollResult = (int) (SIDES * Math.random() + 1);

      System.out.print(rollResult + " ");
      if (i % PER_LINE == 0) System.out.println();
    }
  }
}
