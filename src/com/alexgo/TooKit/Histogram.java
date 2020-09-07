package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * A histogram counts the number of times each value appears and plots a
 * bar for each value (with height proportional to its frequency).
 *
 * Created by ag on 28-Aug-20 2:07 PM
 */
public class Histogram {

  private final double[] freq; // count frequency of each value
  private double maxFreq;      // stores the maximum frequency of any of the values (which corresponds
                               // to the height of the tallest bar)

  public Histogram(int n) {
    freq = new double[n];
  }

  /**
   * Records the number of times the data value i
   * appears in the data, for each i between 0 and n-1.
   *
   * @param i data point to add
   */
  public void addDataPoint(int i) {
    freq[i]++;
    if (freq[i] > maxFreq)
      maxFreq = freq[i];
  }

  /**
   * Draw (and scale) the histogram.
   * Scaling is done by the data point with maximum frequency recorded
   */
  public void plot() {
    StdDraw.setYscale(-1.0, maxFreq + 1);
    StdStats.plotBars(freq);
  }

  // Client
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);

    Histogram histogram = new Histogram(n + 1);

    StdDraw.setCanvasSize(500, 200);
    for (int t = 0; t < trials; t++) {

      // Bernoulli n trials flipping fair coin
      int heads = 0;
      for (int i = 0; i < n; i++)
        if (StdRandom.bernoulli(0.5)) heads++;

      histogram.addDataPoint(heads);
    }
    histogram.plot();
  }
}
