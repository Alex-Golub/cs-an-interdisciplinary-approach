package com.alexgo.week_2.web_exercises;

/**
 * 37. Program Binary.java prints the binary representation of a decimal
 * number n by casting out powers of 2.
 * Write an alternate version Program Binary2.java that is based on the
 * following method:
 * Write 1 if n is odd, 0 if n is even.
 * Divide n by 2, throwing away the remainder.
 * Repeat until n = 0 and read the answer backwards.
 * Use % to determine whether n is even, and use string concatenation to
 * form the answer in reverse order.
 *
 * Created by ag on 28-Sep-20 5:11 PM 
 */
class Ex37_Binary2 {
  public static void main(String[] args) {
    long n = Long.parseLong(args[0]);
    StringBuilder binary = new StringBuilder();
    while (n != 0) {
      binary.append(n % 2 == 0 ? "0" : "1");
      n /= 2;
    }

    System.out.println("Binary = \t" + binary);

    StringBuilder reversed = new StringBuilder();
    for (int i = binary.length(); i > 0; i--)
      reversed.append(binary.substring(i - 1, i));

    System.out.println("Reversed: " + reversed);

    // We can use StringBuilder built-in method reverse(String s)
    System.out.println(new StringBuilder(binary).reverse());
  }
}
