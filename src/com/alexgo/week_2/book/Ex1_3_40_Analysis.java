package com.alexgo.week_2.book;

/**
 * 1.3.40 Experimental analysis.
 * Run experiments to determine the relative costs of
 * Math.exp() and the methods from exercise 1.3.38 for computing e^x: the direct
 * method with nested for loops, the improvement with a single for loop, and the
 * latter with the loop-continuation condition (term > 0).
 * Use trial-and-error with
 * a command-line argument to determine how many times your computer can perform each computation in 10 seconds.
 *
 * Created by ag on 17-Jul-20 2:45 PM
 */
class Ex1_3_40_Analysis {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);

    System.out.println("e^" + x + " = " + Math.exp(x));

    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x = -x;
    }

    nestedFor(x, isNegative);
    singleFor(x, isNegative);
    continuation(x, isNegative);

  }

  private static void nestedFor(double x, boolean isNegative) {
    long steps = 0;

    double term = 1.0;
    double sum = 0.0;
    for (int n = 1; sum != sum + term; n++) {
      sum += term;

      steps++;

      term = 1.0;
      for (int i = 1; i <= n; i++) {
        term *= x / i;
        steps++;
      }
    }

    if (isNegative) sum = 1 / sum;
    System.out.println("e^" + x + " = " + sum + "\t\tNo. of computations: " + steps);
  }

  private static void singleFor(double x, boolean isNegative) {
    long steps = 0;

    double term = 1.0;
    double sum = 0.0;
    for (int n = 1; sum != sum + term; n++) {
      sum += term;
      term *= x / n;
      steps++;
    }

    if (isNegative) sum = 1 / sum;
    System.out.println("e^" + x + " = " + sum + "\t\tNo. of computations: " + steps);
  }

  private static void continuation(double x, boolean isNegative) {
    long steps = 0;

    double term = 1.0;
    double sum = 0.0;
    for (int n = 1; term > 0; n++) {
      sum += term;
      term *= x / n;
      steps++;
    }

    if (isNegative) sum = 1 / sum;
    System.out.println("e^" + x + " = " + sum + "\t\tNo. of computations: " + steps);
  }
}
