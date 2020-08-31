package com.alexgo.week_8_ADT.imageProcess;

import com.alexgo.TooKit.ImageProcessing;
import edu.princeton.cs.algs4.Picture;

/**
 * javac-introcs ScaleTest.java
 * java-introcs ScaleTest ImageLocation
 *
 * Created by ag on 25-Aug-20 2:53 PM
 */
class ScaleTest {
  public static void main(String[] args) {
    Picture source = new Picture(args[0]);
    int w = 100;
    int h = 100;

    Picture scaled = ImageProcessing.scale(source, h, w);

    source.show();
    scaled.show();
  }
}
