package com.alexgo.week_5.book_2_2;

import com.alexgo.TooKit.Gaussian;
import com.alexgo.week_5.PlayThatTuneDeluxe;
import edu.princeton.cs.algs4.StdArrayIO;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;

/**
 * Created by ag on 07-Aug-20 1:30 PM
 */
class RandomPoints {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdDraw.enableDoubleBuffering();
    for (int i = 0; i < n; i++) {
      double x = StdRandom.gaussian(.5, .2);
      double y = StdRandom.gaussian(.5, .2);
      StdDraw.point(x, y);
    }
    StdDraw.show();
  }
}

class IFS {
  public static void main(String[] args) { // Plot trials iterations of IFS on StdIn.
    int trials = Integer.parseInt(args[0]);
    double[] dist = StdArrayIO.readDouble1D(); // probabilities
    double[][] cx = StdArrayIO.readDouble2D(); // x coefficients
    double[][] cy = StdArrayIO.readDouble2D(); // y coefficients
    double x = 0.0, y = 0.0;

    StdDraw.enableDoubleBuffering();

    for (int t = 0; t < trials; t++) { // Plot 1 iteration.
      int r = StdRandom.discrete(dist);
      double x0 = cx[r][0] * x + cx[r][1] * y + cx[r][2];
      double y0 = cy[r][0] * x + cy[r][1] * y + cy[r][2];
      x = x0;
      y = y0;

      StdDraw.point(x, y);
    }

    StdDraw.show();
  }
}

class PlotData {
  public static void main(String[] args) {
    int n = 20;
    double[] a = new double[n];
    for (int i = 0; i < n; i++)
      a[i] = 1.0 / (i + 1);

//    StdStats.plotPoints(a);
//    StdStats.plotLines(a);
    StdStats.plotBars(a);
  }
}

class PlotTone {
  public static void main(String[] args) {
    StdDraw.setYscale(-1, 1);
    double[] hi = PlayThatTuneDeluxe.tone(440, 1);
    StdStats.plotPoints(hi);
  }
}

class Bernoulli {
  public static int binomial(int n) { // Simulate flipping a coin n times; return # heads.
    int heads = 0;
    for (int i = 0; i < n; i++)
      if (StdRandom.bernoulli(0.5)) heads++;
    return heads;
  }

  public static void main(String[] args) { // Perform Bernoulli trials, plot results and model.
    int n = Integer.parseInt(args[0]);
    int trials = Integer.parseInt(args[1]);
    int[] freq = new int[n + 1];
    for (int t = 0; t < trials; t++)
      freq[binomial(n)]++;
    double[] norm = new double[n + 1];
    for (int i = 0; i <= n; i++)
      norm[i] = (double) freq[i] / trials;
    StdStats.plotBars(norm);
    double mean = n / 2.0;
    double stddev = Math.sqrt(n) / 2.0;
    double[] phi = new double[n + 1];
    for (int i = 0; i <= n; i++)
      phi[i] = Gaussian.pdf(i, mean, stddev);
    StdStats.plotLines(phi);
  }
}