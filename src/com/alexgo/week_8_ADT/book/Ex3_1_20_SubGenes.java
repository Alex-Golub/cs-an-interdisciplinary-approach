package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdRandom;

import static com.alexgo.TooKit.StringProcessing.potentialGenes;

/**
 * 3.1.20 Write a version of PotentialGene (program 3.1.1) that finds all potential genes
 * contained as substrings within a long DNA string.
 * Add a command-line argument to allow the user to specify the minimum length of a potential gene.
 *
 * NODE: To generate random DNA sequences use: https://www.bioinformatics.org/sms2/random_dna.html
 *
 * Created by ag on 30-Aug-20 7:43 PM
 */
class Ex3_1_20_SubGenes {
  public static void main(String[] args) {

    // uncomment to get DNA sequence from StdIn
//    String dna = StdIn.readAll()
//            .toUpperCase()
//            .replace("\n", "")
//            .replace(" ", "")
//            .replace("\t", "");

    // Generate random DNA sequence of length n
    String dna = randomDNA(10_000);
    //    System.out.println(dna); // generated DNA

    int minLen = Integer.parseInt(args[0]);
    potentialGenes(dna, minLen);

  }

  public static String randomDNA(int n) {
    StringBuilder dna = new StringBuilder(n);
    String from = "GCAT";

    for (int i = 0; i < n; i++) {
      int r = StdRandom.uniform(0, from.length());
      dna.append(from.charAt(r));
    }

    return dna.toString();
  }
}
