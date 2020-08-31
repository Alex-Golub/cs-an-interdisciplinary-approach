package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.StringProcessing;
import edu.princeton.cs.algs4.StdIn;

/**
 * 3.1.17 Write a static method that takes a domain name as its argument and returns
 * the reverse domain name (reverse the order of the strings between periods).
 * For example, the reverse domain name of cs.princeton.edu is edu.princeton.cs.
 * This computation is useful for web log analysis. (See exercise 4.2.36.)
 *
 * Created by ag on 30-Aug-20 6:47 PM
 */
class Ex3_1_17_ReverseDomain {
  public static void main(String[] args) {
    while (true) {
      System.out.print("URL -> ");
      String url = StdIn.readLine();
      System.out.println("Domain reversed -> " + StringProcessing.reverseDomain(url));
    }
  }
}
