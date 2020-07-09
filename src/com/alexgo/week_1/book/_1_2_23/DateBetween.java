package com.alexgo.week_1.book._1_2_23;

/**
 * 1.2.23
 *  Write a program that takes two integer command-line arguments m and
 *  d and prints true if day d of month m is between 3/20 and 6/20, false otherwise.
 *
 * Created by ag on 08-Jul-20 4:08 PM
 */
class DateBetween {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);

     boolean isBetween = (m == 3 && d >= 20 && d <= 31) ||
                         (m == 4 && d >= 1 && d <= 30) ||
                         (m == 5 && d >= 1 && d <= 31) ||
                         (m == 6 && d >= 1 && d <= 20);

    System.out.println(isBetween);
  }
}
