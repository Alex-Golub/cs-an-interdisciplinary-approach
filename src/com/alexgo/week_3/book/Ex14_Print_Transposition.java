package com.alexgo.week_3.book;

/**
 * 1.4.14 Write a code fragment to print the transposition (rows and columns exchanged) of a square two-dimensional array. For the example spreadsheet array in
 * the text, you code would print the following:
 * 99 85 98     99 98 92 94 99 90 76 92 97 89
 * 98 57 78     85 57 77 32 34 46 59 66 71 29
 * 92 77 76     98 78 76 11 22 54 88 89 24 38
 * 94 32 11
 * 99 34 22
 * 90 46 54
 * 76 59 88
 * 92 66 89
 * 97 71 24
 * 89 29 38
 *
 * https://en.wikipedia.org/wiki/Transpose
 *
 * Created by ag on 23-Jul-20 6:35 PM
 */
class Ex14_Print_Transposition {
  public static void main(String[] args) {
    double[][] a = {
            {99.0, 85.0, 98.0},
            {98.0, 57.0, 79.0},
            {92.0, 77.0, 74.0},
            {94.0, 62.0, 81.0},
            {99.0, 94.0, 92.0},
            {80.0, 76.5, 67.0},
            {76.0, 58.5, 90.5},
            {92.0, 66.0, 91.0},
            {97.0, 70.5, 66.5},
            {89.0, 89.5, 81.0}
    };

    // Transposition is possible only for square/rectangle matrices
    for (int c = 0; c < a[0].length; c++) {
      for (int r = 0; r < a.length; r++) {
        System.out.print(a[r][c] + " \t");
      }
      System.out.println();
    }
  }
}
