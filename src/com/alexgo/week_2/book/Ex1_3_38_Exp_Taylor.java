package com.alexgo.week_2.book;

/**
 * 1.3.38 Exponential function.
 * Assume that x is a positive variable of type double.
 * Write a code fragment that uses the Taylor series expansion to set the value of sum
 * to e^x = 1 + x/1! + x^2/2! + x^3/3! + . . . .
 *
 * Observation: We can accumulate previously calculated terms
 * x^2/2! == x*x/1*2    => x/1 has been calculated in the previous iteration
 * x^3/3! == x^2*x/2!*3 => x^2/2! has been calculated in the previous iteration
 * etc...
 *
 * Created by ag on 17-Jul-20 1:31 PM
 */
class Ex1_3_38_Exp_Taylor {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);

    double term = 1.0;
    double sum = 0.0;
    for (int i = 1; sum != sum + term; i++) { // run till there is no change in sum and sum + term
      sum += term;
      term *= (x / i); // see Observation
    }

    System.out.println("e^" + args[0] + " \t= " + sum);
    System.out.println("e^" + x + " \t= " + Math.exp(x)); // built-in function to calculate e^x
  }
}
