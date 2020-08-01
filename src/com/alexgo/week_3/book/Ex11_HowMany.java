package com.alexgo.week_3.book;

/**
 * 1.4.11 Write a program HowMany that takes a variable number of command-line
 * arguments and prints how many there are.
 *
 * javac Ex11_HowMany.class
 *
 * java Ex11_HowMany
 * You entered 0 arguments.
 *
 * java Ex11_HowMany 1
 * You entered 1 argument.
 *
 * java Ex11_HowMany a b 1 2 ^ 6 . what?
 * You entered 8 arguments.
 *
 * Created by ag on 23-Jul-20 5:18 PM
 */
class Ex11_HowMany {
  public static void main(String[] args) {
    int n = args.length;
    System.out.print("You entered " + n + " argument");
    if (n == 1) System.out.println(".");
    else        System.out.println("s.");
  }
}
