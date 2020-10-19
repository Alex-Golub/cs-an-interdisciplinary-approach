package com.alexgo.week_2.web_exercises;

/**
 * 17. Write a program using a loop and four conditionals to print
 *      12 midnight
 *      1am
 *      2am
 *      ...
 *      12 noon
 *      1pm
 *      ...
 *      11pm
 *
 * Created by ag on 19-Jul-20 4:43 PM
 */
class Ex17_Time {
  public static void main(String[] args) {
    int time = 0;
    final int MIDNIGHT = 24;

    while (time < MIDNIGHT) {
      if      (time == 0)  System.out.println("12 midnight");
      else if (time < 12)  System.out.println(time + "am");
      else if (time == 12) System.out.println(time + " noon");
      else                 System.out.println(time + "pm");

      time++;
    }
  }
}
