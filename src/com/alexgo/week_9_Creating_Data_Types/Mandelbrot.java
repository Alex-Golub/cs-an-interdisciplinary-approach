package com.alexgo.week_9_Creating_Data_Types;

import com.alexgo.TooKit.Complex;
import edu.princeton.cs.algs4.Picture;

import java.awt.*;

/**
 * This program takes three command-line arguments that specify the center and size of a square
 * region of interest, and makes a digital image showing the result of sampling the Mandelbrot
 * set in that region at a size-by-size grid of evenly spaced points. It colors each pixel with a
 * grayscale value that is determined by counting the number of iterations before the Mandelbrot
 * sequence for the corresponding complex number exceeds 2.0 in magnitude, up to 255.
 *
 * -.5 0 2
 * .1015 -.633 .01
 *
 * .1015 -.633 1.0
 * .1015 -.633 .10
 * .1015 -.633 .01
 * .1015 -.633 .001
 *
 * Created by ag on 03-Sep-20 3:21 PM
 */
public class Mandelbrot {
  public static void main(String[] args) {
    double xC   = Double.parseDouble(args[0]);
    double yC   = Double.parseDouble(args[1]);
    double size = Double.parseDouble(args[2]);

    int n   = 512;
    int max = 255;

    Picture picture = new Picture(n, n);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        double x0 = xC - size / 2 + size * i / n;
        double y0 = yC - size / 2 + size * j / n;
        Complex z0 = new Complex(x0, y0);
        int gray = max - mand(z0, max);
        Color c = new Color(gray, gray, gray);
        picture.set(i, n - 1 - j, c);
      }
    }
    picture.show();
  }

  private static int mand(Complex z0, int max) { // checks if z0 in Mandelbrot set
    Complex z = z0;
    for (int t = 0; t < max; t++) {
      // There is a test that tells us for sure that a complex number is not
      // in the set: if the magnitude of any number in its sequence ever exceeds 2
      // then the sequence surely will diverge i.e. not part of Mandelbrot set.
      if (z.abs() > 2.0) return t;

      // rule for determining whether a complex number z0 is in the Mandelbrot
      // if the sequence |zt| (z0, z1, z2 ... zt) diverges to infinity, then z0 is not in the Mandelbrot set;
      // otherwise, sequence is bounded, then z0 is in the Mandelbrot set.
      z = z.times(z).plus(z0);
    }

    return max;
  }
}