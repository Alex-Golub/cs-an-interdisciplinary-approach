package com.alexgo.week_8_ADT.imageProcess;

import com.alexgo.TooKit.ImageProcessing;
import edu.princeton.cs.algs4.Picture;

/**
 * Created by ag on 25-Aug-20 3:17 PM
 */
class FadeTest {

  public static void main(String[] args) { // Show m-image fade sequence from source to target.
    Picture source = ImageProcessing.toGrayscale(new Picture(args[0]));
    Picture target = ImageProcessing.toGrayscale(new Picture(args[1]));
    int n = Integer.parseInt(args[2]); // # of pictures

    ImageProcessing.fade(source, target, n);
  }
}

