package com.alexgo.week_5;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdIn;

/**
 * Created by ag on 03-Aug-20 5:22 PM
 */
public class PlayThatTuneDeluxe {

  // return weighted sum of two arrays
  public static double[] sum(double[] a, double[] b, double awt, double bwt) {

    // precondition: arrays have the same length
    assert a.length == b.length;

    // compute the weighted sum
    double[] c = new double[a.length];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i] * awt + b[i] * bwt;
    }
    return c;
  }

  // create a pure tone of the given frequency for the given duration
  public static double[] tone(double hz, double duration) {
    int n = (int) (StdAudio.SAMPLE_RATE * duration);
    double[] a = new double[n + 1];
    for (int i = 0; i <= n; i++) {
      a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
    }
    return a;

  }

  // create a note with harmonics of the given pitch and duration
  // (where 0 = concert A)
  public static double[] note(int pitch, double duration) {
    double hz = 440.0 * Math.pow(2, pitch / 12.0);
    double[] a = tone(hz, duration);
    double[] hi = tone(2 * hz, duration);
    double[] lo = tone(hz / 2, duration);
    double[] h = sum(hi, lo, 0.5, 0.5);
    return sum(a, h, 0.5, 0.5);
  }


  // read in notes from standard input and play them on standard audio
  public static void main(String[] args) {

    // read in pitch-duration pairs from standard input
    while (!StdIn.isEmpty()) {
      int pitch = StdIn.readInt();
      double duration = StdIn.readDouble();
      double[] a = note(pitch, duration);
      StdAudio.play(a);
    }
  }
}
