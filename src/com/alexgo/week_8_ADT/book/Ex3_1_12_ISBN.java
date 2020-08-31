package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.In;

/**
 * 3.1.12 Write a program to check whether an ISBN number is valid (see exercise
 * 1.3.35), taking into account that an ISBN number can have hyphens inserted at
 * arbitrary places.
 *
 * Created by ag on 30-Aug-20 5:44 PM
 */
class Ex3_1_12_ISBN {
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter ISBN no: ");
      String isbn = new In().readLine();
      System.out.println("Is Valid ISBN? -> " + isValidISBN(isbn));
    }
  }

  private static boolean isValidISBN(String isbn) {
    if (isbn == null) return false;

    // remove hyphens, new-lines, spaces and tabs
    isbn = isbn.replace("-", "")
               .replace(" ", "")
               .replace("\n", "")
               .replace("\t", "")
               .toUpperCase(); // caller isbn string is not changed

    int len = isbn.length();
    if (len != 10) return false;

    // 10 * 1st-digit + 9 * 2nd-digit + ... + 2 * 9th-digit
    int sum = 0;
    for (int i = 0; i < len - 1; i++)
      sum += Integer.parseInt(isbn.substring(i, i + 1)) * (len - i);

    // last digit can be character X if so value is 10
    // otherwise return the digit
    sum += isbn.endsWith("X") ? 10 : Integer.parseInt(isbn.substring(len - 1, len));

    // 10 digit ISBN is valid if 11 is factor of sum
    return sum % 11 == 0;
  }
}
