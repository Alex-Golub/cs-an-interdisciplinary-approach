package com.alexgo.week_2.book;

/**
 * 1.3.23 Write a version of Gambler that uses two nested while loops or two nested
 * for loops instead of a while loop inside a for loop.
 *
 * Created by ag on 16-Jul-20 12:50 AM
 */
class Ex1_3_23_gambler_v2 {
  public static void main(String[] args) {
    // $stake and terminate on $0 or $goal.
    int stake = Integer.parseInt(args[0]);
    int goal = Integer.parseInt(args[1]); // walkaway goal
    int trials = Integer.parseInt(args[2]);
    int bets = 0;
    int wins = 0;

    forWhile(stake, goal, trials, bets, wins);
    System.out.println();
    forfor(stake, goal, trials, bets, wins);
    System.out.println();
    whilewhile(stake, goal, trials, bets, wins);
  }

  private static void forWhile(int stake, int goal, int trials, int bets, int wins) {
    for (int t = 0; t < trials; t++) { // Run one experiment.
      int cash = stake; // cash on hand
      while (cash > 0 && cash < goal) { // Simulate one bet.
        bets++;
        if (Math.random() < 0.5) cash++;
        else cash--;
      } // Cash is either 0 (ruin) or $goal (win).

      if (cash == goal) wins++;
    }

    System.out.println(100 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + bets / trials);
  }

  private static void forfor (int stake, int goal, int trials, int bets, int wins) {
    for (int t = 0; t < trials; t++) {
      for (int cash = stake; cash > 0 && cash < goal;) {
        bets++;
        if (Math.random() < 0.5) cash++;
        else cash--;

        if (cash == goal) {
          wins++;
          break;
        }
      }
    }

    System.out.println(100 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + bets / trials);
  }

  private static void whilewhile (int stake, int goal, int trials, int bets, int wins) {
    int t = 0;
    while (t < trials) {
      int cash = stake; // cash on hand
      while (cash > 0 && cash < goal) { // Simulate one bet.
        bets++;
        if (Math.random() < 0.5) cash++;
        else cash--;
      } // Cash is either 0 (ruin) or $goal (win).

      if (cash == goal) wins++;

      t++;
    }

    System.out.println(100 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + bets / trials);
  }
}


