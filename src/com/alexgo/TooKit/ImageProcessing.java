package com.alexgo.TooKit;

import edu.princeton.cs.algs4.Picture;

import java.awt.*;

/**
 * Created by ag on 26-Aug-20 7:03 PM
 */
public class ImageProcessing {

  /**
   * Scale picture to new height and width
   *
   * @param src picture to rescale
   * @param h target picture height
   * @param w target picture width
   * @return scaled picture h x w
   */
  public static Picture scale(Picture src, int h, int w) {
    Picture target = new Picture(w, h);
    int srcHeight = src.height();
    int srcWidth = src.width();

    for (int colT = 0; colT < w; colT++) {
      for (int rowT = 0; rowT < h; rowT++) {
        int colS = colT * srcWidth / w;
        int rowS = rowT * srcHeight / w;

        target.set(colT, rowT, src.get(colS, rowS));
      }
    }

    return target;
  }

  /**
   * Converts an image from color to grayscale
   *
   * @param p source picture
   * @return grayscale picture
   */
  public static Picture toGrayscale(Picture p) {
    Picture picture = new Picture(p);

    for (int col = 0; col < picture.width(); col++) {
      for (int row = 0; row < picture.height(); row++) {
        Color pixel = picture.get(col, row);
        Color gray = Luminance.toGray(pixel);
        picture.set(col, row, gray);
      }
    }

    return picture;
  }

  /**
   * Fade from source to target image in n steps
   * It uses a linear interpolation strategy, where each pixel in image i is a
   * weighted average of the corresponding pixels in the source and target images.
   * NOTE: Assumes the images have the same width and height.
   *
   * @param source image
   * @param target image to fade into source
   * @param steps no. of steps to blend in, higher value more fade
   */
  public static void fade(Picture source, Picture target, int steps) {
    int width = source.width();
    int height = source.height();
    Picture faded = new Picture(width, height);

    for (int k = 0; k <= steps; k++) {
      for (int col = 0; col < width; col++) {
        for (int row = 0; row < height; row++) {
          Color colorS = source.get(col, row);
          Color colorT = target.get(col, row);
          double alpha = 1.0 * k / steps;
          Color blended = ImageProcessing.blend(colorT, colorS, alpha);

          faded.set(col, row, blended);
        }
      }
      faded.show();
    }
  }

  /**
   * Linear interpolation helper method for Fade effect
   *
   * @param c1 1st color
   * @param c2 2nd color
   * @param alpha
   * @return blended color of c1 and c2
   */
  private static Color blend(Color c1, Color c2, double alpha) {
    int r = (int) (alpha * c1.getRed()   + (1 - alpha) * c2.getRed());
    int g = (int) (alpha * c1.getGreen() + (1 - alpha) * c2.getGreen());
    int b = (int) (alpha * c1.getBlue()  + (1 - alpha) * c2.getBlue());
    return new Color(r, g, b);
  }

  /**
   * Flip picture along horizontal axis (i.e. upside-down flip)
   *
   * @param source picture to rotate upside down
   * @return upside down copy of thee source picture
   */
  public static Picture verticalFlip(Picture source) {
    int w = source.width();
    int h = source.height();
    Picture flipped = new Picture(w, h);

    for (int col = 0; col < w; col++) {
      for (int row = 0; row <= h / 2; row++) {
        flipped.set(col, row, source.get(col, h - row - 1));
        flipped.set(col, h - row - 1, source.get(col, row));
      }
    }

    return flipped;
  }

  /**
   * Flip picture along vertical axis (i.e. horizontal flip)
   *
   * @param source picture to flip
   * @return new horizontal flipped picture
   */
  public static Picture horizontalFlip(Picture source) {
    int w = source.width();
    int h = source.height();
    Picture flipped = new Picture(w, h);

    for (int row = 0; row < h; row++) {
      for (int col = 0; col < w / 2; col++) {
        flipped.set(col, row, source.get(w - col - 1, row)); // set last pixel of source to start of flipped
        flipped.set(w - col - 1, row, source.get(col, row)); // set last pixel of flipped to start of source
      }
    }

    return flipped;
  }

  /**
   * Extract Red, Blue and Green colors from source picture
   * and return array of 3 pictures [red, green, blue]
   *
   * @param source picture from which to separate colors
   * @return array with 3 pictures: Red, Green, Blue
   */
  public static Picture[] rgbSeparation(Picture source) {
    int w = source.width();
    int h = source.height();
    Picture red = new Picture(w, h);
    Picture green = new Picture(w, h);
    Picture blue = new Picture(w, h);

    for (int col = 0; col < w; col++) {
      for (int row = 0; row < h; row++) {
        Color c = source.get(col, row);

        Color r = new Color(c.getRed(), 0, 0);
        Color g = new Color(0, c.getGreen(), 0);
        Color b = new Color(0, 0, c.getBlue());

        red.set(col, row, r);
        green.set(col, row, g);
        blue.set(col, row, b);
      }
    }

    return new Picture[] {red, green, blue};
  }


}
