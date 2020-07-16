package com.alexgo.week_2.book;

/**
 * 1.3.33 Write a program that prints the coordinates of a random point (a, b, c) on
 * the surface of a sphere.
 * To generate such a point, use Marsaglia’s method: Start by
 * picking a random point (x, y) in the unit disk using the method described at the
 * end of this section.
 * Then, set a to 2x√ 1 – x^2 – y^2 , b to 2√ 1 – x^2 – y^2 , and c to
 * 1 – 2(x^2 + y^2).
 *
 * Created by ag on 16-Jul-20 2:00 PM
 */
class Ex1_3_33_Marsaglias_method {
  public static void main(String[] args) {
    double x = 2 * Math.random() - 1; // (-1, 1)
    double y = 2 * Math.random() - 1; // (-1, 1)

    double root = Math.sqrt(1 - x * x + y * y);
    double a = 2 * x * root;
    double b = 2 * root;
    double c = 1 - 2 * (x * x + y * y);

    System.out.println("(" + a + ", " + b + ", " + c + ")");
  }
}
