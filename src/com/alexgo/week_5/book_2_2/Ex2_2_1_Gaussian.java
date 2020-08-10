package com.alexgo.week_5.book_2_2;

import com.alexgo.TooKit.Gaussian;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.2.1 Add to Gaussian (program 2.1.2) an implementation of the three-argument
 * static method pdf(x, mu, sigma) specified in the API that computes the Gaussian
 * probability density function with a given mean mu and standard deviation sigma,
 * Also add an implementation of the associated cumulative distribution function cdf(z, mu, sigma)
 *
 * Created by ag on 09-Aug-20 3:34 PM
 */
class Ex2_2_1_Gaussian {
  public static void main(String[] args) {
    // example from page 203 with SAT scores
    // z = bound to get scholarship
    // mu = SAT mean
    // sigma = standard deviation
    StdOut.println(Gaussian.cdf(820, 1019, 209));
    StdOut.println(Gaussian.cdf(1500, 1019, 209));
    StdOut.println(Gaussian.cdf(1500, 1025, 231));
  }
}
