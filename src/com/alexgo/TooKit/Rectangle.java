package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdDraw;

import java.awt.*;

/**
 * Created by ag on 04-Sep-20 9:05 PM
 */
public class Rectangle {
  private final double x, y;   // center of rectangle
  private final double width;  // width of rectangle
  private final double height; // height of rectangle

  public Rectangle(double x0, double y0, double w, double h) {
    x = x0;
    y = y0;
    width = w;
    height = h;
  }

  public double area() {
    return width * height;
  }

  public double perimeter() {
    return 2 * (width + height);
  }

  /**
   * Does this rectangle intersect b?
   * Two rectangles to intersect if they share one or more common points.
   *
   * @param other other rectangle
   * @return if this rectangle intersect with b
   */
  public boolean intersects(Rectangle other) {
    return true;
  }

  /**
   * Is b inside this rectangle?
   *
   * @param other other rectangle
   * @return if this rectangle contains other rectangle
   */
  public boolean contains(Rectangle other) {
    return true;
  }

  /**
   * Draw rectangle this and other on standard drawing.
   *
   * @param other other rectangle
   */
  public void draw(Rectangle other) {
    StdDraw.setPenRadius(0.005);
    StdDraw.setPenColor(Color.BLACK);
    StdDraw.rectangle(x, y, width / 2.0, height / 2.0);

    StdDraw.setPenColor(Color.RED);
    StdDraw.rectangle(other.x, other.y, other.width / 2.0, other.height / 2.0);
  }
}
