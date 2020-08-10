package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;

/**
 * 1.5.27 Visualizing audio.
 * Modify PlayThatTune to send the values played to standard drawing,
 * so that you can watch the sound waves as they are played.
 * You will have to experiment with plotting multiple curves in the
 * drawing canvas to synchronize the sound and the picture.
 *
 * Created by ag on 02-Aug-20 2:39 PM
 */
class Ex27_Visualizing_Audio {
  public static void main(String[] args) {
    int SAMPLING_RATE = 44100;
    double hz = 440.0;
    double duration = 10.0;
    int n = (int) (SAMPLING_RATE * duration);
    double[] a = new double[n + 1];

    double[] x = new double[a.length];
    double[] y = new double[a.length];

    for (int i = 0; i <= n; i++) {
      a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE);
      x[i] = Math.PI * i / 8000;
      y[i] = a[i];
    }

    StdDraw.setXscale(0, Math.PI);
    StdDraw.setYscale(-2, 2);

    for (int i = 0; i < x.length; i++)
      StdDraw.line(x[i], y[i], x[i + 1], y[i + 1]);

    StdAudio.play(a);

  }
}
