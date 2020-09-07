package com.alexgo.week_9_Creating_Data_Types;

import com.alexgo.TooKit.Turtle;

/**
 * Created by ag on 01-Sep-20 10:36 PM
 */
public class Koch {
  public static void koch(int n, double step, Turtle turtle) {
    if (n == 0) {
      turtle.goForward(step);
      return;
    }

    koch(n - 1, step, turtle);
    turtle.turnLeft(60.0);

    koch(n - 1, step, turtle);
    turtle.turnLeft(-120.0);

    koch(n - 1, step, turtle);
    turtle.turnLeft(60.0);

    koch(n - 1, step, turtle);
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double step = 1.0 / Math.pow(3.0, n);
    Turtle turtle = new Turtle(0.0, 0.5, 0.0);
    koch(n, step, turtle);
  }
}
