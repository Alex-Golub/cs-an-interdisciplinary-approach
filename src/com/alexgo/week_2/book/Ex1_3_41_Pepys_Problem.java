package com.alexgo.week_2.book;

/**
 * 1.3.41 Pepys problem.
 * In 1693 Samuel Pepys asked Isaac Newton which is more likely:
 * getting 1 at least once when rolling a fair die six times or
 * getting 1 at least twice when rolling it 12 times.
 * Write a program that could have provided Newton with a quick answer.
 *
 * java Ex1_3_41_Pepys_Problem 1 1000
 * 69.0%
 *
 * java Ex1_3_41_Pepys_Problem 2 1000
 * 63.3%
 *
 * java Ex1_3_41_Pepys_Problem 100 1000000
 * 51.7565%
 *
 * Created by ag on 17-Jul-20 3:03 PM
 */
class Ex1_3_41_Pepys_Problem {
  public static void main(String[] args) {
    int n      = Integer.parseInt(args[0]); // number of times to get one per roll
    int trials = Integer.parseInt(args[1]); // number of experiments

    final int SIDES = 6;
    int count = 0;
    for (int t = 1; t <= trials; t++) {

      // Roll dice 6n times and count 1's
      int ones = 0;
      for (int i = 1; i <= n * SIDES; i++)
        if (Math.random() < 1.0 / SIDES)
          ones++;

      if (ones >= n) // successful experiment if at least n one's appeared
        count++;
    }

    System.out.println(100.0 * count / trials + "%");
  }
}
