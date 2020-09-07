package com.alexgo.week_9_Creating_Data_Types;

import com.alexgo.TooKit.Turtle;

/**
 * This code is a modification of the test client in Program 3.2.4 that decreases the step size at
 * each step and cycles around 10 times.
 * The angle controls the shape;
 * the decay controls the nature of the spiral.
 *
 * Created by ag on 01-Sep-20 10:48 PM
 */
public class Spiral {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);                  // controls the shape of the spiral
    double decay = Double.parseDouble(args[1]);         // decay factor > 1,
                                                        // path spirals into the center of the drawing
    double angle = 360.0 / n;                           // rotation amount
    double step = Math.sin(Math.toRadians(angle / 2));

    Turtle turtle = new Turtle(0.5, 0, angle / 2);

    final int CYCLE_AROUND = 10;
    for (int i = 0; i < CYCLE_AROUND * 360 / angle; i++) {
      step /= decay;
      turtle.goForward(step);
      turtle.turnLeft(angle);
    }
  }
}
