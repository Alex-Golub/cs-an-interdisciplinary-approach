package com.alexgo.week_2.book;

/**
 * 1.3.38 Exponential function.
 * Assume that x is a positive variable of type double.
 * Write a code fragment that uses the Taylor series expansion to set the value of sum
 * to e^x = 1 + x/1! + x^2/2! + x^3/3! + . . . .
 *
 * Created by ag on 17-Jul-20 1:31 PM
 */
class Ex1_3_38_Exp_Taylor {
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);

    // e^-x = 1/e^x
    boolean isNegative = false;
    if (x < 0) {
      isNegative = true;
      x = -x;
    }

    double term = 1.0;
    double sum = 0.0;
//    long factorial = 1;
    for (int i = 1; sum != sum + term; i++) { // run till there is no change in sum and sum + term
//      factorial = Math.multiplyExact(factorial, i);
//      sum += Math.pow(x, i) / factorial;
      sum += term;
      term *= (x / i);
    }

//    if (isNegative)
//      sum = 1.0 / sum;

    System.out.println("e^" + args[0] + " = " + sum);

    System.out.println("e^" + x + " = " + Math.exp(x)); // built-in function to calculate e^x
  }
}
