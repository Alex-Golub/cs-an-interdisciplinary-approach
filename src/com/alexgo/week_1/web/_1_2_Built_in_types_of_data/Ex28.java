package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 28. Barycenter.
 * In a two-body system, the barycenter is the center of gravity about which the two celestial bodies
 * orbit each other.
 * Given the masses m1 and m2 of two bodies, and the shortest distance a between the two bodies,
 * write a program to compute the distance from the center of the
 * first (more massive) body to the barycenter: r1 = am2 / (m1 + m2).
 *
 * Created by ag on 11-Jul-20 8:41 PM
 */
class Ex28 {
  public static void main(String[] args) {
    double m1 = Double.parseDouble(args[0]);
    double m2 = Double.parseDouble(args[1]);
    double a = Double.parseDouble(args[2]); // shortest distance a between the two bodies

    double r1 = (a * Math.min(m1, m2)) / (m1 + m2);

    System.out.println(r1);
  }
}
