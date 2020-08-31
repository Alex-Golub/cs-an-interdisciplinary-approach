package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.StringProcessing;
import edu.princeton.cs.algs4.StdIn;

/**
 * 3.1.9 Write a static method isValidDNA() that takes a string as its argument and
 * returns true if and only if it is composed entirely of the characters A, T, C, and G.
 *
 * Created by ag on 28-Aug-20 5:01 PM
 */
class Ex3_1_9 {
  public static void main(String[] args) {
    System.out.print("Enter DNA sequence: ");
    String dna = StdIn.readString();
    if (StringProcessing.isValidDNA(dna)) System.out.println("DNA is valid");
    else                                  System.out.println("DNA is not valid");

  }

}
