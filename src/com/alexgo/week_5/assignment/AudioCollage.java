package com.alexgo.week_5.assignment;/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 *
 * assume that the array arguments are not null and that α > 0 in changeSpeed().
 **************************************************************************** */

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdRandom;

public class AudioCollage {
  public static void main(String[] args) {
    String[] collage = { "beatbox.wav", "buzzer.wav", "cow.wav", "dialup.wav", "singer.wav" };

    final int SAMPLING_RATE = StdAudio.SAMPLE_RATE;
    for (int i = 0; i < collage.length; i++) {
      int d = StdRandom.uniform(10, 61);
      int n = SAMPLING_RATE * d;
      double[] samples = new double[n + 1];
      double[] song = StdAudio.read(collage[i]);
      for (int j = 0; j <= n; j++)
        samples[j] = Math.sin(2 * Math.PI * j * song[j % song.length] / SAMPLING_RATE);

      double[] modified;
      switch (i) {
        case 0:
          modified = amplify(samples, 0.5);
          break;
        case 1:
          modified = changeSpeed(samples, 2.0);
          break;
        case 2:
          modified = merge(samples, changeSpeed(samples, 2.0));
          break;
        case 3:
          modified = mix(samples, amplify(samples, 0.5));
          break;
        case 4:
          modified = reverse(samples);
          break;
      }

      StdAudio.play(reverse(samples));
    }

  }

  // Amplify. Crate a new sound that contains the same samples as an existing sound,
  // but with each sample multiplied by a constant α.
  // This increases the volume when α > 1 and decreases it when 0 < α < 1
  public static double[] amplify(double[] a, double alpha) {
    double[] amplified = new double[a.length];
    for (int i = 0; i < a.length; i++)
      amplified[i] = alpha * a[i];

    return amplified;
  }

  // Reverse. Create a new sound that contains the same samples as an existing sound, but in reverse order
  public static double[] reverse(double[] a) {
    double[] reversed = new double[a.length];
    for (int i = a.length; i > 0; i--)
      reversed[a.length - i] = a[i - 1];

    return reversed;
  }

  // Merge/join. Create a new sound that combines two existing sounds by appending the second one after the first
  // This enables you to play two sounds sequentially
  public static double[] merge(double[] a, double[] b) {
    double[] merged = new double[a.length + b.length];
    for (int i = 0; i < a.length; i++)
      merged[i] = a[i];
    for (int i = 0; i < b.length; i++)
      merged[a.length + i] = b[i];

    return merged;
  }

  // Mix/overlay. Create a new sound that combines two existing sounds by summing the values of the corresponding samples
  // This enables you to play two sounds simultaneously
  public static double[] mix(double[] a, double[] b) {
    double[] sum = new double[Math.max(a.length, b.length)];
    for (int i = 0; i < sum.length; i++) {
      if (i >= a.length) sum[i] = b[i];
      else if (i >= b.length) sum[i] = a[i];
      else sum[i] = a[i] + b[i];
    }

    return sum;
  }

  // Change speed. Create a new sound that changes the duration of an existing sound via resampling
  // α > 0
  public static double[] changeSpeed(double[] a, double alpha) {
    //  If the existing sound has n samples, then the new sound has ⌊n/α⌋ samples for some constant α > 0
    double[] newTempo = new double[(int) (a.length / alpha)];
    for (int i = 0; i < newTempo.length; i++) {
      // sample i of the new sound having the same amplitude as sample ⌊iα⌋ of the existing sound
      newTempo[i] = a[(int) (i * alpha)];
    }

    return newTempo;
  }
}
