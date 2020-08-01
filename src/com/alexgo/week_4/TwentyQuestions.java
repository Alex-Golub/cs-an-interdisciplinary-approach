package com.alexgo.week_4;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.awt.*;

import static edu.princeton.cs.algs4.StdDraw.*;

/**
 * Created by ag on 27-Jul-20 3:19 PM
 */
class TwentyQuestions {
  public static void main(String[] args) { // Generate a number and answer questions
// while the user tries to guess the value.
    int secret = 1 + (int) (Math.random() * 1000000);
    StdOut.printf("I'm thinking of a number between 1 and %,d\n", 1_000_000);
    int guess = 0;
    while (guess != secret) { // Solicit one guess and provide one answer.
      StdOut.print("What's your guess? ");
      guess = StdIn.readInt();
      if (guess == secret) StdOut.println("You win!");
      if (guess < secret) StdOut.println("Too low ");
      if (guess > secret) StdOut.println("Too high");
    }
  }
}

class RandomSeq {
  public static void main(String[] args) { // Print a random sequence of n real values in [0, 1)
    int n = Integer.parseInt(args[0]);
    for (int i = 0; i < n; i++)
      System.out.println(Math.random());
  }
}

class Average {
  public static void main(String[] args) { // Average the numbers on standard input.
    double sum = 0.0;
    int n = 0;
    while (!StdIn.isEmpty()) { // Read a number from standard input and add to sum.
      double value = StdIn.readDouble();
      sum += value;
      n++;
    }
    double average = sum / n;
    StdOut.println("Average is " + average);
  }
}

class RangeFilter {
  public static void main(String[] args) { // Filter out numbers not between lo and hi.
    int lo = Integer.parseInt(args[0]);
    int hi = Integer.parseInt(args[1]);
    while (!StdIn.isEmpty()) { // Process one number.
      int value = StdIn.readInt();
      if (value >= lo && value <= hi)
        StdOut.print(value + " ");
    }
    StdOut.println();
  }
}

// redirection > < and piping |
// java App1 1000 > data.txt
// java App2 < data.txt
// Combination: java App1 100 | java App2

class Triangle {
  public static void main(String[] args) {
//    double t = Math.sqrt(3.0) / 2.0;
//    StdDraw.line(0.0, 0.0, 1.0, 0.0);
//    StdDraw.line(1.0, 0.0, 0.5, t);
//    StdDraw.line(0.5, t, 0.0, 0.0);
//    StdDraw.point(0.5, t / 3.0);
    int n = 50;
    setXscale(0, n);
    setYscale(0, n);
    setPenColor(Color.RED);
    setPenRadius(0.010);
    for (int i = 0; i <= n; i++)
      line(0, n - i, i, 0);

    setPenRadius(0.01);
    for (int i = 0; i <= n; i += 2)
      point(i, n - 5);
  }
}

class PlotFilter {
  public static void main(String[] args) {
// Scale as per first four values.
    double x0 = StdIn.readDouble();
    double y0 = StdIn.readDouble();
    double x1 = StdIn.readDouble();
    double y1 = StdIn.readDouble();
    setXscale(x0, x1);
    setYscale(y0, y1);
// Read the points and plot to standard drawing.
    while (!StdIn.isEmpty()) {
      double x = StdIn.readDouble();
      double y = StdIn.readDouble();
      point(x, y);
    }
  }
}

class FunctionGraph {
  public static void main(String[] args) {
    int n = StdIn.readInt();
    double[] x = new double[n + 1];
    double[] y = new double[n + 1];

    for (int i = 0; i <= n; i++)
      x[i] = Math.PI * i / n;
    for (int i = 0; i <= n; i++)
      y[i] = Math.sin(4 * x[i]) + Math.sin(20 * x[i]);

    setXscale(0, Math.PI);
    setYscale(-2.0, 2.0);

    for (int i = 1; i <= n; i++)
      line(x[i - 1], y[i - 1], x[i], y[i]);
  }
}

class Shapes {
  public static void main(String[] args) {
    square(.2, .8, .1);
    filledSquare(.8, .8, .2);
    circle(.8, .2, .2);
    double[] xd = {.1, .2, .3, .2};
    double[] yd = {.2, .3, .2, .1};
    filledPolygon(xd, yd);
    text(.2, .5, "black text");
    setPenColor(WHITE);
    text(.8, .8, "white text");

  }
}

class BouncingBall {
  public static void main(String[] args) { // Simulate the motion of a bouncing ball.
    // initial values
    double rx = 0.480, ry = 0.860;     // position
    double vx = 0.015, vy = 0.023;     // velocity
    double radius = 0.05;              // radius

    // set the scale of the coordinate system
    StdDraw.setXscale(-1.0, 1.0);
    StdDraw.setYscale(-1.0, 1.0);
    StdDraw.enableDoubleBuffering();

    // main animation loop
    while (true) {

      // bounce off wall according to law of elastic collision
      if (Math.abs(rx + vx) + radius > 1.0) {
        vx = -vx;
        StdAudio.play("pipebang.wav");
      }
      if (Math.abs(ry + vy) + radius > 1.0) {
        vy = -vy;
        StdAudio.play("pipebang.wav");
      }

      // update position
      rx = rx + vx;
      ry = ry + vy;

      // set the background to light gray
      StdDraw.clear(StdDraw.LIGHT_GRAY);

      // draw ball on the screen
      StdDraw.picture(rx, ry, "TennisBall.gif");

      // display and pause for 20ms
      StdDraw.show();
      StdDraw.pause(20);

    }
  }
}

/** Draw a blue filled circle wherever the mouse is, in cyan if the mouse is pressed. */
class MouseFollower {
  public static void main(String[] args) {

    StdDraw.enableDoubleBuffering();

    while (true) {

      // mouse click
      if (StdDraw.isMousePressed()) StdDraw.setPenColor(StdDraw.CYAN);
      else                          StdDraw.setPenColor(StdDraw.BLUE);

      // mouse location
      StdDraw.clear();
      double x = StdDraw.mouseX();
      double y = StdDraw.mouseY();
      StdDraw.filledCircle(x, y, 0.05);
      StdDraw.show();
      StdDraw.pause(5);
    }
  }
}

/** A particle is attracted to the current location of the mouse. Incorporates drag. */
class OneSimpleAttractor {
  public static void main(String[] args) {
    double rx = 0.0, ry = 0.0;   // position
    double vx = 0.0, vy = 0.0;   // velocity
    double mass = 1.0;           // mass
    double dt   = 0.5;           // time quantum
    double drag = 0.05;           // mess around with this a bit
    double attractionStrength = 0.01;

    // do the animation
    StdDraw.enableDoubleBuffering();
    while (true) {

      // compute the attractive force to the mouse, accounting for drag
      double dx = StdDraw.mouseX() - rx;
      double dy = StdDraw.mouseY() - ry;
      double fx = (dx * attractionStrength) - (drag * vx);
      double fy = (dy * attractionStrength) - (drag * vy);

      // Euler step: update velocity, then position
      vx += fx * dt / mass;
      vy += fy * dt / mass;
      rx += vx * dt;
      ry += vy * dt;

      // draw particle
      StdDraw.clear();
      StdDraw.setPenColor(StdDraw.BLUE);
      StdDraw.filledCircle(rx, ry, 0.02);
      StdDraw.show();
      StdDraw.pause(10);
    }
  }
}

class SimpleAttractors {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    double[] rx = new double[n];
    double[] ry = new double[n];
    double[] vx = new double[n];
    double[] vy = new double[n];
    double dt = 0.5;
    double mass = 1.0;
    double drag = 0.05;     // try changing this to 0.1 or 0.01 or even 0...
    double attractionStrength = 0.01;

    // initialize the drawing area
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.enableDoubleBuffering();
    StdDraw.setScale(-1, +1);

    // do the animation
    while (true) {
      // if the mouse is pressed add some random velocity to all the particles
      if (StdDraw.isMousePressed()) {
        for (int i = 0; i < n; i++) {
          vx[i] = 0.2 * Math.random() - 0.1;
          vy[i] = 0.2 * Math.random() - 0.1;
        }
      }

      // clear all the forces
      double[] fx = new double[n];
      double[] fy = new double[n];

      // add attraction forces for attraction to the mouse
      for (int i = 0; i < n; i++) {
        double dx = StdDraw.mouseX() - rx[i];
        double dy = StdDraw.mouseY() - ry[i];
        fx[i] += attractionStrength * dx;
        fy[i] += attractionStrength * dy;
      }

      // add drag forces to all particles
      // drag is proportional to velocity in the opposite direction
      for (int i = 0; i < n; i++) {
        fx[i] += -drag * vx[i];
        fy[i] += -drag * vy[i];
      }

      // update positions
      // euler step
      for (int i = 0; i < n; i++) {
        vx[i] += fx[i] * dt / mass;
        vy[i] += fy[i] * dt / mass;
        rx[i] += vx[i] * dt;
        ry[i] += vy[i] * dt;
      }


      StdDraw.clear();

      // draw a filled circle for each particle
      for (int i = 0; i < n; i++) {
        StdDraw.filledCircle(rx[i], ry[i], 0.01);
      }

      StdDraw.show();
      StdDraw.pause(10);
    }
  }
}

class Springs {
  public static void main(String[] args) {
    // mess around with this, try 7, 8, 9, 10, 11, 12, 15
    // probably have to turn down the spring force to keep it stable after that...
    int n = Integer.parseInt(args[0]);

    double[] rx = new double[n];
    double[] ry = new double[n];
    double[] vy = new double[n];
    double[] vx = new double[n];
    double particleMass = 1.0;
    double drag = 0.1;
    double springStrength = 0.1;
    double springLength = 30;
    double gravity = 1.0;
    double timeStep = 0.5;

    // set up the drawing area
    StdDraw.setXscale(0, 100);
    StdDraw.setYscale(0, 100);
    StdDraw.setPenColor(StdDraw.BLUE);
    StdDraw.setPenRadius(0.0025);
    StdDraw.enableDoubleBuffering();

    // initialize the particle positions randomly
    for (int i = 0; i < n; i++) {
      rx[i] = 100 * Math.random();
      ry[i] = 100 * Math.random();
    }


    // do the animation
    while (true) {

      // clear all the forces
      double[] fx = new double[n];
      double[] fy = new double[n];

      // spring forces act between every pairing of particles
      // spring force is proportional to the difference between the rest length of the spring
      // and the distance between the 2 particles it's acting on
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

          if (i == j) continue;

          // calculate distance between particles i and j
          double dx = rx[j] - rx[i];
          double dy = ry[j] - ry[i];
          double length = Math.sqrt(dx*dx + dy*dy);

          // figure out the force
          double force = springStrength * (length - springLength);
          double springForceX = force * dx / length;
          double springForceY = force * dy / length;

          // update the force
          fx[i] += springForceX;
          fy[i] += springForceY;
        }
      }

      // add drag force
      // drag is proportional to velocity but in the opposite direction
      for (int i = 0; i < n; i++) {
        fx[i] += -drag * vx[i];
        fy[i] += -drag * vy[i];
      }

      // add gravity forces
      // just add some force pointing down to all of them
      for (int i = 0; i < n; i++) {
        fy[i] += -gravity;
      }

      // fix particle 1 at the mouse position
      rx[0] = StdDraw.mouseX();
      ry[0] = StdDraw.mouseY();
      vx[0] = 0.0;
      vy[0] = 0.0;
      fx[0] = 0.0;
      fy[0] = 0.0;

      // update positions using approximation
      for (int i = 0; i < n; i++) {
        vx[i] += fx[i] * timeStep/particleMass;
        vy[i] += fy[i] * timeStep/particleMass;
        rx[i] += vx[i] * timeStep;
        ry[i] += vy[i] * timeStep;
      }


      // clear
      StdDraw.clear();

      // draw everything
      for (int i = 0; i < n; i++) {
        // draw a circle for each node
        StdDraw.filledCircle(rx[i], ry[i], 1.0);

        // draw the connections between every 2 nodes
        for (int j = 0; j < i; j++) {
          StdDraw.line(rx[i], ry[i], rx[j], ry[j]);
        }
      }

      // show and wait
      StdDraw.show();
      StdDraw.pause(10);
    }
  }
}