package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 30. Car loan payments.
 * Write a program CarLoan.java that reads in three command-line arguments P, Y, and R and calculates
 * the monthly payments you would have to make over Y years to pay off a P dollar loan at R per cent
 * interest compounded monthly.
 *
 * Created by ag on 11-Jul-20 8:52 PM
 */
class Ex30_Loan {
  public static void main(String[] args) {
    double principal = Double.parseDouble(args[0]);
    double years = Double.parseDouble(args[1]);
    double rate = Double.parseDouble(args[2]);

    double r = (rate / 100) / 12;   // monthly interest rate
    double n = 12 * years;          // number of months

    double payment = (principal * r) / (1 - Math.pow(1 + r, -n));
    double interest = payment * n - principal;

    System.out.println("Monthly payments = " + payment);
    System.out.println("Total interest   = " + interest);
  }
}
