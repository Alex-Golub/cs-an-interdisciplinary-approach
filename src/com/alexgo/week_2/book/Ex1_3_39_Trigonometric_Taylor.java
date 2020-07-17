package com.alexgo.week_2.book;

/**
 * 1.3.39 Trigonometric functions.
 * Write two programs, Sin and Cos, that
 * compute the sine and cosine functions using their Taylor series expansions
 * sin x = x - x^3/3! + x^5/5! - ...
 * cos x = 1 - x^2/2! + x 4/4! - ...
 *
 * Created by ag on 17-Jul-20 2:22 PM
 */
class Ex1_3_39_Trigonometric_Taylor { // FIXME
  public static void main(String[] args) {
    double x = Double.parseDouble(args[0]);

    System.out.println("sin(x) = " + Math.sin(x));
    System.out.println("cos(x) = " + Math.cos(x));

    double sinx = 0.0;
    double term = x;
    for (int i = 1; sinx != sinx + term; i++) {
      sinx += i % 2 == 0 ? -term : term;
      term *= -Math.pow(x, 2*i - 1) / (2*i - 1); // use of the term that was added in on the previous loop iteration
    }
  }
}
