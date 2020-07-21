package com.alexgo.week_2.web_exercises;

/**
 * 19. Alice tosses a fair coin until she sees two consecutive heads.
 * Bob tosses another fair coin until he sees a head followed by a tail.
 * Write a program to estimate the probability that Alice will make fewer tosses than Bob?
 *
 * Created by ag on 20-Jul-20 7:49 PM
 */
class Ex19 {
  public static void main(String[] args) {
    int aliceTosses = alice();
    int bobTosses = bob();

    System.out.println("Alice tosses " + aliceTosses + " times");
    System.out.println("Bob tosses " + bobTosses + " times");
  }

  private static int bob() {
    int tosses = 0;
    double previousToss = 1.0;

    while (true) {
      double currentToss = Math.random();
      tosses++;

      if (previousToss < 0.5 && currentToss > 0.5)
        break;

      previousToss = currentToss;
    }

    return tosses;
  }

  private static int alice() {
    int tosses = 0;
    double previousToss = 1.0;

    while (true) {
      double currentToss = Math.random();
      tosses++;

      if (currentToss < 0.5 && previousToss < 0.5)
        break;

      previousToss = currentToss;
    }

    return tosses;
  }
}
