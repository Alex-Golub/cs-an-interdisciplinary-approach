package com.alexgo.week_5.book;

import com.alexgo.week_5.Gaussian;
import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.28 Black–Scholes option valuation.
 * The Black–Scholes formula supplies the theoretical value of a European call option on a stock that pays no dividends,
 * given the current stock price s,
 * the exercise price x,
 * the continuously compounded risk-free interest rate r,
 * the volatility σ,
 * and the time (in years) to maturity t.
 *
 * Write a program that takes s, x, r, σ, and t from the command line and prints the Black–Scholes value.
 *
 * https://en.wikipedia.org/wiki/Black-Scholes
 *
 * Created by ag on 06-Aug-20 12:52 PM
 */
class Ex28_Black_Scholes {
  public static void main(String[] args) {
    double s = Double.parseDouble(args[0]);
    double x = Double.parseDouble(args[1]);
    double r = Double.parseDouble(args[2]);
    double σ = Double.parseDouble(args[3]);
    double t = Double.parseDouble(args[4]);

    StdOut.printf("Φ(a) - sxe^-rt * Φ(b) = %f", blackScholes(s, x, r, σ, t));
  }

  private static double blackScholes(double s, double x, double r, double σ, double t) {
    double a = (Math.log(s / x) + (r + σ * σ / 2) * t) / (σ * Math.sqrt(t));
    double b = a - σ * Math.sqrt(t);

    return s * Gaussian.Phi(a) - x * Math.exp(-r * t) * Gaussian.Phi(b);
  }

}
