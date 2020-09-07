package com.alexgo.week_9_Creating_Data_Types;

import com.alexgo.TooKit.Turtle;

/**
 * Created by ag on 01-Sep-20 11:00 PM
 */
public class DrunkenTurtleTest {
  public static void main(String[] args) {
    int trials = Integer.parseInt(args[0]);
    double step = Double.parseDouble(args[1]);
    Turtle.drunkenTurtle(trials, step);
  }
}

// java DrunkenTurtles 20 5000 0.005
//                     20 500 0.005
//                     20 1000 0.005
class DrunkenTurtlesTest {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);          // number of turtles
    int trials = Integer.parseInt(args[1]);     // number of steps
    double step = Double.parseDouble(args[2]);  // step size

    Turtle.drunkenTurtles(n, trials, step);
  }
}
