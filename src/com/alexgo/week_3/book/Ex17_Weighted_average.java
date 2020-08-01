package com.alexgo.week_3.book;

import java.util.Arrays;

/**
 * 1.4.17 Modify the spreadsheet code fragment in the text to compute a weighted
 * average of the rows, where the weights of each exam score are in a one-dimensional
 * array weights[]. For example, to assign the last of the three exams in our example
 * to be twice the weight of the first two, you would use
 * double[] weights = { 0.25, 0.25, 0.50 };
 * Note that the weights should sum to 1
 *
 * Created by ag on 24-Jul-20 8:12 PM
 */
class Ex17_Weighted_average {
  public static void main(String[] args) {
    int t = Integer.parseInt(args[0]); // # of tests
    int s = Integer.parseInt(args[0]); // # of students

    int[][] testsMarks = new int[s][t];

    // generate random marks for each student per test
    for (int i = 0; i < s; i++) {
      for (int j = 0; j < t; j++) {
        testsMarks[i][j] = 55 + (int) (Math.random() * 46); // [55, 100]
      }
    }

    double[] weights = { 0.25, 0.25, 0.50 };
    System.out.println(Arrays.toString(weights));

    for (int r = 0; r < testsMarks.length; r++) {
      System.out.print(Arrays.toString(testsMarks[r]) + " \tweighted_average = ");
      double w = 0.0;
      for (int c = 0; c < testsMarks[r].length; c++) {
        w += weights[c] * testsMarks[r][c];
      }
      System.out.println(w);
    }

  }
}
