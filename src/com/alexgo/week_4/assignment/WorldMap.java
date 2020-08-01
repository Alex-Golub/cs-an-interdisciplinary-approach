package com.alexgo.week_4.assignment;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

/**
 * 3. World maps.
 * Write a program WorldMap.java that reads boundary information of a country (or other geographic
 * entity)
 * from standard input and plots the results to standard drawing.
 * A country consists of a set of regions (e.g., states, provinces, or other administrative
 * divisions),
 * each of which is described by a polygon.
 * <p>
 * Input format.
 * The first line contains two integers: width and height.
 * The remaining part of the input is divided into regions.
 * <p>
 * Created by ag on 01-Aug-20 8:16 PM
 */
public class WorldMap {
  public static void main(String[] args) {
    int w = StdIn.readInt();
    int h = StdIn.readInt();

    StdDraw.setCanvasSize(w, h);
    StdDraw.setXscale(0, w);
    StdDraw.setYscale(0, h);

    while (!StdIn.isEmpty()) {
      String region = StdIn.readString();  // name of the region
      int vertices = StdIn.readInt();      // vertices in the polygon describing the region
      double[] x = new double[vertices];
      double[] y = new double[vertices];
      for (int i = 0; i < vertices; i++) {
        x[i] = StdIn.readDouble();
        y[i] = StdIn.readDouble();
      }

      StdDraw.polygon(x, y);
    }
  }
}

