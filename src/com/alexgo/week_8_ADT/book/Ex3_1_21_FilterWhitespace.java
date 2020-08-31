package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import static com.alexgo.TooKit.StringProcessing.filterWhitespace;

/**
 * 3.1.21 Write a filter that reads text from an input stream and prints it to an output
 * stream, removing any lines that consist only of whitespace.
 *
 * Created by ag on 31-Aug-20 6:39 PM
 */
class Ex3_1_21_FilterWhitespace {
  public static void main(String[] args) {
    In in = new In();
    String text = "";
    StdOut.println("Enter text: ");
    text = in.readAll();

    System.out.println();
//    System.out.println("|" + text + "|");
    filterWhitespace(text);
  }

}
