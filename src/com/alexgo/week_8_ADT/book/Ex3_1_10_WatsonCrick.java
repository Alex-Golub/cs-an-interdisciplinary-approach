package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 3.1.10 Write a function complementWatsonCrick() that takes a DNA string as
 * its argument and returns its Watson–Crick complement: replace A with T, C with G,
 * and vice versa.
 *
 * Created by ag on 30-Aug-20 4:13 PM
 */
class Ex3_1_10_WatsonCrick {
  public static void main(String[] args) {
    StdOut.print("Enter DNA sequence: ");

    long start = System.currentTimeMillis();
    StdOut.println("Watson Crick complement: " + complementWatsonCrick(StdIn.readString()));
    StdOut.println("Time: " + (System.currentTimeMillis() - start) / 1000 + "sec");
  }

  public static String complementWatsonCrick(String dna) {
    char[] complement = new char[dna.length()];
    for (int i = 0; i < dna.length(); i++) {
      boolean isA = dna.substring(i, i + 1).equalsIgnoreCase("A");
      boolean isT = dna.substring(i, i + 1).equalsIgnoreCase("T");
      boolean isC = dna.substring(i, i + 1).equalsIgnoreCase("C");
      boolean isG = dna.substring(i, i + 1).equalsIgnoreCase("G");

      if (isA) complement[i] = 'T';
      if (isT) complement[i] = 'A';
      if (isC) complement[i] = 'G';
      if (isG) complement[i] = 'C';
    }

    return new String(complement);
  }

  public static String complementWatsonCrickV2(String dna) {
    dna = dna.replaceAll("A", "t");
    dna = dna.replaceAll("T", "a");
    dna = dna.replaceAll("C", "g");
    dna = dna.replaceAll("G", "c");
    return dna.toUpperCase();
  }
}
