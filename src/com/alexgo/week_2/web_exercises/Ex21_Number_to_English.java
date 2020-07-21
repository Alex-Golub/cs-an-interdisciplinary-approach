package com.alexgo.week_2.web_exercises;

/**
 * 21. Number-to-English.
 * Write a program to read in a command line integer between -999,999,999 and 999,999,999 and
 * print the English equivalent.
 * Here is an exhaustive list of words that your program should use:
 * negative, zero, one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve,
 * thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, thirty, forty,
 * fifty, sixty, seventy, eighty, ninety, hundred, thousand, million.
 * Don't use hundred, when you can use thousand, e.g., use one thousand five hundred instead of fifteen hundred.
 *
 * TODO
 *
 * Created by ag on 20-Jul-20 8:26 PM
 */
class Ex21_Number_to_English {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    if (n < -999_999_999) n = -999_999_999;
    if (n > 999_999_999) n = 999_999_999;

    String[] single_digit = new String[]
            {"zero", "one", "two", "three",
                    "four", "five", "six",
                    "seven", "eight", "nine"};

    String[] two_digit = new String[]
            {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
                    "seventeen", "eighteen", "nineteen",};

    String[] tens_multiple = new String[]
            {"twenty", "thirty", "forty",
                    "fifty", "sixty", "seventy", "eighty", "ninety"};

    String[] tens_exp = new String[]{"hundred", "thousand", "million"};

    String number = "";

  }
}
