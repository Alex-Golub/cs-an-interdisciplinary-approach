package com.alexgo.week_2.web_exercises;

/**
 * 41. Suppose a, b, and c are random number uniformly distributed between 0 and 1.
 * What is the probability that a, b, and c form the side length of some triangle?
 * Hint: they will form a triangle if and only if the sum of every two values
 * is larger than the third.
 *
 * Created by ag on 28-Sep-20 7:08 PM 
 */
class Ex41_Triangle_Probability {
  public static void main(String[] args) {
    final int TRAILS = 10_000_000;
    int validTriangles = 0;

    for (int t = 1; t <= TRAILS; t++) {
      double a = Math.random();
      double b = Math.random();
      double c = Math.random();

      if (a + b > c && a + c > b && b + c > a)
        validTriangles++;
    }

    System.out.println("Valid Triangles: " + validTriangles);
    System.out.println("P(Triangle) = " + 1.0 * validTriangles / TRAILS);
  }
}
