package com.alexgo.week_2.assignment;

/**
 * 3. Random walk.
 * A Java programmer begins walking aimlessly.
 * At each time step, she takes one step in a random direction (either north, east, south, or west),
 * each with probability 25%.
 * She stops once she is at Manhattan distance r from the starting point.
 * How many steps will the random walker take?
 * This process is known as a two-dimensional random walk.
 *
 * Write a program RandomWalker.java that takes an integer command-line argument r and simulates
 * the motion of a random walk until the random walker is at Manhattan distance r from the starting point.
 * Print the coordinates at each step of the walk (including the starting and ending points),
 * treating the starting point as (0, 0).
 * Also, print the total number of steps taken.
 *
 * This process is a discrete version of a natural phenomenon known as Brownian motion.
 * It serves as a scientific model for an astonishing range of physical processes from the
 * dispersion of ink flowing in water, to the formation of polymer chains in chemistry,
 * to cascades of neurons firing in the brain.
 *
 * Created by ag on 17-Jul-20 4:21 PM
 */
public class RandomWalker {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);

    int x = 0, y = 0;
    int steps = 0;

    System.out.println("(" + x + ", " + y + ")");
    while (Math.abs(x) + Math.abs(y) != r) {
      double rnd = Math.random();

      // north, east, south, or west
      if      (rnd < 1.0 / 4) y++;
      else if (rnd < 2.0 / 4) x--;
      else if (rnd < 3.0 / 4) y--;
      else                    x++;
      steps++;

      System.out.println("(" + x + ", " + y + ")");
    }

    System.out.println("steps = " + steps);

  }
}
