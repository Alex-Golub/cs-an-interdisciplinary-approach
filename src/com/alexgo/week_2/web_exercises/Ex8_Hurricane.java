package com.alexgo.week_2.web_exercises;

/**
 * 8. Write a program Hurricane.java that that takes the wind speed (in miles per hour) as an integer
 * command-line argument and prints whether it qualifies as a hurricane,
 * and if so, whether it is a Category 1, 2, 3, 4, or 5 hurricane.
 * Below is a table of the wind speeds according to the Saffir-Simpson scale.
 *
 * javac Ex8_Hurricane.class
 * java Ex8_Hurricane 15
 * Wind speed 15 mile/hour is not qualified to be a Hurricane
 *
 * Created by ag on 19-Jul-20 2:19 PM
 */
public class Ex8_Hurricane {
  public static void main(String[] args) {
    int windSpeed = Integer.parseInt(args[0]);  // miles/hour

    final int MIN_SPEED = 74;
    if (windSpeed < MIN_SPEED) {
      System.out.println("Wind speed " + windSpeed + " mile/hour is not qualified to be a Hurricane");
    } else {
      System.out.print("Category ");
      if      (windSpeed <= 95)  System.out.println(1);
      else if (windSpeed <= 110) System.out.println(2);
      else if (windSpeed <= 130) System.out.println(3);
      else if (windSpeed <= 155) System.out.println(4);
      else                       System.out.println(5);
    }
  }
}
