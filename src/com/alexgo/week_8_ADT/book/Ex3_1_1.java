package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.StringProcessing;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 3.1.1 Write a static method reverse() that takes a string as an argument
 * and returns a string that contains the same sequence of characters as the argument string
 * but in reverse order.
 *
 * Created by ag on 28-Aug-20 1:19 PM
 */
class Ex3_1_1 {
  public static void main(String[] args) {
    StdOut.print("Enter a string: ");
    String s = StdIn.readLine();
    StdOut.println("Reversed: " + StringProcessing.reverse(s) + "\n");
  }
}
