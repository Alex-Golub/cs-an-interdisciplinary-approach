package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 3. RGB to YIQ color converter.
 *  Write a program RGBtoYIQ.java that takes an RGB color
 *  (three integers between 0 and 255) and transforms it to a YIQ color
 *  (three different real numbers Y, I, and Q, with 0 ≤ Y ≤ 1, –0.5957 ≤ I ≤ 0.5957, and –0.5226 ≤ Q ≤ 0.5226).
 *
 *  Write a program YIQtoRGB.java that applies the inverse transformation.
 *
 *  Reference: https://en.wikipedia.org/wiki/YIQ#From_RGB_to_YIQ
 *
 * Created by ag on 11-Jul-20 5:03 PM
 */
class Ex3_RGBtoYIQ {
  public static void main(String[] args) {

    // values range 0 - 255
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    double y = (0.299 * r + 0.587 * g + 0.114 * b) / 255;
    double i = (0.5959 * r - 0.2746 * g - 0.3213 * b) / 255;
    double q = (0.2115 * r - 0.5227 * g + 0.3112 * b) / 255;

    System.out.printf("RGB: (%d, %d, %d) -> YIQ: (%.3f, %.3f, %.3f)%n", r, g, b, y, i, q);

    int r_ = (int) Math.round((y + 0.956 * i + 0.619 * q) * 255);
    int g_ = (int) Math.round((y - 0.272 * i - 0.647 * q) * 255);
    int b_ = (int) Math.round((y - 1.106 * i + 1.703 * q) * 255);

    System.out.printf("YIQ: (%.3f, %.3f, %.3f) -> RGB: (%d, %d, %d)", y, i, q, r_, g_, b_);

    System.out.println(Math.sqrt(2) * Math.sqrt(2) == 2);
  }
}

