package com.alexgo.week_2.book;

/**
 * 1.3.37 2D random walk.
 * A two-dimensional random walk simulates the behavior
 * of a particle moving in a grid of points. At each step, the random walker moves
 * north, south, east, or west with probability equal to 1/4, independent of previous
 * moves.
 *
 * Write a program RandomWalker that takes an integer command-line argument n and estimates
 * how long it will take a random walker to hit the boundary of
 * a 2n-by-2n square centered at the starting point.
 *
 * javac Ex1_3_37_RandomWalker.class
 *
 * java Ex1_3_37_RandomWalker 0
 * Square size is 0 x 0
 * Start at: (0, 0)
 * Total steps till reach boundary: 0 steps
 *
 * java Ex1_3_37_RandomWalker 1
 * Square size is 2 x 2
 * Start at: (0, 0)
 * (1, 0)
 * Total steps till reach boundary: 1 steps
 *
 * java Ex1_3_37_RandomWalker 4
 * Square size is 8 x 8
 * Start at: (0, 0)
 * (0, -1)
 * (1, -1)
 * (0, -1)
 * (1, -1)
 * (1, -2)
 * (0, -2)
 * (0, -3)
 * (0, -4)
 * Total steps till reach boundary: 8 steps
 *
 * Created by ag on 16-Jul-20 5:01 PM
 */
public class Ex1_3_37_RandomWalker {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // n >= 0

    int x = 0, y = 0; // starting point
    int totalSteps = 0; // steps till hit boundary

    System.out.println("Square size is " + 2*n + " x " + 2*n);

    System.out.println("Start at: (" + x + ", " + y + ")");
    while (Math.abs(x) < n && Math.abs(y) < n) {
      double random = Math.random();

      if      (random < 1 / 4.0) y++; // go north
      else if (random < 2 / 4.0) y--; // go south
      else if (random < 3 / 4.0) x--; // go east
      else                       x++; // go west

      System.out.println("(" + x + ", " + y + ")");
      totalSteps += 1;
    }

    System.out.println("Total steps till reach boundary: " + totalSteps + " steps");
  }
}
