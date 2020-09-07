package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ag on 03-Sep-20 2:17 PM
 */
public class Complex {
  private final double re;
  private final double im;

  public Complex(double real, double imag) {
    re = real;
    im = imag;
  }

  /**
   * Addition: (x + iy) + (v + iw) = (x + v) + i(y + w)
   *
   * @param b other Complex number
   * @return Complex instance of this + b
   */
  public Complex plus(Complex b) {
    double real = re + b.re;
    double imag = im + b.im;
    return new Complex(real, imag);
  }

  /**
   * Multiplication: (x + iy) x (v + iw) = (xv - yw) + i(yv + xw)
   *
   * @param b other Complex number
   * @return Complex instance of this x b
   */
  public Complex times(Complex b) {
    double real = re * b.re - im * b.im;
    double imag = re * b.im + im * b.re;
    return new Complex(real, imag);
  }

  /**
   * Magnitude: |x + iy| = sqrt(x^2 + y^2)
   *
   * @return Magnitude of this Complex number
   */
  public double abs() {
    return Math.sqrt(re * re + im * im);
  }

  /**
   * Re(x + iy) = x
   *
   * @return real part of this Complex number
   */
  public double re() {
    return re;
  }

  /**
   * Imaginary part: Im(x + iy) = y
   *
   * @return imaginary part of this Complex number
   */
  public double im() {
    return im;
  }

  public String toString() {
    return re + " + " + im + "i";
  }

  public static void main(String[] args) {
    Complex z0 = new Complex(1.0, 1.0);
    Complex z = z0;
    z = z.times(z).plus(z0); // z = z^2 + z0
    z = z.times(z).plus(z0);
    StdOut.println(z);
  }
}
