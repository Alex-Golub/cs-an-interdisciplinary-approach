package com.alexgo.week_2.web_exercises;

/**
 * 46. UPC codes.
 * The Universal Product Code (UPC) is a 12 digit code that uniquely specifies a product.
 * The least significant digit d1(rightmost one) is a check digit which is the
 * uniquely determined by making the following expression a multiple of 10:
 * (d1 + d3 + d5 + d7 + d9 + d11) + 3 (d2 + d4 + d6 + d8 + d10 + d12)
 * As an example, the check digit corresponding to
 * 0-48500-00102 (Tropicana Pure Premium Orange Juice) is 8 since:
 * (8 + 0 + 0 + 0 + 5 + 4) + 3 (2 + 1 + 0 + 0 + 8 + 0) = 50
 * and 50 is a multiple of 10.
 *
 * Write a program that reads in a 11 digit integer from a command line parameter,
 * computes the check digit, and prints the the full UPC.
 * Hint: use a variable of type long to store the 11 digit number.
 *
 * java Ex46_UPC_Codes 04850000102
 * 0-48500-00102-8
 *
 * Created by ag on 05-Oct-20 1:34 PM 
 */
class Ex46_UPC_Codes {
  public static void main(String[] args) {
    long   code = Long.parseLong(args[0]);
    String upc  = "";

    System.out.printf("%-7s%7s%7s%20s\n", "sum", "digit", "d_i", "upc");
    int sum = 0;
    for (int i = 2; i <= 12; i++) {
      long digit = code % 10;
      sum += i % 2 == 0 ? 3 * digit : digit;
      code /= 10;

      if (i == 2 || i == 7 || i == 12)
        upc = "-" + upc;

      upc = digit + upc;

      System.out.printf("%-7d%7d%7d%20s\n", sum, digit, i, upc);
    }

    upc = upc + (10 - sum % 10);
    System.out.println("\nUPC: " + upc);

  }
}
