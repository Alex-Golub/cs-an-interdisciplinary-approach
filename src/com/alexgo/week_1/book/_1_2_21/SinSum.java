package com.alexgo.week_1.book._1_2_21;

/**
 * 1.2.21
 *  Write a program that takes a double command-line argument t and prints
 *  the value of sin(2t) + sin(3t)
 *
 * Created by ag on 08-Jul-20 3:49 PM
 */
class SinSum {
  public static void main(String[] args) {
    double t = Double.parseDouble(args[0]);  // in degrees

    double radians = Math.toRadians(t);  // Math.sin() arguments are in radians

    double result = Math.sin(2 * radians) + Math.sin(3 * radians);
    System.out.println(result);
  }
}
