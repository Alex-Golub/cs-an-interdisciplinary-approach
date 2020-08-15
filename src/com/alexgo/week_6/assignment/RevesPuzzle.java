package com.alexgo.week_6.assignment;

import edu.princeton.cs.algs4.StdOut;

/**
 * 3. Reve’s puzzle.
 * Reve’s puzzle is identical to the towers of Hanoi problem, except that there are 4 poles (instead of 3).
 * The task is to move n discs of different sizes from the starting pole to the destination pole, while obeying the following rules:
 *      Move only one disc at a time.
 *      Never place a larger disc on a smaller one.
 *
 * Write a program RevesPuzzle.java that takes an integer command-line argument n and prints a solution to Reve’s puzzle.
 * Assume that the the discs are labeled in increasing order of size from 1 to n and that the poles are
 * labeled A, B, C, and D, with A representing the starting pole and D representing the destination pole.
 *
 * Recall that for the towers of Hanoi problem, the minimum number of moves for a 64-disc problem is 2^64−1.
 * With the addition of a fourth pole, the minimum number of moves for a 64-disc problem is reduced to 18,433.
 *
 * Created by ag on 15-Aug-20 5:13 PM
 */
public class RevesPuzzle {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    towerOfReves(n, 'A', 'D', 'B', 'C');
  }

  private static void towerOfReves(int n, char src, char dist, char aux1, char aux2) {
    if (n == 0) return;
    if (n == 1) {
      StdOut.printf("Move disk %d from %c to %c\n", n, src, dist);
      return;
    }

    towerOfReves(n - 2, src, aux1, aux2, dist);

    StdOut.printf("Move disk %d from %c to %c\n", n - 1, src, aux2);
    StdOut.printf("Move disk %d from %c to %c\n", n, src, dist);
    StdOut.printf("Move disk %d from %c to %c\n", n - 1, aux2, dist);

    towerOfReves(n - 2, aux1, dist, src, aux2);
  }
}
