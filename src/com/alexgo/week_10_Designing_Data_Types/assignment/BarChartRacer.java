package com.alexgo.week_10_Designing_Data_Types.assignment;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdDraw;

import java.util.Arrays;

/**
 * 3. Bar chart racer. Write a program to produce animated bar charts,
 * using BarChart.java to draw static bar charts.
 *
 * Created by alexgo on 10-Sep-20 5:28 PM
 */
public class BarChartRacer {
  public static void main(String[] args) {
    String file = args[0];
    int k = Integer.parseInt(args[1]); // number of bars in each bar chart

    In in = new In(file);

    String title   = in.readLine();
    String xAxis   = in.readLine();
    String source  = in.readLine();
    BarChart chart = new BarChart(title, xAxis, source);

    StdDraw.setCanvasSize(1000, 700);
    StdDraw.enableDoubleBuffering();

    while (in.hasNextLine()) {
      in.readLine(); // read white blank separator line

      int n = Integer.parseInt(in.readLine()); // number of records per year
      Bar[] bars = new Bar[n];

      for (int i = 0; i < n; i++) {
        String[] record = in.readLine().split(",");

        String year     = record[0];
        String city     = record[1];
//        String country  = record[2];
        int value       = Integer.parseInt(record[3]);
        String category = record[4];

        bars[i] = new Bar(city, value, category);
        chart.setCaption(year);
      }

      Arrays.sort(bars);

      // Add ASC sorted bars to chart
      for (int i = n - 1; i > n - k - 1; i--)
        chart.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());

      StdDraw.clear();
      chart.draw();
      StdDraw.show();
      StdDraw.pause(40);
      chart.reset();
    }
  }
}
