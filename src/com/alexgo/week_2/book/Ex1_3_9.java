package com.alexgo.week_2.book;

/**
 * 1.3.9 Write a program that, using one for loop and one if statement, prints the
 * integers from 1,000 to 2,000 with five integers per line.
 *
 * Created by ag on 13-Jul-20 8:00 PM
 */
class Ex1_3_9 {
  public static void main(String[] args) {
    final int START = 1000;
    final int END = 2000;
    final int NUM_PER_LINE = 5;

    for (int i = START; i <= END; i++) {
      System.out.print(i + " ");
      if ((i + 1) % NUM_PER_LINE == 0) System.out.println();
    }
  }
}
