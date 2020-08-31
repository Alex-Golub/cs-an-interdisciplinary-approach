package com.alexgo.week_8_ADT.inputOutput;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * Created by ag on 26-Aug-20 9:38 PM
 */
class Split {
  public static void main(String[] args) {
    String fName = args[0];
    int n = Integer.parseInt(args[1]); // # of fields
    String delimiter = args[2];

    // each field will have its own output file
    Out[] out = new Out[n];
    for (int i = 0; i < n; i++)
      out[i] = new Out(fName + i);

    // read csv file and write each line into its respective file
    In in = new In(fName + ".csv");
    while (in.hasNextLine()) {
      String line = in.readLine();
      String[] fields = line.split(delimiter);
      for (int i = 0; i < n; i++)
        out[i].println(fields[i]);
    }
  }
}
