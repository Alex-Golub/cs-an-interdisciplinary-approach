package com.alexgo.week_2.web_exercises;

/**
 * 33. Sample standard deviation of uniform distribution.
 * Modify Exercise 8 so that it prints the sample standard deviation
 * in addition to the average.
 *
 * The uniform distribution is used to describe a situation where all possible
 * outcomes of a random experiment are equally likely to occur.
 * You can use the variance and standard deviation to measure the “spread”
 * among the possible values of the probability distribution of a random variable.
 *
 *
 * Created by ag on 28-Sep-20 4:01 PM 
 */
class Ex33_SSD_Uniform {
  public static void main(String[] args) {
    int sum = 0;
    final int N = 10;
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

    for (int i = 0; i < N; i++) {
      int rnd = (int) (Math.random() * 101);
      sum += rnd;

      min = Math.min(min, rnd);
      max = Math.max(max, rnd);

      System.out.print(rnd);
      if (i + 1 < N) System.out.print(", ");
    }

    System.out.println("\nmax = " + max + ", min = " + min);
    System.out.println("Average: " + 1.0 * sum / N);

    // standard deviation of uniform dist. in range [min, max]
    // ssd_uni_dist = (min - max) / sqrt(12)
    System.out.println("SSD Uniform dist. = " + (max - min) / Math.sqrt(12));
  }
}
