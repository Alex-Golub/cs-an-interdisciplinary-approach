package com.alexgo.week_3.book;

/**
 * 1.4.6 Write a code fragment that prints the contents of a two-dimensional boolean array,
 * using * to represent true and a space to represent false. Include row and column indices.
 *
 * Created by ag on 22-Jul-20 9:42 PM
 */
public class Ex6 {
  public static void main(String[] args) {
    final int ROWS = 5, COLS = 5;
    boolean[][] arr = new boolean[ROWS][COLS];

    // randomly initialize array
    for (int r = 0; r < arr.length; r++)
      for (int c = 0; c < arr[r].length; c++)
        arr[r][c] = Math.random() < 0.5;

    // print array
    for (int r = 0; r < arr.length; r++) {
      for (int c = 0; c < arr[r].length; c++) {
        System.out.print("[" + r + "," + c + "] " + (arr[r][c] ? "* " : "_ "));
      }
      System.out.println();
    }
  }
}
