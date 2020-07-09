package com.alexgo.week_1.book._1_2_14;

/**
 * 1.2.14
 *  Write a program that takes two positive integers as command-line
 *  arguments and prints true if either evenly divides the other.
 *
 *  javac EvenlyDiv.java
 *  java EvenlyDiv 2 4
 *    2 % 4 = 0? -> false
 *    4 % 2 = 0? -> true
 *
 * Created by ag on 08-Jul-20 2:25 PM
 */
class EvenlyDiv {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);

    System.out.println(n1 + " % " + n2 + " = 0? -> " + (n1 % n2 == 0));
    System.out.println(n2 + " % " + n1 + " = 0? -> " + (n2 % n1 == 0));
  }
}
