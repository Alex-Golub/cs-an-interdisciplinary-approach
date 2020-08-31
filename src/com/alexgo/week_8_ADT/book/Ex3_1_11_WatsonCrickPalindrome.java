package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import static com.alexgo.TooKit.StringProcessing.reverse;

/**
 * 3.1.11 Write a function isWatsonCrickPalindrome() that takes a DNA string
 * as its input and returns true if the string is a Watson–Crick complemented
 * palindrome, and false otherwise.
 * A Watson–Crick complemented palindrome is a DNA string that is equal to
 * the reverse of its Watson–Crick complement.
 *
 * ATCGCGAT     = true
 * AGT          = false
 * GTGACGTCAC   = true
 * GCAGTGA      = false
 * GCGC         = true
 * AACTGCGTTTAC = false
 * ACTG         = false
 *
 * Created by ag on 30-Aug-20 5:24 PM
 */
class Ex3_1_11_WatsonCrickPalindrome {
  public static void main(String[] args) {
    while (true) {
      StdOut.print("Enter DNA sequence: ");
      String dna = StdIn.readString();
      StdOut.println("Is Watson Crick Palindrome? -> " + isWatsonCrickPalindrome(dna) + "\n");
    }
  }

  private static boolean isWatsonCrickPalindrome(String dna) {
    String reversed = reverse(dna);
    String complement = complementWatsonCrick(reversed);

    return complement.equalsIgnoreCase(dna);

//    return complementWatsonCrick(reverse(dna)).equalsIgnoreCase(dna); // one-liner
  }

  public static String complementWatsonCrick(String dna) {
    dna = dna.replaceAll("A", "t");
    dna = dna.replaceAll("T", "a");
    dna = dna.replaceAll("C", "g");
    dna = dna.replaceAll("G", "c");
    return dna.toUpperCase();
  }
}
