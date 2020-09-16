package com.alexgo.week_2.book;

/**
 * 1.3.42 Game simulation.
 * In the game show Let’s Make a Deal, a contestant is presented with three doors.
 * Behind one of them is a valuable prize.
 * After the contestant chooses a door, the host opens one of the other two doors
 * (never revealing the prize, of course).
 * The contestant is then given the opportunity to switch to the other unopened door.
 * Should the contestant do so?
 * Intuitively, it might seem that the contestant’s initial choice door and the other
 * unopened door are equally likely to contain the prize,
 * so there would be no incentive to switch.
 *
 * Write a program MonteHall to test this intuition by simulation.
 * Your program should take a commandline argument n, play the game n times using each of the
 * two strategies (switch or do not switch), and print the chance of success for each
 * of the two strategies.
 *
 * https://bit.ly/2Rypk1q
 * - - - three curtains.
 * Don't Switch:  p(win) = 1/3, p(lose) = 2/3
 * Always Switch: p(win) = 2/3, p(lose) = 1/3
 *
 * Created by ag on 16-Sep-20 1:16 PM
 */
class Ex1_3_42_Game_Simulation {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // number of games to play

    switching(n);
    notSwitching(n);
  }

  private static void switching(int n) {
    int won = 0;

    for (int i = 0; i < n; i++) {
      int prize = (int) (Math.random() * 3);  // hide prize in one of the 3 curtains
      int choice = (int) (Math.random() * 3); // contestant make a random choice

      // host picks a curtain where there is no prize
      int reveal;
      do {
        reveal = (int) (Math.random() * 3);
      } while (reveal == choice || reveal == prize);

      choice = 3 - reveal - choice; // switch to other curtain

      if (choice == prize)
        won++;
    }

    String m = String.format("Always switching win rate out of %d games -> %.2f%%",
            n, 100.0 * won / n);
    System.out.println(m);
  }

  private static void notSwitching(int n) {
    int won = 0;

    for (int i = 0; i < n; i++) {
      int prize = (int) (Math.random() * 3);  // hide prize in one of the 3 curtains
      int choice = (int) (Math.random() * 3); // contestant make a random choice

      // host picks a curtain where there is no prize
      int reveal;
      do {
        reveal = (int) (Math.random() * 3);
      } while (reveal == choice || reveal == prize);

      if (choice == prize)
        won++;
    }

    String m = String.format("Never switching win rate out of %d games -> %.2f%%",
            n, 100.0 * won / n);
    System.out.println(m);
  }
}
