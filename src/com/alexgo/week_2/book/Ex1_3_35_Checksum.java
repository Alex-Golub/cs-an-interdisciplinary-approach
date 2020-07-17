package com.alexgo.week_2.book;

/**
 * 1.3.35 Checksum.
 * Write a program that takes a 9-digit integer as a command-line
 * argument, computes the checksum, and prints the ISBN number.
 *
 * javac Ex1_3_35_Checksum.class
 *
 * java Ex1_3_35_Checksum 032157351
 * Checksum: 10
 * ISBN: 032157351-X
 *
 * java Ex1_3_35_Checksum 459785429
 * Checksum: 11
 * ISBN: 459785429-0
 *
 * java Ex1_3_35_Checksum 027564829
 * Checksum: 5
 * ISBN: 437564829-5
 *
 * Reference: https://mathworld.wolfram.com/ISBN.html
 *
 * Created by ag on 16-Jul-20 3:50 PM
 */
class Ex1_3_35_Checksum {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    int sum = 0;
    for (int d = 2; d <= 10; d++) {
      sum += d * (n % 10);
      n /= 10;
    }

    int checksum = 11 - sum % 11;
    String isbn = checksum == 11 ? "0" :
                  checksum == 10 ? "X" :
                  Integer.toString(checksum);

    System.out.println("Checksum: " + checksum);
    System.out.println("ISBN: " + args[0] + "-" + isbn);
  }
}
