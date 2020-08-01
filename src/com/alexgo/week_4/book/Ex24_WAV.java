package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdAudio;

/**
 * 1.5.24 Write a program that takes the name of a .wav file and a playback rate
 * r as command-line arguments and plays the file at the given rate.
 * First, use StdAudio.read() to read the file into an array a[].
 *
 * If r = 1, play a[];
 * otherwise, create a new array b[] of approximate size r times the length of a[].
 * If r < 1, populate b[] by sampling from the original;
 * if r > 1, populate b[] by interpolating from the original.
 * Then play b[].
 *
 * Created by ag on 01-Aug-20 4:23 PM
 */
class Ex24_WAV {
  public static void main(String[] args) {
    String fileName = args[0];
    double r = Double.parseDouble(args[1]);

    double[] original = StdAudio.read(fileName);

    if (r == 1) StdAudio.play(original);
    else if (r < 1) {
      double[] b = new double[(int) (original.length * r) + 100];
      // TODO
      StdAudio.play(b);
    } else {
    }
  }
}
