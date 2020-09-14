package com.alexgo.week_2.book;

/**
 * 1.3.26 Modify Gambler to take an extra command-line argument that specifies
 * the number of bets the gambler is willing to make, so that there are three possible
 * ways for the game to end: the gambler wins, loses, or runs out of time.
 * Add to the output to give the expected amount of money the gambler will have when the game
 * ends.
 *
 * Extra credit : Use your program to plan your next trip to Monte Carlo.
 *
 * Created by ag on 14-Sep-20 8:53 PM
 */
class Ex1_3_26_GamblerBets {
  public static void main(String[] args) {
    int stake  = Integer.parseInt(args[0]);
    int goal   = Integer.parseInt(args[1]);    // walkaway goal
    int trials = Integer.parseInt(args[2]);
    double p   = Double.parseDouble(args[3]);  // fixed win probability [0, 1)
    int bets   = Integer.parseInt(args[4]);    // how many bets to make
    int wins   = 0;

    for (int t = 0; t < trials; t++) {
      int cash = stake;
      int bet = 0;

      while (cash > 0 && cash < goal && bet < bets) { // have cash? didn't reach goal? have more bets?
        bet++;
        if (Math.random() < p) cash++;
        else                   cash--;

        System.out.println("Bet #" + bet + ": \t" + "*".repeat(cash)); // print gambler cash after each bet
      }

      if (cash == goal) {
        System.out.println("Goal of $" + goal + " reached");
        wins++;
      }
      if (bet == bets)  System.out.println("You can't make any bets anymore. Enough For Today!");
      if (cash == 0) System.out.println("You are RUINED :(");

      System.out.println("Cash started with: $" + stake + "\nCash ended with: $" + cash);
      System.out.println("\n"); // Start of new trial
    }

    System.out.println("=== Summery ===");
    System.out.println(100 * wins / trials + "% wins");
  }
}
