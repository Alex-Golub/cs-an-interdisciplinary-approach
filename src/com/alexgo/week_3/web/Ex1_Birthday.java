package com.alexgo.week_3.web;

/**
 * 1. Birthday problem.
 * Modify Birthday.java so that it compute the probability
 * that two people have a birthday within a day of each other.
 *
 * Created by ag on 26-Jul-20 8:51 PM
 */
class Ex1_Birthday {
  public static void main(String[] args) {
    int days = Integer.parseInt(args[0]);
    int people = 0;

    if (days < 1 || days > 366) return;

    // Track people birthdays
    boolean[] hasBirthdays = new boolean[days + 1];

    while (true) {
      int rndDay = (int) (Math.random() * days); // random birthday [0, days)
      people++;                                  // enter the room

      if (hasBirthdays[rndDay]) break;           // two people with the same birthday? stop
      hasBirthdays[rndDay] = true;               // mark this person birthday
    }

  }
}
