package com.alexgo.week_2.book;

/**
 * 1.3.25 Modify Gambler to take an extra command-line argument that specifies
 * the (fixed) probability that the gambler wins each bet.
 * Use your program to try to learn how this probability affects the
 * chance of winning and the expected number of bets.
 * Try a value of p close to 0.5 (say, 0.48).
 *
 * ANS: Maximum number of bets are achieved when wining probability is 0.5
 *
 * Created by ag on 14-Sep-20 8:38 PM
 */
class Ex1_3_25_GamblerProbability {
  public static void main(String[] args) {
    int stake  = Integer.parseInt(args[0]);
    int goal   = Integer.parseInt(args[1]);    // walkaway goal
    int trials = Integer.parseInt(args[2]);
    double p   = Double.parseDouble(args[3]);  // fixed win probability [0, 1)
    int bets   = 0;
    int wins   = 0;

    for (int t = 0; t < trials; t++) {
      int cash = stake;
      while (cash > 0 && cash < goal) {
        bets++;
        if (Math.random() < p) cash++;
        else                   cash--;

        System.out.println("*".repeat(cash)); // print gambler cash after each bet
      }

      if (cash == goal) {
        System.out.println("Goal of $" + goal + " reached");
        wins++;
      } else {
        System.out.println("You are RUINED");
      }


      System.out.println("\n"); // Start of new trial
    }

    System.out.println("Summery");
    System.out.println(100 * wins / trials + "% wins");
    System.out.println("Avg # bets: " + bets / trials);
  }
}
