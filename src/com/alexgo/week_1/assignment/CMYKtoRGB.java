package com.alexgo.week_1.assignment;

/**
 * 4. Type conversion.
 * Several different formats are used to represent color.
 * For example, the primary format for LCD displays, digital cameras, and web pages—known as the RGB
 * format—specifies the level of red (R), green (G), and blue (B) on an integer scale from 0 to 255.
 * The primary format for publishing books and magazines—known as the CMYK format—specifies the
 * level of cyan (C), magenta (M), yellow (Y), and black (K) on a real scale from 0.0 to 1.0.
 *
 * Write a program CMYKtoRGB.java that converts from CMYK format to RGB format
 *
 * Created by ag on 11-Jul-20 9:22 PM
 */
public class CMYKtoRGB {
  public static void main(String[] args) {
    double cyan = Double.parseDouble(args[0]);
    double magenta = Double.parseDouble(args[1]);
    double yellow = Double.parseDouble(args[2]);
    double black = Double.parseDouble(args[3]);

    double white = 1 - black;
    int red = (int) Math.round(255 * white * (1 - cyan));
    int green = (int) Math.round(255 * white * (1 - magenta));
    int blue = (int) Math.round(255 * white * (1 - yellow));

    System.out.println("red   = " + red);
    System.out.println("green = " + green);
    System.out.println("blue  = " + blue);

  }
}
