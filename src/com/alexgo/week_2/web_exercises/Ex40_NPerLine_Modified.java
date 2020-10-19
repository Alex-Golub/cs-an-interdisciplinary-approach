package com.alexgo.week_2.web_exercises;

/**
 * 40. Modify NPerLine.java so that it prints the integers from 1 to 1000 with
 * n integers per line.
 * Make the integers line up by printing the right number of spaces before
 * an integer (e.g., three for 1-9, two for 10-99, and one for 100-999).
 *
 * Created by ag on 28-Sep-20 6:55 PM 
 */
class Ex40_NPerLine_Modified {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    final int FROM = 1, TO = 1000;

    for (int i = FROM; i <= TO; i++) {
      if (i < 10)       System.out.print(i + "   ");
      else if (i < 100) System.out.print(i + "  ");
      else              System.out.print(i + " ");

      if ((i - FROM + 1) % n == 0) System.out.println();
    }
  }
}
