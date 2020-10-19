package com.alexgo.week_2.web_exercises;

/**
 * 45. Formatted ISBN number.
 * Write a program ISBN2.java that reads in a 9 digit integer from a
 * command-line argument, computes the check digit, and prints the fully
 * formatted ISBN number, e.g, 0-201-31452-5.
 *
 * Created by ag on 05-Oct-20 12:43 PM 
 */
class Ex45_ISBN2 {
  public static void main(String[] args) {
    int    n    = Integer.parseInt(args[0]);
    String isbn = "";

    // 10*d9 + 9*d8 + 8*d7 + 7*d6 + 6*d5 + 5*d4 + 4*d3 + 3*d2 + 2*d1
    int sum = 0;
    for (int i = 2; i <= 10; i++) {
      int digit = n % 10;
      sum += i * digit;
//      System.out.println(n % 10 + " * " + i + " \t: sum = " + sum);
      n /= 10;

      if (i == 2 || i == 7 || i == 10)
        isbn = "-" + isbn;

      isbn = digit + isbn;
//      System.out.println("ISBN => " + isbn);
    }

    // Concat check digit
    if (sum % 11 == 1) isbn += "X";
    else if (sum % 11 == 0) isbn += "0";
    else isbn += (11 - sum % 11);

    System.out.println("ISBN: " + isbn);
  }
}

