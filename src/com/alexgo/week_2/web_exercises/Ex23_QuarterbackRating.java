package com.alexgo.week_2.web_exercises;

/**
 * 23. Write a program QuarterbackRating.java that takes five command line inputs
 * A, B, C, D, and E, and prints the quarterback rating.
 *
 * javac Ex23_QuarterbackRating.class
 *
 * java Ex23_QuarterbackRating 324 461 3969 35 10
 * Completion ratio 33.568329718004335
 * Yards per pass 23.373101952277658
 * Touchdown ratio 25.307302964569775
 * Interception ratio 30.545010845986987
 * Quarterback rating => 112.79374548083877
 *
 * Created by ag on 20-Jul-20 9:50 PM
 */
class Ex23_QuarterbackRating {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);
    double d = Double.parseDouble(args[3]);
    double e = Double.parseDouble(args[4]);

    double w = round(250 / 3.0 * ((a / b) - 0.3));    // Completion ratio
    double x = round(25.0 / 6 * ((c / b) - 3));       // Yards per pass
    double y = round(1000.0 / 3 * (d / b));           // Touchdown ratio
    double z = round(1250.0 / 3 * (0.095 - (e / b))); // Interception ratio

    System.out.println("Completion ratio " + w);
    System.out.println("Yards per pass " + x);
    System.out.println("Touchdown ratio " + y);
    System.out.println("Interception ratio " + z);
    System.out.println("Quarterback rating => " + (w + x + y + z));
  }

  private static double round(double val) {
    final double LOW = 0.0;
    final double HIGH = 475 / 12.0;
    return val < LOW ? 0.0 : Math.min(val, HIGH);
  }
}
