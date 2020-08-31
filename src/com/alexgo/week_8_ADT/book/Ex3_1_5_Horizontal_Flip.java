package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.ImageProcessing;
import edu.princeton.cs.algs4.Picture;

/**
 * 3.1.5 Write a program that takes the name of an image file as a command-line
 * argument and flips the image horizontally.
 *
 * Created by ag on 28-Aug-20 2:36 PM
 */
class Ex3_1_5_Horizontal_Flip {
  public static void main(String[] args) {
    Picture src = new Picture(args[0]);

    src.show();
    ImageProcessing.horizontalFlip(src).show();
    ImageProcessing.verticalFlip(src).show();
  }
}
