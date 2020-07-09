package com.alexgo.week_1.book._1_2_28_Order;

/**
 * 1.2.28 Order check.
 *  Write a program that takes three double command-line
 *  arguments x, y, and z and prints true if the values are strictly
 *  ascending or descending ( x < y < z or x > y > z ), and false otherwise.
 *
 * Created by ag on 09-Jul-20 11:45 AM
 */
class OrderCheck {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);
    double y = Double.parseDouble(args[1]);
    double z = Double.parseDouble(args[2]);

    if (x < y && y < z)
      System.out.println("Strictly ascending");
    else if (x > y && y > z)
      System.out.println("Strictly descending");
    else
      System.out.println("Not Strictly ascending nor descending");
  }
}
