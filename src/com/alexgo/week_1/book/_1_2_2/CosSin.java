package com.alexgo.week_1.book._1_2_2;

/**
 * 1.2.2 Write a program that uses Math.sin() and Math.cos() to check that the
 * value of cos2 + sin2 is approximately 1 for any  entered as a command-line argument.
 * Just print the value.
 *
 * Why are the values not always exactly 1?
 * A: most decimals have infinite representations in binary.
 *    The bits go on forever; no matter how many of those bits you store in a computer,
 *    you will never end up with the binary equivalent to exactly 1
 *
 *
 * javac CosSin.java
 * java CosSin <integer value>
 *
 * Created by ag on 08-Jul-20 1:15 PM
 */
class CosSin {
  public static void main(String[] args) {
    double THETA = Double.parseDouble(args[0]);
    double result = Math.pow(Math.cos(THETA), 2) + Math.pow(Math.sin(THETA), 2);

    System.out.println(result);
  }
}
