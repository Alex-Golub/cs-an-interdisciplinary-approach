package com.alexgo.week_1.book._1_2_25_Wind_chill;

/**
 * 1.2.25 Wind chill.
 *  Given the temperature T (in degrees Fahrenheit) and the wind
 *  speed v (in miles per hour), the National Weather Service defines the effective temperature (the wind chill) as follows:
 *  w = 35.74 + 0.6215T + (0.4275T + 35.75) v^0.16
 *
 *  Note: The formula is not valid if T is larger than 50 in absolute value or if v is larger than
 *  120 or less than 3 (you may assume that the values you get are in that range).
 *
 * Created by ag on 09-Jul-20 10:49 AM
 */
class WindChill {
  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("not enough parameters");
      return;
    }

    double t = Double.parseDouble(args[0]);  // temperature in Fahrenheit
    double v = Double.parseDouble(args[1]);  // wind speed in miles/hour

    if (Math.abs(t) > 50.0 || v > 120.0 || v < 3.0) {
      System.out.println("|Temperature| > 50.0 or Wind speed > 120 or < 3");
      return;
    }

    double windChill = 35.74 + (0.6215 * t) + (0.4275 * t + 35.75) * Math.pow(v, 0.16);
    System.out.println("Temperature(F): " + t + "\nWind Speed(mil/h): " + v + "\nWind Chill: " + windChill);
  }
}
