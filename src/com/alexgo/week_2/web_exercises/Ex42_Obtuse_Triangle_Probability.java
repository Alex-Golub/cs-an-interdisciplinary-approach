package com.alexgo.week_2.web_exercises;

/**
 * 42. Repeat the previous question, but calculate the probability that the resulting
 * triangle is obtuse, given that the three numbers for a triangle.
 * Hint: the three lengths will form an obtuse triangle if and only if
 * (i) the sum of every two values is larger than the third and
 * (ii) the sum of the squares of every two side lengths is greater than or equal
 * to the square of the third.
 *
 * Created by ag on 05-Oct-20 12:11 PM 
 */
class Ex42_Obtuse_Triangle_Probability {
  public static void main(String[] args) {
    final int TRAILS          = 100_000;
    int       triangles       = 0;
    int       obtuseTriangles = 0;

    for (int t = 1; t <= TRAILS; t++) {
      double a = Math.random();
      double b = Math.random();
      double c = Math.random();

      boolean isTriangle = a + b > c && a + c > b && b + c > a;
      boolean isObtuse   = a * a + b * b >= c * c &&
                           a * a + c * c >= b * b &&
                           b * b + c * c >= a * a;

      triangles += isTriangle ? 1 : 0;
      obtuseTriangles += isTriangle && isObtuse ? 1 : 0;
    }

    System.out.println("Triangles: " + triangles);
    System.out.println("Obtuse Triangles: " + obtuseTriangles);
    System.out.println("P(Triangles and Not-obtuse) = " + 1.0 * triangles / TRAILS);
    System.out.println("P(Triangles and Obtuse) = " + 1.0 * obtuseTriangles / TRAILS);
  }
}
