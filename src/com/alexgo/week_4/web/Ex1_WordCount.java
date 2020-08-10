package com.alexgo.week_4.web;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1. Word and line count.
 * Modify WordCount.java so that reads in text from standard input and prints out
 * the number of characters, words, and lines in the text.
 *
 * Created by ag on 02-Aug-20 4:38 PM
 */
class Ex1_WordCount {
  public static void main(String[] args) {
    int chars = 0;
    int words = 0;
    int lines = 0;

    while (!StdIn.isEmpty()) {
      String s = StdIn.readString();
      chars += s.length();
      words++;
      if (StdIn.readChar() == '\n') lines++;
    }

    StdOut.printf("# of characters: %d\n# of words: %d\n# of lines: %d", chars, words, lines);
  }
}
