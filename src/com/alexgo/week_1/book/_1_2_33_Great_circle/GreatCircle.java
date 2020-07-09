package com.alexgo.week_1.book._1_2_33_Great_circle;

import static java.lang.Math.*;

/**
 * 1.2.33 Great circle.
 *  Write a program GreatCircle that takes four double
 *  command-line arguments—x1, y1, x2, and y2—(the latitude and longitude, in degrees, of two points
 *  on the earth) and prints the great-circle distance between them.
 *
 *  Reference: https://www.gpsvisualizer.com/calculators
 *
 * Created by ag on 09-Jul-20 12:50 PM
 */
class GreatCircle {
  public static void main(String[] args) {

    double x1 = toRadians(Double.parseDouble(args[0]));
    double y1 = toRadians(Double.parseDouble(args[1]));
    double x2 = toRadians(Double.parseDouble(args[2]));
    double y2 = toRadians(Double.parseDouble(args[3]));

    double d = 60 * acos(sin(x1) * sin((x2) + cos(x1) * cos(x2) * cos(y1 - y2)));

    System.out.println("Great Circle: " + d + " radians or " + Math.toDegrees(d) + " degrees");
  }
}
