package com.alexgo.week_2.book;

/**
 * 1.3.22 Write a code fragment that puts the binary representation of a positive
 * integer n into a String variable s.
 *
 * Created by ag on 16-Jul-20 12:11 AM
 */
class Ex1_3_22_int_to_binary {
  public static void main(String[] args) {
    int num = Integer.MAX_VALUE - 564876;

    leftToRight(num);
    rightToLeft(num);
  }

  private static void leftToRight(int num) {
    long start = System.currentTimeMillis();

    int power = 1;
    while (power <= num / 2)
      power *= 2;

    String numToBinary = "";
    while (power > 0) {
      if (num < power) {
        numToBinary += "0";
      } else {
        numToBinary += "1";
        num -= power;
      }

      power /= 2;
    }

    System.out.println(numToBinary);

    System.out.println("Left-to-right: " + (System.currentTimeMillis() - start) + "ms\n");
  }

  private static void rightToLeft(int num) {
    long start = System.currentTimeMillis();

    String s = "";
    for (int i = num; i > 0; i /= 2)
      s = (i % 2) + s;

    System.out.println(s);
    System.out.println("Right-to-left: " + (System.currentTimeMillis() - start) + "ms");
  }
}
