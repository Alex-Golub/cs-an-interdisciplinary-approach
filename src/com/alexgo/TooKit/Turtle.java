package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Created by ag on 01-Sep-20 9:37 PM
 */
public class Turtle {
  private double x, y;  // position (in unit square)
  private double angle; // direction of motion (degrees, counterclockwise from x-axis)

  /**
   * Create a new turtle at (x0, yo) facing a0
   * degrees counterclockwise from the x-axis
   *
   * @param x0 horizontal axis
   * @param y0 vertical axis
   * @param a0 degrees counterclockwise from the x-axis
   */
  public Turtle(double x0, double y0, double a0) {
    x = x0;
    y = y0;
    angle = a0;
  }

  /**
   * Rotate delta degrees counterclockwise
   *
   * @param delta degrees to rotate counterclockwise
   */
  public void turnLeft(double delta) {
    angle += delta;
  }

  /**
   * Move distance step, drawing a line
   *
   * @param step to move in a0 direction
   */
  public void goForward(double step) { // Compute new position; move and draw line to it.
    double oldx = x, oldy = y;
    x += step * Math.cos(Math.toRadians(angle));
    y += step * Math.sin(Math.toRadians(angle));

    StdDraw.line(oldx, oldy, x, y);
  }

  /**
   * Brownian motion of a drunken turtle
   * (moving a fixed distance in a random direction)
   *
   * @param trials number of trials
   * @param step   step size
   */
  public static void drunkenTurtle(int trials, double step) {
    Turtle turtle = new Turtle(0.5, 0.5, 0.0);
    StdDraw.setCanvasSize(800, 800);

    for (int t = 0; t < trials; t++) {
      turtle.turnLeft(StdRandom.uniform(0.0, 360.0));
      turtle.goForward(step);
    }
  }

  /**
   * Brownian motion of a bale of drunken turtles
   *
   * @param n      number of turtles
   * @param trials number of trials
   * @param step   each turtle step size
   */
  public static void drunkenTurtles(int n, int trials, double step) {
    StdDraw.setCanvasSize(800, 800);

    // Create n Turtles and set each one in random starting (x0, y0) position
    Turtle[] turtles = new Turtle[n];
    for (int i = 0; i < n; i++) {
      double x = StdRandom.uniform(0.0, 1.0);
      double y = StdRandom.uniform(0.0, 1.0);
      turtles[i] = new Turtle(x, y, 0.0);
    }

    for (int t = 0; t < trials; t++) {  // All turtles take one step
      for (int i = 0; i < n; i++) {     // Turtle i takes one step in a random direction
        turtles[i].turnLeft(StdRandom.uniform(0.0, 360.0));
        turtles[i].goForward(step);
      }
    }
  }

  @Override
  public String toString() {
    return "Turtle{" +
            "x=" + x +
            ", y=" + y +
            ", angle=" + angle +
            '}';
  }

  // Test Client
  public static void main(String[] args) { // Draw a regular polygon with n sides.
    int n = Integer.parseInt(args[0]);
    double angle = 360.0 / n;
    double step = Math.sin(Math.toRadians(angle / 2));

    Turtle turtle = new Turtle(0.5, 0.0, angle / 2);

    for (int i = 0; i < n; i++) {
      turtle.goForward(step);
      turtle.turnLeft(angle);
    }
  }
}
