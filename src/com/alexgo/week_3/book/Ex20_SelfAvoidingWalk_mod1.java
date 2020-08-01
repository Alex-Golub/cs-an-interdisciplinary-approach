package com.alexgo.week_3.book;

/**
 * 1.4.20 Modify SelfAvoidingWalk (program 1.4.4) to calculate and print the
 * average length of the paths as well as the dead-end probability.
 * Keep separate the average lengths of escape paths and dead-end paths.
 *
 * Created by ag on 26-Jul-20 6:29 PM
 */
class Ex20_SelfAvoidingWalk_mod1 {
  public static void main(String[] args) { // Do trials random self-avoiding walks in an n-by-n lattice.

    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int deadEnds = 0;

    for (int t = 0; t < trials; t++) {
      boolean[][] a = new boolean[n][n];
      int x = n / 2, y = n / 2; // start at center of lattice

      while (x > 0 && x < n - 1 && y > 0 && y < n - 1) { // not yet escaped
        a[x][y] = true;
        if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) { // deadEnd?
          deadEnds++;
          break;
        }

        // make random move
        double r = Math.random();
        if      (r < 0.25) { if (!a[x + 1][y]) x++; } // S
        else if (r < 0.50) { if (!a[x - 1][y]) x--; } // N
        else if (r < 0.75) { if (!a[x][y + 1]) y++; } // W
        else if (r < 1.00) { if (!a[x][y - 1]) y--; } // E

      }
    }
//    System.out.println(100 * deadEnds / trials + "% dead ends");
  }
}
