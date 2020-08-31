package com.alexgo.week_8_ADT.imageProcess;

import com.alexgo.TooKit.ImageProcessing;
import edu.princeton.cs.algs4.Picture;

/**
 * Created by ag on 28-Aug-20 12:41 PM
 */
class UpsideDownTest {
  public static void main(String[] args) {
    Picture pic = new Picture(args[0]);
    pic.show();
    ImageProcessing.verticalFlip(pic).show();
  }
}
