package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 31. Write a program Trig.java to illustrate various trigonometric functions in the Math library,
 * such as Math.sin(), Math.cos(), and Math.toRadians().
 *
 * Created by ag on 11-Jul-20 8:59 PM
 */
class Ex31_Trig {
  public static void main(String[] args) {
    double degrees = Double.parseDouble(args[0]);
    double radians = Math.toRadians(degrees);

    double s = Math.sin(radians);
    System.out.println("sin(" + degrees + ") = " + s);

    double c = Math.cos(radians);
    System.out.println("cos(" + degrees + ") = " + c);

    double t = Math.tan(radians);
    System.out.println("tan(" + degrees + ") = " + t);
    System.out.println(s + " / " + c + " = " + s / c);

    double r = s*s + c*c;
    System.out.println(s*s + " + " + c*c + " = " + r);
  }
}
