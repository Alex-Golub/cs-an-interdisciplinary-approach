package com.alexgo.week_2.web_exercises;

/**
 * 26. January 1.
 * Is January 1 more likely to fall on a Saturday or Sunday?
 * Write a program to determine the number of times each occurs in a 400 year interval.
 *
 * Created by ag on 21-Jul-20 4:54 PM
 */
class Ex26 {
  public static void main(String[] args) {
    int m = 1;
    int d = 1;
    int y = 2020;

    int sundays = 0, saturdays = 0;
    final int YEARS_INTERVAL = 400;

    for (int i = 1; i <= YEARS_INTERVAL; i++, y++) {
      int d0 = dayOfWeek(m, d, y);

      if (d0 == 0) sundays++;
      if (d0 == 6) saturdays++;
    }

    System.out.println("Sunday (" + sundays + ") times, Saturday (" + saturdays + ") times");

  }

  private static int dayOfWeek(int m, int d, int y) {
    int y0 = y - (14 - m) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    return (d + x + (31 * m0) / 12) % 7;
  }
}
