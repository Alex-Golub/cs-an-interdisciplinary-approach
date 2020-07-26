package com.alexgo.week_3.assignment;

/**
 * 3. Birthday problem.
 * Suppose that people enter a room one at a time.
 * How people must enter until two share a birthday?
 * Counterintuitively, after 23 people enter the room, there is approximately a 50–50 chance that
 * two share a birthday.
 * This phenomenon is known as the birthday problem or birthday paradox.
 *
 * Write a program Birthday.java that takes two integer command-line arguments n and trials and
 * performs the following experiment, trials times:
 *    - Choose a birthday for the next person, uniformly at random between 0 and n−1.
 *    - Have that person enter the room.
 *    - If that person shares a birthday with someone else in the room, stop; otherwise repeat.
 *
 * In each experiment, count the number of people that enter the room. Print a table that summarizes
 * the results (the count i, the number of times that exactly i people enter the room, and the fraction
 * of times that i or fewer people enter the room) for each possible value of i from 1 until the
 * fraction reaches (or exceeds) 50%.
 *
 * Created by ag on 25-Jul-20 4:14 PM
 */
public class Birthday {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    int[] count = new int[n + 2];  // track of the number of times that exactly i people entered the room

    for (int t = 0; t < trials; t++) {
      int people = 0;
      boolean[] hasBirthday = new boolean[n];  // keep track of which birthdays have been encountered so far

      while (true) {
        int bDay = (int) (Math.random() * n);
        people++;

        if (hasBirthday[bDay]) break;
        else                   hasBirthday[bDay] = true;
      }

      count[people - 1]++;

    }

    // summery
    double sum = 0, cumulative = 0;
    final double half = 0.5;
    for (int i = 0; cumulative < half; i++) {
      cumulative = sum / trials;
      System.out.println((i + 1) + "\t" + count[i] + "\t" + cumulative);
      sum += count[i + 1];
    }
  }
}