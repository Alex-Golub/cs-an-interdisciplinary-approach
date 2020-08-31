package com.alexgo.week_8_ADT.book;

import static com.alexgo.TooKit.RandomGenerators.randomString;
import static com.alexgo.TooKit.StringProcessing.allSubstrings;

/**
 * 3.1.22 Write a program that takes a start string and a stop string as commandline
 * arguments and prints all substrings of a given string that start with the first,
 * end with the second, and otherwise contain neither.
 * Note: Be especially careful of overlaps!
 *
 * TODO: Review once again (overlapping???)
 *
 * Created by ag on 31-Aug-20 7:01 PM
 */
class Ex3_1_22 {
  public static void main(String[] args) {
    String start = args[0];
    String end = args[1];

//    String alpha = StringProcessing.alphabet(true);
//    System.out.println(StringProcessing.randomString(100, true));

    // NOTE: Uncomment to use your own input string
//    System.out.print("Enter String: ");
//    String input = StdIn.readAll();

//    f(StringProcessing.randomString(999_999_999, true), start, end); // couple of seconds to complete

    String rndString = randomString(100, true);
    allSubstrings(rndString, start, end);
  }
}
