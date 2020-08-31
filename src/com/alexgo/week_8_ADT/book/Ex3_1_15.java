package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.In;

import static com.alexgo.TooKit.StringProcessing.isCircularShift;

/**
 * 3.1.15 A string s is a circular shift of a string t if it matches when the characters of
 * one string are circularly shifted by some number of positions.
 * For example, ACTGACG is a circular shift of TGACGAC, and vice versa.
 * Detecting this condition is important in the study of genomic sequences.
 * Write a function isCircularShift()
 * that checks whether two given strings s and t are circular shifts of one another
 *
 * Created by ag on 30-Aug-20 6:22 PM
 */
class Ex3_1_15 {
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter s -> ");
      String s = new In().readLine();

      System.out.print("Enter t -> ");
      String t = new In().readLine();

      System.out.println("isCircularShift? -> " + isCircularShift(s, t) + "\n");

    }
  }

}
