package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1.5.11 Write a program that reads in text from standard input and prints the number of words in the text.
 * For the purpose of this exercise, a word is a sequence of
 * non-whitespace characters that is surrounded by whitespace.
 *
 * Note: can be done with one line using String split method
 *
 * Created by ag on 30-Jul-20 5:59 PM
 */
class Ex11_WordCount {
  public static void main(String[] args) {
    StdOut.println("Enter text");

    int words = 0;
    while (!StdIn.isEmpty()) {
      StdIn.readString(); // read single String token
      words++;
    }

    StdOut.println("Total # of words " + words);

  }
}
