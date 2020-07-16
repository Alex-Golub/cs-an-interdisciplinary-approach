package com.alexgo.week_2.book;

/**
 * 1.3.6 Improve your solution to exercise 1.2.25 by adding code to check that the
 *  values of the command-line arguments fall within the ranges of validity of the formula,
 *  and by also adding code to print out an error message if that is not the case.
 *
 * NOTE: The formula: w = 35.74 + 0.6215T + (0.4275T + 35.75) v^0.16
 * is not valid if T is larger than 50 in absolute value or if v is larger than
 * 120 or less than 3
 *
 * javac Ex1_3_6.class
 * java Ex1_3_6 -35 1
 * Wind speed range is [3.0 - 120.0] instead got 1.0
 *
 * java Ex1_3_6 -95 55
 * Temperature absolute value should be less then or equal to 50, instead got 95.0
 *
 * java Ex1_3_6 -35 69
 * Temperature(F):    -35.0
 * Wind Speed(mil/h): 69.0
 * Wind Chill:        54.91527325370352
 *
 * Created by ag on 13-Jul-20 6:57 PM
 */
class Ex1_3_6 {
  public static void main(String[] args) {
    double t = Double.parseDouble(args[0]);  // temperature in Fahrenheit
    double v = Double.parseDouble(args[1]);  // wind speed in miles/hour

    if (Math.abs(t) > 50.0) {
      System.out.println("Temperature absolute value should be less then or equal to 50, instead got " + Math.abs(t));
    } else if (v > 120.0 || v < 3.0) {
      System.out.println("Wind speed range is [3.0 - 120.0] instead got " + v);
    } else {
      double windChill = 35.74 + (0.6215 * t) + (0.4275 * t + 35.75) * Math.pow(v, 0.16);
      System.out.println("Temperature(F):    " + t + "\n" +
                         "Wind Speed(mil/h): " + v + "\n" +
                         "Wind Chill:        " + windChill);
    }
  }
}
