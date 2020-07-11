package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 1. Write a program Swap.java that takes two integer command-line arguments a and b and swaps
 *  their values using the swapping idiom described on p. 17.
 *  After each assignment statement, use System.out.println() to print a trace of the variables.
 *
 *  javac Ex1_Swap.java
 *  java Ex1_Swap -15 25
 *  a = -15, b = 25
 *  a = -15, b = 25, t = -15
 *  a = 25, b = 25, t = -15
 *  a = 25, b = -15
 *
 * Created by ag on 11-Jul-20 4:53 PM
 */
class Ex1_Swap {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);

    System.out.println("a = " + a + ", b = " + b);
    int t = a;
    System.out.println("a = " + a + ", b = " + b + ", t = " + t);
    a = b;
    System.out.println("a = " + a + ", b = " + b + ", t = " + t);
    b = t;
    System.out.println("a = " + a + ", b = " + b);
  }
}
