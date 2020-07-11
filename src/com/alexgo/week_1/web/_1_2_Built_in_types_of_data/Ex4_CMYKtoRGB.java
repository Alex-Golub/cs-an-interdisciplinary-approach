package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 4. CMYK to RGB color matching.
 *  Write a program CMYKtoRGB that reads in four command line inputs C, M, Y, and K between 0 and 1,
 *  and prints the corresponding RGB parameters.
 *  Devise the appropriate formula by "inverting" the RGB to CMYK conversion formula.
 *
 *  Reference: https://www.rapidtables.com/convert/color/cmyk-to-rgb.html
 *
 * Created by ag on 11-Jul-20 5:50 PM
 */
class Ex4_CMYKtoRGB {
  public static void main(String[] args) {
    double c = Double.parseDouble(args[0]);
    double m = Double.parseDouble(args[1]);
    double y = Double.parseDouble(args[2]);
    double k = Double.parseDouble(args[3]);

    int r = (int) (255 * (1 - c) * (1 - k));
    int g = (int) (255 * (1 - m) * (1 - k));
    int b = (int) (255 * (1 - y) * (1 - k));

    System.out.printf("CMYK: (%.3f, %.3f, %.3f, %.3f) -> RGB: (%d, %d, %d)", c, m, y, k, r, g, b);
  }
}
