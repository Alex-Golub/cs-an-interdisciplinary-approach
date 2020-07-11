package com.alexgo.week_1.book._1_2_27_Gaussian_rnd;

/**
 * 1.2.27 Gaussian random numbers.
 *  Write a program RandomGaussian
 *  that prints a random number r drawn from the Gaussian distribution.
 *  One way to do so is to use the Box–Muller formula
 *    r = sin(2⨅v)*(-2lnu)^0.5
 *  where u and v are real numbers between 0 and 1 generated by the Math.random() method.
 *
 *  Reference: https://en.wikipedia.org/wiki/Box%E2%80%93Muller_transform
 *
 * Created by ag on 09-Jul-20 11:23 AM
 */
class RandomGaussian {
  public static void main(String[] args) {
    double u = Math.random();
    double v = Math.random();
    double r = Math.sin(2 * Math.PI * v) * Math.sqrt(-2 * Math.log(u));

    System.out.printf("u = %.2f, v = %.2f, r = %.2f", u, v, r);
  }
}