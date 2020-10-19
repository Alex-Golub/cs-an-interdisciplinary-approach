package com.alexgo.week_2.web_exercises;

/**
 * 20. Rewrite DayOfWeek.java from Exercise 1.2.29 so that it prints the day
 * of the week as Sunday, Monday, and so forth instead of an integer
 * between 0 and 6.
 *
 * Created by ag on 20-Jul-20 8:22 PM
 */
class Ex20_DayOfWeek {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);
    int d = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);

    int y0 = y - (14 - m) / 12;
    int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
    int m0 = m + 12 * ((14 - m) / 12) - 2;
    int d0 = (d + x + (31 * m0) / 12) % 7;

    switch (d0) {
      case 0:
        System.out.println("Sunday");
        break;
      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
        break;
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      case 6:
        System.out.println("Saturday");
        break;
    }
  }
}
