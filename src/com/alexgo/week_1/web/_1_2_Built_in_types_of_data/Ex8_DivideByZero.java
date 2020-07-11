package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 8. Write a program DivideByZero.java to see what happens
 *  when you divide an int or double by zero.
 *
 * Created by ag on 11-Jul-20 6:11 PM
 */
class Ex8_DivideByZero {
  public static void main(String[] args) {

//    double result = 15 / 0; // java.lang.ArithmeticException: / by zero
//    double result = 15 / 0.0; // Infinity
//    double result = 0.0 / 15; // 0.0
//    double result = 15 / -0.0; // -Infinity
    double result = 15 % 0.0; // NaN

    System.out.println(result);
  }
}
