package com.alexgo.week_2.book;

/**
 * 1.3.17 Expand your solution to exercise 1.2.24 to print a table giving the total
 * amount of money you would have after t years for t = 0 to 25.
 *
 * Created by ag on 14-Jul-20 5:20 PM
 */
class Ex1_3_17 {
  public static void main(String[] args) {
    double p = 100.0;  // Starting Principal
    double r = 5;      // Interest Rate in percent

    final int UP_TO_YEAR = 25;
    System.out.printf("%-8s%-8s%-8s%n", "Years", "Rate(%)", "Amount of Money");
    for (int years = 1; years <= UP_TO_YEAR; years++) {
      double money = p * Math.pow(Math.E, years * r / 100);
      System.out.printf("%-8d%-8.1f$%-8.2f%n", years, r, money);
    }

    System.out.println(Math.sqrt(Integer.MAX_VALUE));
  }
}
