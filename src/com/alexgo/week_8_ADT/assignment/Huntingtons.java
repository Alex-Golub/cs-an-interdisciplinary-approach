package com.alexgo.week_8_ADT.assignment;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * 1. Huntington’s disease detector.
 * Huntington’s disease is an inherited and fatal neurological disorder.
 * Although there is currently no cure, in 1993 scientists discovered a very accurate genetic test.
 * The gene that causes Huntington’s disease is located on chromosome 4 and has a variable number
 * of (consecutive) repeats of the CAG trinucleotide.
 * The normal range of CAG repeats is between 10 and 35.
 * Individuals with Huntington’s disease have between 36 and 180 repeats.
 * Doctors can use a PCR-based DNA test;
 * count the maximum number of repeats;
 * and use the following table to generate a diagnosis:
 *
 *      repeats	  diagnosis
 *      0–9	not   human
 *      10–35	    normal
 *      36–39	    high risk
 *      40–180  	Huntington’s
 *      181–	    not human
 *
 * Write a program Huntingtons.java to analyze a DNA string for Huntington’s disease and produce a diagnosis.
 * Created by ag on 29-Aug-20 7:16 PM
 */
public class Huntingtons {

  // Returns the maximum number of consecutive repeats of CAG in the DNA string.
  public static int maxRepeats(String dna) {
    int maxSoFar = 0;    // maximum consecutive CAG so far
    int currentMax = 0;  // current maximum consecutive CAG

    for (int i = 0; i < dna.length() - 2; i++) {
      if (dna.startsWith("CAG", i)) {
        currentMax++;
        i += 2;
      }
      else {
        maxSoFar = Math.max(currentMax, maxSoFar);
        currentMax = 0;
      }
    }

    return Math.max(maxSoFar, currentMax);
  }

  // Returns a copy of s, with all whitespace (spaces, tabs, and newlines) removed.
  public static String removeWhitespace(String s) {
    return s.replace(" ", "")
            .replace("\t", "")
            .replace("\n", "");

//    return s.replaceAll("\\s+", ""); // no regex allowed
  }

  // Returns one of these diagnoses corresponding to the maximum number of repeats:
  // "not human", "normal", "high risk", or "Huntington's".
  public static String diagnose(int maxRepeats) {
    if (maxRepeats <= 9)   return "not human";
    if (maxRepeats <= 35)  return "normal";
    if (maxRepeats <= 39)  return "high risk";
    if (maxRepeats <= 180) return "Huntington’s";

    return "not human";
  }

  // Sample client
  public static void main(String[] args) {
    String sequence = new In(args[0]).readAll();
    String noWhiteSpace = removeWhitespace(sequence);
    int repeats = maxRepeats(noWhiteSpace);
    StdOut.println("max repeats = " + repeats);
    StdOut.println(diagnose(repeats));

  }
}
