package com.alexgo.week_2.book;

/**
 * 1.3.5 Write a program RollLoadedDie that prints the result of rolling a loaded
 *  die such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8 and the probability of
 *  getting a 6 is 3/8.
 *
 * Created by ag on 13-Jul-20 6:41 PM
 */
class Ex1_3_5_RollLoadedDie {
  public static void main(String[] args) {

    double rnd = Math.random(); // random number [0, 1)

    int result;
    if      (rnd < (1 / 8.0)) result = 1;
    else if (rnd < (2 / 8.0)) result = 2;
    else if (rnd < (3 / 8.0)) result = 3;
    else if (rnd < (4 / 8.0)) result = 4;
    else if (rnd < (5 / 8.0)) result = 5;
    else                      result = 6; // 3 possibilities left from 8

    System.out.println(result);
  }
}
