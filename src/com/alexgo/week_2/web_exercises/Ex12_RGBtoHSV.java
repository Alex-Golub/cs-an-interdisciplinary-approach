package com.alexgo.week_2.web_exercises;

/**
 * 12. RGB to HSB converter.
 * Write a program RGBtoHSV.java that takes an RGB color (three integers between 0 and 255) and
 * transforms it to an HSV color (three different integers between 0 and 255).
 *
 * https://www.rapidtables.com/convert/color/rgb-to-hsv.html
 *
 * javac Ex12_RGBtoHSV.class
 * java Ex12_RGBtoHSV 152 64 248
 * RGB => HSV
 * (152, 64, 248) => (268⁰, 74%, 97%)
 *
 * Write a program HSVtoRGB.java that applies the inverse transformation.
 *
 * Created by ag on 19-Jul-20 2:40 PM
 */
public class Ex12_RGBtoHSV {
  public static void main(String[] args) {
    int r = Integer.parseInt(args[0]);
    int g = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    // validate color values
    if (r < 0) r = 0;
    if (r > 255) r = 255;

    if (g < 0) g = 0;
    if (g > 255) g = 255;

    if (b < 0) b = 0;
    if (b > 255) b = 255;

    RGBtoHSV(r, g, b);

  }

  private static void RGBtoHSV(int r, int g, int b) {
    double red = r / 255.0;
    double green = g / 255.0;
    double blue = b / 255.0;

    double cMax = Math.max(red, Math.max(green, blue));
    double cMin = Math.min(red, Math.min(green, blue));
    double diff = cMax - cMin;
    double h = -1, s;

    // Hue
    if      (diff == 0)     h = 0;
    else if (cMax == red)   h = (60 * ((green - blue) / diff) + 360) % 360;
    else if (cMax == green) h = (60 * ((blue - red) / diff) + 120) % 360;
    else if (cMax == blue)  h = (60 * ((red - green) / diff) + 240) % 360;

    // Saturation
    s = cMax == 0 ? 0 : (diff / cMax) * 100;

    // Value
    double v = cMax * 100;

    System.out.printf("RGB => HSV%n(%d, %d, %d) => (%d⁰, %d%%, %d%%)%n", r, g, b, (int) h, (int) s, (int) v);

    HSVtoRGB(h, s, v);
  }

  private static void HSVtoRGB(double h, double s, double v) { // FIXME
    double c = v * s;
    double x = c * (1 - Math.abs((h / (Math.PI / 3)) % 2 - 1));
    double m = v - c;

    double _r = - 1, _g = -1, _b = -1;
    if      (h < Math.PI / 3)     { _r = c; _g = x; _b = 0; } // 60 degrees
    else if (h < 2 * Math.PI / 3) { _r = x; _g = c; _b = 0; } // 120 degrees
    else if (h < Math.PI)         { _r = 0; _g = c; _b = x; } // 180 degrees
    else if (h < 4 * Math.PI / 3) { _r = 0; _g = x; _b = c; } // 240 degrees
    else if (h < 5 * Math.PI / 3) { _r = x; _g = 0; _b = c; } // 300 degrees
    else if (h < 2 * Math.PI)     { _r = c; _g = 0; _b = x; } // 360 degrees

    double r = (_r + m) * 255.0;
    double g = (_g + m) * 255.0;
    double b = (_b + m) * 255.0;

    System.out.printf("%nHSV => RGB%n(%d⁰, %d%%, %d%%) => (%d, %d, %d)%n", (int) h, (int)s, (int)v,
            (int) r, (int) g, (int) b);

  }

}
