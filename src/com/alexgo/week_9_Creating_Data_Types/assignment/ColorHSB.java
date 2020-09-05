package com.alexgo.week_9_Creating_Data_Types.assignment;

import edu.princeton.cs.algs4.StdIn;

/**
 * 1. Color data type.
 * Write a data type ColorHSB.java that represents a color in
 * hue–saturation–brightness (HSB) format, along with a sample client.
 *
 * A color in HSB format is composed of three components:
 *    - The hue is an integer between 0 and 359.
 *      It represents a pure color on the color wheel,
 *      with 0° for red, 120° for green, and 240° for blue.
 *    - The saturation is an integer between 0 and 100.
 *      It represents the purity of the hue.
 *    - The brightness is an integer between 0 and 100.
 *      It represents the percentage of white that is mixed with the hue.
 *
 *
 * Created by ag on 05-Sep-20 2:38 PM
 */
public class ColorHSB {

  private final int s;
  private final int h;
  private final int b;

  // Creates a color with hue h, saturation s, and brightness b.
  public ColorHSB(int h, int s, int b) {
    final int MAX_HUE = 359;
    final int MAX_SATURATION = 100;
    final int MAX_BRIGHTNESS = 100;

    if (h < 0 || h > MAX_HUE)
      throw new IllegalArgumentException("Hue value out of range (0-359) got " + h);
    if (s < 0 || s > MAX_SATURATION)
      throw new IllegalArgumentException("Saturation value out of range (0-100) got " + s);
    if (b < 0 || b > MAX_BRIGHTNESS)
      throw new IllegalArgumentException("Brightness value out of range (0-100) got " + b);

    this.h = h;
    this.s = s;
    this.b = b;
  }

  // Returns a string representation of this color, using the format (h, s, b).
  public String toString() {
    return "(" + h + ", " + s + ", " + b + ")";
  }

  // Is this color a shade of gray?
  public boolean isGrayscale() {
    return this.s == 0 || this.b == 0;
  }

  // Returns the squared distance between the two colors.
  public int distanceSquaredTo(ColorHSB other) {
    if (other == null)
      throw new IllegalArgumentException("other distanceSquaredTo argument is null");

    int hDiff = this.h - other.h;
    int sDiff = this.s - other.s;
    int bDiff = this.b - other.b;
    int t     = 360 - Math.abs(hDiff);

    return Math.min(hDiff * hDiff, t * t) + sDiff * sDiff + bDiff * bDiff;
  }

  // Sample client (see below).
  public static void main(String[] args) {
    int h = Integer.parseInt(args[0]);
    int s = Integer.parseInt(args[1]);
    int b = Integer.parseInt(args[2]);

    ColorHSB hsb = new ColorHSB(h, s, b);

    String closestName = "";
    ColorHSB closestHSB = null;
    int minDist = Integer.MAX_VALUE;

    while (!StdIn.isEmpty()) {
      String name = StdIn.readString();
      int hVal = StdIn.readInt();
      int sVal = StdIn.readInt();
      int bVal = StdIn.readInt();

      ColorHSB other = new ColorHSB(hVal, sVal, bVal);

      int dist = hsb.distanceSquaredTo(other);
      if (dist < minDist) {
        closestName = name;
        closestHSB = other;
        minDist = dist;
      }
    }

    System.out.println(closestName + " " + closestHSB);
  }

}