package com.alexgo.week_1.book._1_2_32_Color_conversion;

/**
 * 1.2.32 Color conversion.
 *  primary format for LCD displays, digital cameras, and web pages,
 *  known as the RGB format, specifies the level of red (R), green (G), and blue (B)
 *  on an integer scale from 0 to 255.
 *
 *  primary format for publishing books and
 *  magazines, known as the CMYK format, specifies the level of
 *  cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
 *
 *  Write a program RGBtoCMYK that converts RGB to CMYK.
 *
 *  javac RGBtoCMYK.java
 *  java RGBtoCMYK r g b
 *
 *  java RGBtoCMYK 214 55 9
 *  RGB: (214, 55, 9) -> CMYK: (0.00, 0.74, 0.96, 0.16)
 *
 *  java RGBtoCMYK 0 0 0
 *  RGB: (0, 0, 0) -> CMYK: (0.00, 0.00, 0.00, 1.00)
 *
 *  Calculator: https://www.rapidtables.com/convert/color/rgb-to-cmyk.html
 *
 * Created by ag on 09-Jul-20 12:37 PM
 */
class RGBtoCMYK {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    double c;
    double m;
    double y;
    double k;

    if (r == 0 && g == 0 && b == 0) {
      c = m = y = 0.0;
      k = 1.0;
    } else {
      double w = Math.max(r / 255.0, Math.max(g / 255.0, b / 255.0));
      c = (w - (r / 255.0)) / w;
      m = (w - (g / 255.0)) / w;
      y = (w - (b / 255.0)) / w;
      k = 1 - w;
    }

    System.out.printf("RGB: (%d, %d, %d) -> CMYK: (%.2f, %.2f, %.2f, %.2f)%n",
            r, g, b, c, m, y, k);



  }
}
