package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.Histogram;
import com.alexgo.TooKit.ImageProcessing;
import com.alexgo.TooKit.Luminance;
import edu.princeton.cs.algs4.Picture;

import java.awt.*;

/**
 * 3.1.4 Write a program that takes the name of a grayscale image file as a
 * command-line argument and uses StdDraw to plot a histogram of the frequency of
 * occurrence of each of the 256 grayscale intensities
 *
 * javac-introcs Ex3_1_4.java
 * java-introcs Ex3_1_4 image_name.extension
 *
 * java-introcs Ex3_1_4 cat-1.jpg
 *
 * Created by ag on 28-Aug-20 2:06 PM
 */
class Ex3_1_4 {
  public static void main(String[] args) {
    Picture pic = ImageProcessing.toGrayscale(new Picture(args[0])); // convert to grayscale
    Histogram histogram = new Histogram(256);
    int w = pic.width();
    int h = pic.height();

    for (int col = 0; col < w; col++) {
      for (int row = 0; row < h; row++) {
        Color color = pic.get(col, row);
        histogram.addDataPoint((int) Math.round(Luminance.intensity(color)));
      }
    }

    pic.show();
    histogram.plot();
  }
}
