package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 20. Area of a triangle.
 * Write a program TriangleArea.java that takes three command line inputs a, b, and c,
 * representing the side lengths of a triangle,
 * and prints the area of the triangle using Heron's formula.
 *
 * javac Ex20_TriangleArea.java
 *
 * java Ex20_TriangleArea 1 2 3
 * The sum of two sides must be larger than the third.
 *
 * java Ex20_TriangleArea 3 4 5
 * Area = 6.0
 *
 * Created by ag on 11-Jul-20 7:53 PM
 */
class Ex20_TriangleArea {
  public static void main(String[] args) {
   int a = Integer.parseInt(args[0]);
   int b = Integer.parseInt(args[1]);
   int c = Integer.parseInt(args[2]);

   if (a + b <= c || a + c <= b || b + c <= a) {
     System.out.println("The sum of two sides must be larger than the third.");
     return;
   }

   double s = (a + b + c) / 2.0;
   double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    System.out.println("Area = " + area);
  }
}
