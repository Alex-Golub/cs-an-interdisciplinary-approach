package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.StringProcessing;

/**
 * 3.1.19 Write a test client for PotentialGene (program 3.1.1) that takes a string as
 * a command-line argument and reports whether it is a potential gene.
 *
 * Created by ag on 30-Aug-20 7:34 PM
 */
class Ex3_1_19_PotentialGeneTest {
  public static void main(String[] args) {
    System.out.println(args[0] + " is Potential Gene? "
            + StringProcessing.isPotentialGene(args[0].toUpperCase()));
  }
}
