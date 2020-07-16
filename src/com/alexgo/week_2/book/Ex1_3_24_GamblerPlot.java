package com.alexgo.week_2.book;

/**
 * 1.3.24 Write a program GamblerPlot that traces a gambler’s ruin simulation by
 * printing a line after each bet in which one asterisk corresponds to each dollar held
 * by the gambler.
 *
 * Created by ag on 16-Jul-20 1:06 AM
 */
class Ex1_3_24_GamblerPlot {
  public static void main(String[] args) {
    int stake = Integer.parseInt(args[0]);
    int goal = Integer.parseInt(args[1]); // walkaway goal
    int trials = Integer.parseInt(args[2]);
    int bets = 0;
    int wins = 0;

    for (int t = 0; t < trials; t++) {
      int cash = stake;
      while (cash > 0 && cash < goal) {
        bets++;
        if (Math.random() < 0.5) cash++;
        else                     cash--;

        // print gambler cash after each bet
        System.out.println("*".repeat(cash));
      }

      if (cash == goal) {
        System.out.println("Goal of $" + goal + " reached");
        wins++;
      } else {
        System.out.println("You are RUINED");
      }

      // Start of new trial
      System.out.println("\n");
    }

    System.out.println("Summery");
    System.out.println(100 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + bets / trials);
  }
}
