package com.alexgo.week_8_ADT.book;

import com.alexgo.TooKit.ImageProcessing;
import edu.princeton.cs.algs4.Picture;

/**
 * 3.1.6 Write a program that takes the name of an image file as a command-line
 * argument, and creates and shows three Picture objects, one that contains only the
 * red components, one for green, and one for blue.
 *
 * Created by ag on 28-Aug-20 4:20 PM
 */
public class Ex3_1_6_Extract {
  public static void main(String[] args) {
    Picture source = new Picture(args[0]);
    Picture[] separated = ImageProcessing.rgbSeparation(source);
    separated[0].show();
    separated[1].show();
    separated[2].show();
  }
}
