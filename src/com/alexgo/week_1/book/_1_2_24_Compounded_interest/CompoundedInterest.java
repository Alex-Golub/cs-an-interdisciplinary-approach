package com.alexgo.week_1.book._1_2_24_Compounded_interest;

/**
 * 1.2.24 Continuously compounded interest.
 *  Write a program that calculates and
 *  prints the amount of money you would have after t years if you invested P dollars
 *  at an annual interest rate r (compounded continuously).
 *  The desired value is given by the formula Pe^(rt).
 *
 * http://www.moneychimp.com/articles/finworks/continuous_compounding.htm
 *
 * Created by ag on 09-Jul-20 10:29 AM
 */
class CompoundedInterest {
  public static void main(String[] args) {
    int t = 15;         // years
    double p = 100.0;  // Starting Principal
    double r = 5;      // Interest Rate

    double money = p * Math.pow(Math.E, t * r / 100);

    // at any instant the balance is changing at a rate that equals r times the current balance
    System.out.println("Invest: $" + p + "\n" +
                       "Years: " + t + "\n" +
                       "Rate: " + r + "%\n" +
                       "Amount of money: $" + money);
  }
}
