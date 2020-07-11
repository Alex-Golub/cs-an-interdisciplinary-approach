package com.alexgo.week_1.assignment;

/**
 * 1. Strings and command-line arguments.
 * Write a program HelloGoodbye.java that takes two names as command-line arguments and prints hello
 * and goodbye messages as shown below (with the names for the hello message in the same order as
 * the command-line arguments and with the names for the goodbye message in reverse order).
 *
 * Created by ag on 11-Jul-20 9:05 PM
 */
public class HelloGoodbye {
  public static void main(String[] args) {
    String name1 = args[0];
    String name2 = args[1];

    System.out.println("Hello " + name1 + " and " + name2 + ".");
    System.out.println("Goodbye " + name2 + " and " + name1 + ".");
  }
}
