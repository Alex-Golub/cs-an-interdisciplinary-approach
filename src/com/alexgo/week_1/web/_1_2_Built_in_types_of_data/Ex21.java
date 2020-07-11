package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

import static java.lang.Math.*;

/**
 * 21. Equatorial to horizontal coordinates.
 * The equatorial coordinate system is widely used by
 * astronomers to indicate the position of a star on the celestial sphere.
 *
 * The position is specified by its declination δ, its hour angle H, and its latitude φ.
 * The horizontal coordinate system (a.k.a. Alt/Az coordinate system) is useful for determining
 * the setting/rising time of celestial objects.
 *
 * The position is specified by its altitude (vertical angle from the horizon)
 * and and its azimuth (horizontal angle).
 * Given a star's position using equatorial coordinates, find its position in horizontal
 * coordinates using the formulas below.
 *
 * Altitude = asin (sin φ sin δ  + cos φ cos δ cos H)
 * Azimuth  = acos ((cos φ sin δ  - sin φ cos δ cos H) / cos (Altitude) )
 *
 * Created by ag on 11-Jul-20 8:04 PM
 */
class Ex21 {
  public static void main(String[] args) {

    // Star position in degrees
    double δ = Math.toRadians(Double.parseDouble(args[0])); // declination
    double H = Math.toRadians(Double.parseDouble(args[1])); // hour angle
    double φ = Math.toRadians(Double.parseDouble(args[2])); // latitude

    double altitude = asin(sin(φ) * sin(δ) + cos(φ) * cos(δ) * cos(H));
    double Azimuth = acos ( (cos(φ) * sin(δ)  - sin(φ) * cos(δ) * cos(H)) / cos(altitude) );

    System.out.println(
            "Star Position (in degrees)\n" +
            "Declination: " + args[0] + "\nHour Angle: " + args[1] + "\nLatitude: " + args[2] + "\n\n" +
            "Alt/Az: " + altitude + " / " + Azimuth
    );
  }
}
