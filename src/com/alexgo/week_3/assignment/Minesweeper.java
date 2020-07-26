package com.alexgo.week_3.assignment;

/**
 * 4. Minesweeper.
 * Minesweeper is a 1960s era video game played on an m-by-n grid of cells.
 * The goal is to deduce which cells contain hidden mines using clues about the number of mines in neighboring cells.
 *
 * Write a program Minesweeper.java that takes three integer command-line arguments m, n, and k
 * and prints an m-by-n grid of cells with k mines, using asterisks for mines and integers for the
 * neighboring mine counts (with two space characters between each cell).
 *
 * To do so, Generate an m-by-n grid of cells, with exactly k of the mn cells containing mines, uniformly at random.
 * For each cell not containing a mine, count the number of neighboring mines (above, below, left, right, or diagonal).
 *
 * Created by ag on 25-Jul-20 6:59 PM
 */
public class Minesweeper {
  public static void main(String[] args) {
    int m = Integer.parseInt(args[0]);  // rows
    int n = Integer.parseInt(args[1]);  // columns
    int k = Integer.parseInt(args[2]);  // # of mines

    // places uniformly k mines
    boolean[][] mines = new boolean[m][n];
    while (k > 0) {
      // FIXME: Calling 'Math.random()' in more than one place suggests poor design in this program.
      int i = (int) (Math.random() * m);
      int j = (int) (Math.random() * n);

      if (!mines[i][j]) {
        mines[i][j] = true;
        k--;
      }
    }

    // count # of neighboring mines
    int[][] field = new int[m][n];
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        int count = 0;
        if (!mines[i][j]) {
          if (i - 1 >= 0 && mines[i - 1][j])                   count++; // N
          if (i - 1 >= 0 && j + 1 < n && mines[i - 1][j + 1])  count++; // NW
          if (j + 1 < n && mines[i][j + 1])                    count++; // W
          if (i + 1 < m && j + 1 < n && mines[i + 1][j + 1])   count++; // SW
          if (i + 1 < m && mines[i + 1][j])                    count++; // S
          if (i + 1 < m && j - 1 >= 0 && mines[i + 1][j - 1])  count++; // SE
          if (j - 1 >= 0 && mines[i][j - 1])                   count++; // E
          if (i - 1 >= 0 && j - 1 >= 0 && mines[i - 1][j - 1]) count++; // NE

          field[i][j] = count;
        }
      }
    }

    // print field
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        if (mines[i][j]) System.out.print("*");
        else             System.out.print(field[i][j]);

        if (j + 1 < n)   System.out.print("  ");
      }
      System.out.println();
    }
  }
}
