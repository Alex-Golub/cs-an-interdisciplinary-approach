package com.alexgo.week_3.book;

/**
 * 1.4.18 Write a code fragment to multiply two rectangular matrices that are not
 * necessarily square.
 * Note: For the dot product to be well defined, the number of columns in the first matrix must
 * be equal to the number of rows in the second matrix.
 * Print an error message if the dimensions do not satisfy this condition.
 *
 * javac Ex18_Matrix_multiply.class
 *
 * java Ex18_Matrix_multiply 2 2 3 3
 * java.lang.IllegalArgumentException: A(m,n) x B(p,q) iff n = q, 2 != 3
 *
 * java Ex18_Matrix_multiply 2 3 3 1
 * 5 	-2 	-10
 * -4 	5 	5
 *
 * -5
 * 10
 * 1
 *
 * -55
 * 75
 * Created by ag on 24-Jul-20 8:37 PM
 */
class Ex18_Matrix_multiply {
  public static void main(String[] args) {

    // 1st matrix dimensions
    int m = Integer.parseInt(args[0]);
    int n = Integer.parseInt(args[1]);

    // 2nd matrix dimensions
    int p = Integer.parseInt(args[2]);
    int q = Integer.parseInt(args[3]);

    if (n != p)
      throw new IllegalArgumentException("A(m,n) x B(p,q) iff n = q, " + n + " != " + p);

    int[][] a = generateMatrix(m, n);
    int[][] b = generateMatrix(p, q);

    printMatrix(a);
    System.out.println();
    printMatrix(b);
    System.out.println();

    // Matrix multiplication
    int[][] product = new int[m][q];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < q; j++)
        for (int k = 0; k < n; k++) // Dot product of row i and column j
          product[i][j] += a[i][k] * b[k][j];

    printMatrix(product);
  }

  private static void printMatrix(int[][] a) {
    for (int[] row : a) {
      for (int ele : row) {
        System.out.print(ele + " \t");
      }
      System.out.println();
    }
  }

  private static int[][] generateMatrix(int m, int n) {
    int[][] mat = new int[m][n];
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        mat[i][j] = (int) (Math.random() * 21) - 10; // [-10, 10]

    return mat;
  }
}
