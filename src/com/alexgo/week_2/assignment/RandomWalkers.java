package com.alexgo.week_2.assignment;

/**
 * 4. Random walkers.
 * Write a program RandomWalkers.java that takes two integer command-line arguments r and trials.
 * In each of trials independent experiments, simulate a random walk until the random walker is at
 * Manhattan distance r from the starting point.
 * Print the average number of steps.
 *
 * As r increases, we expect the random walker to take more and more steps.
 * But how many more steps?
 * Use RandomWalkers.java to formulate a hypothesis as to how the average number of steps grows
 * as a function of r.
 *
 * Estimating an unknown quantity by generating random samples and aggregating the results is
 * an example of Monte Carlo simulation—a powerful computational technique that is used widely
 * in statistical physics, computational finance, and computer graphics.
 *
 * Created by ag on 17-Jul-20 4:33 PM
 */
public class RandomWalkers {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    int totalSteps = 0;

    for (int t = 1; t <= trials; t++) {
      int x = 0, y = 0;

      while (Math.abs(x) + Math.abs(y) != r) {
        double rnd = Math.random();

        if      (rnd < 1.0 / 4) y++;
        else if (rnd < 2.0 / 4) x--;
        else if (rnd < 3.0 / 4) y--;
        else                    x++;

        totalSteps++;
      }
    }

    System.out.println("average number of steps = " + (1.0 * totalSteps / trials));
  }
}
