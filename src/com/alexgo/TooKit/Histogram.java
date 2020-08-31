package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by ag on 28-Aug-20 2:07 PM
 */
public class Histogram {

  private final double[] freq; // count frequency of each value
  private double maxFreq;      // value with max frequency

  public Histogram(int points) {
    freq = new double[points];
  }

  public void addDataPoint(int i) {
    freq[i]++;
    if (freq[i] > maxFreq) maxFreq = freq[i];
  }

  public void plot() {
    StdDraw.setYscale(-1.0, maxFreq + 1);
    StdStats.plotBars(freq);
  }

}
