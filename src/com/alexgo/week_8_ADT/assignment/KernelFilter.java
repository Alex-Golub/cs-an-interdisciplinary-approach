package com.alexgo.week_8_ADT.assignment;

import edu.princeton.cs.algs4.Picture;

import java.awt.*;

/**
 * 2. Kernel filter.
 * Write an image-processing library KernelFilter.java that applies various kernel filters to images,
 * such as Gaussian blur, sharpen, Laplacian, emboss, and motion blur.
 * A kernel filter modifies the pixels in an image by replacing each pixel with a
 * linear combination of its neighboring pixels.
 * The matrix that characterizes the linear combination is known as the kernel.
 *
 * https://setosa.io/ev/image-kernels/
 *
 * More specifically, to apply a kernel filter to a grayscale image, perform the following operation for each pixel p:
 *    1. Align the center of the kernel on pixel p.
 *    2. The new grayscale value of pixel p is obtained by multiplying each kernel
 *       element with the corresponding grayscale value, and adding the results.
 *
 * To apply a kernel filter to a color image, perform the above operation to the red, green, and blue
 * components of each pixel p separately, and combine the results.
 *
 * Created by ag on 29-Aug-20 8:05 PM
 */
public class KernelFilter {

  // Returns a new picture that applies the identity filter to the given picture.
  public static Picture identity(Picture picture) {
    double[][] kernel = new double[][]{
            {0, 0, 0},
            {0, 1, 0},
            {0, 0, 0}
    };

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies a Gaussian blur filter to the given picture.
  public static Picture gaussian(Picture picture) {
    final double f = 1 / 16.0;
    double[][] kernel = new double[][]{
            {1 * f, 2 * f, 1 * f},
            {2 * f, 4 * f, 2 * f},
            {1 * f, 2 * f, 1 * f}
    };

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies a sharpen filter to the given picture.
  public static Picture sharpen(Picture picture) {
    double[][] kernel = new double[][]{
            {0, -1,  0},
            {-1, 5, -1},
            {0, -1,  0}
    };

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies an Laplacian filter to the given picture.
  public static Picture laplacian(Picture picture) {
    double[][] kernel = new double[][]{
            {-1, -1, -1},
            {-1,  8, -1},
            {-1, -1, -1}
    };

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies an emboss filter to the given picture.
  public static Picture emboss(Picture picture) {
    double[][] kernel = new double[][]{
            {-2, -1,  0},
            {-1,  1,  1},
            {0,   1,  2}
    };

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies a motion blur filter to the given picture.
  public static Picture motionBlur(Picture picture) {
    double[][] kernel = new double[9][9];
    for (int i = 0; i < kernel.length; i++)
      kernel[i][i] = 1.0 / 9;

    return kernel(picture, kernel);
  }

  // Returns a new picture that applies an arbitrary kernel filter to the given picture.
  private static Picture kernel(Picture picture, double[][] weights) {
    Picture result = new Picture(picture);
    int width = picture.width();
    int height = picture.height();

    for (int col = 0; col < width; col++) {
      for (int row = 0; row < height; row++) {
        double sumRed = 0;
        double sumGreen = 0;
        double sumBlue = 0;

        int len = weights.length;
        int c = len / 2;

        for (int i = 0; i < len; i++) {
          for (int j = 0; j < len; j++) {

            // floorMod(+4, -3) == -2;   and (+4 % -3) == +1
            // floorMod(-4, +3) == +2;   and (-4 % +3) == -1
            // floorMod(-4, -3) == -1;   and (-4 % -3) == -1
            int getCol = Math.floorMod(col - c + i, width);
            int getRow = Math.floorMod(row - c + j,  height);

            Color color = picture.get(getCol, getRow);
            double w = weights[i][j];
            sumRed   += color.getRed()   * w;
            sumGreen += color.getGreen() * w;
            sumBlue  += color.getBlue()  * w;
          }
        }

        Color newColor = new Color(bound(sumRed), bound(sumGreen), bound(sumBlue));
        result.set(col, row, newColor);
      }
    }

    return result;
  }

  private static int bound(double val) {
    if (val < 0)   return 0;
    if (val > 255) return 255;
    return (int) Math.round(val);
  }

  // Test client (ungraded).
  public static void main(String[] args) {
    Picture picture = new Picture(args[0]);

    picture.show();
    identity(picture).show();
    gaussian(picture).show();
    sharpen(picture).show();
    laplacian(picture).show();
    emboss(picture).show();
    motionBlur(picture).show();
  }

}
