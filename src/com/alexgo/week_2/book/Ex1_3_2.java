package com.alexgo.week_2.book;

/**
 * 1.3.2 Write a more general and more robust version of Quadratic (program
 *  1.2.3) that prints the roots of the polynomial ax2 + bx + c, prints an appropriate
 *  message if the discriminant is negative, and behaves appropriately (avoiding division by zero) if a is zero.
 *
 * javac Ex1_3_2.java
 * java Ex1_3_2 1 2 3
 * discriminant is negative - no real roots
 *
 * java Ex1_3_2 2 4 2
 * One root r = -1.0
 *
 * java Ex1_3_2 3 4 0
 * Two real number roots:
 * r1 = 0.0, r2 = -1.3333333333333333
 *
 * Created by ag on 13-Jul-20 6:12 PM
 */
class Ex1_3_2 {
  public static void main(String[] args) {
    double a = Double.parseDouble(args[0]);
    double b = Double.parseDouble(args[1]);
    double c = Double.parseDouble(args[2]);

    if (a == 0) {
      System.out.println("a is zero - no roots");
    } else {
      double discriminant = b * b - 4 * a * c;

      if (discriminant < 0.0) {
        System.out.println("discriminant is negative - no real roots");
      } else if (discriminant == 0.0) {
        double r = -b / (2 * a);
        System.out.println("One root r = " + r);
      } else {
        double r1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double r2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        System.out.println("Two real number roots:\nr1 = " + r1 + ", r2 = " + r2);
      }
    }
  }
}
