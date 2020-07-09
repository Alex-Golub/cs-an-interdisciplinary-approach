package com.alexgo.week_1.book._1_2_15;

/**
 * 1.2.15
 *  Write a program that takes three positive integers as command-line
 *  arguments and prints false if any one of them is greater than or equal to the sum
 *  of the other two and true otherwise.
 *  (Note : This computation tests whether the
 *  three numbers could be the lengths of the sides of some triangle.)
 *
 *  javac TriangleSides.java
 *  java TriangleSides 7 10 5
 *    true
 *  java TriangleSides 1 10 12
 *    false
 *
 * Created by ag on 08-Jul-20 2:30 PM
 */
class TriangleSides {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);

    System.out.println(a < b + c && b < a + c && c < a + b);
  }
}
