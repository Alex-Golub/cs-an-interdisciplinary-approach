package com.alexgo.week_1.assignment;

/**
 * 2. Integers and booleans.
 * Write a program RightTriangle that takes three int command-line arguments and determines whether
 * they constitute the side lengths of some right triangle.
 *
 * Created by ag on 11-Jul-20 9:08 PM
 */
public class RightTriangle {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    // Conditions for valid right-triangle
    boolean isPositive = a > 0 && b > 0 && c > 0;
    boolean isValidSides = a * a + b * b == c * c ||
                           b * b + c * c == a * a ||
                           a * a + c * c == b * b;

    System.out.println(isPositive && isValidSides);
  }
}
