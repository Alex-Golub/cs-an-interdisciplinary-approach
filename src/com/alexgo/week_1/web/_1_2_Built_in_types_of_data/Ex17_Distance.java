package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 17. Write a program that takes four real-valued command line parameters x1, y1, x2, and y2 and
 *  prints the Euclidean distance between the points (x1, y1) and (x2, y2).
 *
 *  javac Ex17_Distance.class
 *  java Ex17_Distance 1 2 3 4
 *  Distance = 2.8284271247461903
 *
 * Created by ag on 11-Jul-20 7:41 PM
 */
class Ex17_Distance {
  public static void main(String[] args) {
    double x1 = Double.parseDouble(args[0]);
    double y1 = Double.parseDouble(args[1]);
    double x2 = Double.parseDouble(args[2]);
    double y2 = Double.parseDouble(args[3]);

    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

    System.out.println("Distance = " + d);
  }
}
