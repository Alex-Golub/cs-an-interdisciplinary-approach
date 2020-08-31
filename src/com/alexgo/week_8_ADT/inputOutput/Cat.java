package com.alexgo.week_8_ADT.inputOutput;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * Created by ag on 26-Aug-20 8:47 PM
 */
class Cat {
  public static void main(String[] args) {
    Out out = new Out("out.txt"); // write args files content to out.txt

    for (String arg : args) {
      In in = new In(arg);
      String s = in.readAll();
      out.println(s);
    }
  }
}
