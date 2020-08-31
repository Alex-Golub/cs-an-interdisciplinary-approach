package com.alexgo.TooKit;

import java.awt.*;

/**
 * Created by ag on 25-Aug-20 1:59 PM
 */
public class Luminance {

  /**
   * Monochrome luminance of color calculated Y = 0.299r + 0.587g + 0.114b
   *
   * @param color to check luminance
   * @return luminance as double value range [0, 255]
   */
  public static double intensity(Color color) {
    return 0.299 * color.getRed() + 0.587 * color.getGreen() + 0.114 * color.getBlue();
  }

  /**
   * Use luminance to convert to grayscale.
   *
   * @param color to convert to gray
   * @return Gray color instance
   */
  public static Color toGray(Color color) {
    int y = (int) Math.round(intensity(color));
    return new Color(y, y, y);
  }

  /**
   * Color are compatible if difference between the luminance of the
   * foreground and background colors should be at least 128.
   *
   * @param a first color
   * @param b second color
   * @return boolean if colors are compatible
   */
  public static boolean areCompatible(Color a, Color b) {
    return Math.abs(intensity(a) - intensity(b)) >= 128.0;
  }
}
