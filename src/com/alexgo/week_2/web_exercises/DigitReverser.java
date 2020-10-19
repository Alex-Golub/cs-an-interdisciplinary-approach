package com.alexgo.week_2.web_exercises;

/**
 * Reverses the digits of a positive integer n using arithmetic. Then,
 * reverse it again using string concatenation.
 *
 * Created by ag on 05-Oct-20 12:32 PM 
 */
class DigitReverser {
  public static void main(String[] args) {
    int num = 123456789;

    // Arithmetic reverse
    int reverse = 0;
    while (num != 0) {
      reverse = (10 * reverse) + (num % 10);
      num /= 10;
    }

    System.out.println(reverse);

    // String concatenation reverse
    String s = "";
    while (reverse != 0) {
      int digit = reverse % 10;
      s = s + digit;
      reverse /= 10;
    }

    System.out.println(s);
  }
}
