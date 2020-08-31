package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdIn;

/**
 * 3.1.16 Given a string that represents a domain name, write a code fragment to
 * determine its top-level domain.
 * For example, the top-level domain of the string cs.princeton.edu is edu.
 *
 * NOTE: works only with domains such as:
 *  cs.princeton.edu
 *  https://www.bioinformatics.org/
 *  https://edition.cnn.com/
 *  etc.
 *
 * Created by ag on 30-Aug-20 6:38 PM
 */
class Ex3_1_16_TopLevelDomain {
  public static void main(String[] args) {
    while (true) {
      System.out.print("URL -> ");
      String url = StdIn.readLine();
      System.out.println("Top level domain -> " + topLevelDomain(url));
    }
  }

  private static String topLevelDomain(String url) {
    return url.substring(url.lastIndexOf(".") + 1);
  }
}
