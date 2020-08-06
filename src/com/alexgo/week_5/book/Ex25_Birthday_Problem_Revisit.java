package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.25 Birthday problem.
 * Develop a class with appropriate static methods for
 * studying the birthday problem (see exercise 1.4.38).
 *
 * Birthday problem.
 * Suppose that people enter an empty room until a pair
 * of people share a birthday. On average, how many people will have to enter before
 * there is a match? Run experiments to estimate the value of this quantity. Assume
 * birthdays to be uniform random integers between 0 and 364.
 *
 * Created by ag on 05-Aug-20 12:19 PM
 */
class Ex25_Birthday_Problem_Revisit {
  public static void main(String[] args) {
    int trials = Integer.parseInt(args[0]);  // # of time to run experiment
    double average = experiment(trials);
    StdOut.printf(
            "%d people on average must enter before\n" +
            "there is two people with same birthday date.", (int) average);
  }

  private static double experiment(int trials) {
    int total = 0;

    for (int t = 0; t < trials; t++)
      total += peoplePerExperiment();

    return 1.0 * total / trials;
  }

  private static int peoplePerExperiment() {
    boolean[] hasBirthday = new boolean[365];  // [0, 364]
    int people = 0;

    while (true) {
      int birthday = (int) (Math.random() * 365);
      people++;

      if (hasBirthday[birthday])
        break;  // someone in the room has the same birthday as the one entered now

      hasBirthday[birthday] = true;
    }
    return people;
  }


}
