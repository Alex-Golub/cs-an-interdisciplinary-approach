package com.alexgo.week_4.web;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * 4. Run length encoding.
 * Write a program RunLengthEncoder.java that encodes a binary input using run length encoding.
 * e.g: WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW
 *      12W1B12W3B24W1B14W
 *
 * Write a program RunLengthDecoder.java that decodes a run length encoded message.
 * e.g: 12W1B12W3B24W1B14W
 *      WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW
 *
 * https://en.wikipedia.org/wiki/Run-length_encoding
 *
 * Created by ag on 02-Aug-20 5:25 PM
 */
class Ex4_RunLengthEncoder {
  public static void main(String[] args) {
    while (!StdIn.isEmpty()) {
      String input = StdIn.readString();
      int counter = 1; // count current run
      String rle = ""; // run accumulator
      char prev = input.charAt(0);

      // compare current character to prev and update counter and rle
      for (int i = 1; i < input.length(); i++) {
        char current = input.charAt(i);
        if (prev == current) counter++;
        else { // different character encountered finish current run
          rle += counter + "" + prev;
          prev = current;
          counter = 1;
        }

        // check if this char is the last one and update rle before exit
        if (i + 1 >= input.length())
          rle += counter + "" + prev;
      }

      StdOut.println(rle);
    }
  }
}

class Ex4_RunLengthDecoder {
  public static void main(String[] args) {
    String run = StdIn.readString();
    String output = "";

    for (int i = 0; i < run.length();) {

      // get current run number
      String t = "";
      while (true) {
        char charAt = run.charAt(i);
        if (charAt < '0' || charAt > '9')
          break;

        t += "" + charAt;
        i++;
      }

      // get character value
      char c = run.charAt(i);
      i++;

      // append t times c to output
      int times = Integer.parseInt(t);
      for (int j = 0; j < times; j++)
        output += c;
    }

    StdOut.println(output);
    StdOut.println(output.equals("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"));


  }
}
