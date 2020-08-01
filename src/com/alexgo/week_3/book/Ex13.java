package com.alexgo.week_3.book;

/**
 * 1.4.13 Write code fragments to create a two-dimensional array b[][] that is a
 * copy of an existing two-dimensional array a[][], under each of the following assumptions:
 * a. a[][] is square
 * b. a[][] is rectangular
 * c. a[][] may be ragged
 * Your solution to b should work for a, and your solution to c should work for both b
 * and a, and your code should get progressively more complicated.
 *
 * Created by ag on 23-Jul-20 5:36 PM
 */
class Ex13 {
  public static void main(String[] args) {

    // ************ a. a[][] is square ***************
    int n = 5;
    int[][] a = create2dArray(n, n);
    printArray(a);

    System.out.println();

    int[][] b = new int[n][];
    copyArray(a, b);
    printArray(b);

    System.out.println("*".repeat(20));
    // ***************************************************


    // ************ b. a[][] is rectangle ***************
    int m = 3;
    a = create2dArray(n, m);
    printArray(a);

    System.out.println();

    b = new int[n][];
    copyArray(a, b);
    printArray(a);

    System.out.println("*".repeat(20));
    // ***************************************************


    // ************ c. a[][] may be ragged ***************
    a = createRagged2dArray(n); // at least number of rows must be provided
    printArray(a);
    b = new int[a.length][];

    System.out.println();

    copyArray(a, b);
    printArray(a);
    // ***************************************************
  }

  private static int[][] createRagged2dArray(int rows) {
    int[][] arr = new int[rows][];
    final int MAX_COLS = 11;

    for (int i = 0; i < rows; i++) {
      // pick random number of columns for i-th row
      int cols = (int) (Math.random() * MAX_COLS); // [0, MAX_COLS)

      // initialize i-th row with an array of cols size, else we get NullPointerException
      arr[i] = new int[cols];
      for (int j = 0; j < cols; j++) {
        arr[i][j] = 1 + (int) (Math.random() * 21); // [1, 21]
      }
    }

    return arr;
  }

  private static void copyArray(int[][] src, int[][] dest) {
    for (int i = 0; i < src.length; i++) {
      int columns = src[i].length; // # of columns at the i-th row
      dest[i] = new int[columns];

      for (int j = 0; j < columns; j++) {
        dest[i][j] = src[i][j];
      }
    }
  }

  private static int[][] create2dArray(int n, int m) { // 2D square/rectangle array creation
    int[][] arr = new int[n][m];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++)
        arr[i][j] = (int) (Math.random() * 21); // [0, 21)

    return arr;
  }

  private static void printArray(int[][] arr) {
    for (int[] row : arr) {
      for (int ele : row) {
        System.out.print(ele + " \t");
      }
      System.out.println();
    }
  }
}
