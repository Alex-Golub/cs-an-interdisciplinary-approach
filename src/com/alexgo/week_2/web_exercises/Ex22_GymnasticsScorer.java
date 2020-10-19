package com.alexgo.week_2.web_exercises;

/**
 * 22. Gymnastics judging.
 * A gymnast's score is determined by a panel of 6 judges who each decide
 * a score between 0.0 and 10.0.
 * The final score is determined by discarding the high and low scores,
 * and averaging the remaining 4.
 * Write a program GymnasticsScorer.java that takes 6 real command line inputs
 * representing the 6 scores and prints their average,
 * after throwing out the high and low scores.
 *
 * Created by ag on 20-Jul-20 9:29 PM
 */
class Ex22_GymnasticsScorer {
  public static void main(String[] args) {
    double s1 = Double.parseDouble(args[0]);
    double s2 = Double.parseDouble(args[1]);
    double s3 = Double.parseDouble(args[2]);
    double s4 = Double.parseDouble(args[3]);
    double s5 = Double.parseDouble(args[4]);
    double s6 = Double.parseDouble(args[5]);

    // 1 2 3 4 5 6 = 21
    // 2 3 4 5 = 14
    // 21 - (6 + 1) = 14

    double max = Math.max(s1, Math.max(s2, Math.max(s3, Math.max(s4, Math.max(s5, s6)))));
    double min = Math.min(s1, Math.min(s2, Math.min(s3, Math.min(s4, Math.min(s5, s6)))));
    double mid = s1 + s2 + s3 + s4 + s5 + s6 - (max + min);

    System.out.println("Scores: " + s1 + ", " + s2 + ", " + s3 + ", " + s4 + ", " + s5 + ", " + s6);
    System.out.println("Highest Score " + max);
    System.out.println("Mid Score " + mid);
    System.out.println("Lowest Score " + min);
    System.out.println("Final Score: " + mid + "/6 = " + mid / 6);
  }
}
