package com.alexgo.week_2.web_exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * 25. Friday the 13th.
 * What is the maximum number of consecutive days in which no Friday the 13th occurs?
 * Hint: The Gregorian calendar repeats itself every 400 years (146097 days)
 * so you only need to worry about a 400 year interval.
 *
 * Created by ag on 21-Sep-20 5:01 PM
 */
class Ex25_Friday_The_13th {
  public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println("Current date => " + date);

    final int PERIOD = 146_097; // Gregorian calendar repeats itself every 400 years
    int max = Integer.MIN_VALUE;
    int currCount = 0; // count consecutive days which are not Friday 13th

    for (int d = 1; d <= PERIOD; d++) {
      boolean isFriday = date.getDayOfWeek().equals(DayOfWeek.FRIDAY);
      boolean is13th = date.getDayOfMonth() == 13;
      if (isFriday && is13th) {
        if (currCount > max) {
          max = currCount;
        }
        currCount = -1;
      }

      currCount++;
      date = date.plusDays(1);
    }

    System.out.println(Math.max(max, currCount));
  }
}
