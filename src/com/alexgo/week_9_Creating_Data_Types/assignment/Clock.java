package com.alexgo.week_9_Creating_Data_Types.assignment;

/**
 * 2. Clock data type.
 * Write a data type Clock.java that represents time on a 24-hour clock,
 * such as 00:00, 13:30, or 23:59.
 * Time is measured in hours (00–23) and minutes (00–59).
 *
 * Created by ag on 05-Sep-20 3:39 PM
 */
public class Clock {

  private static final int HOURS_PER_DAY = 24;
  private static final int MINUTES_PER_HOUR = 60;
  private int h;
  private int m;

  // Creates a clock whose initial time is h hours and m minutes.
  public Clock(int h, int m) {
    isValid(h, m);
    this.h = h;
    this.m = m;
  }

  // Creates a clock whose initial time is specified as a string, using the format HH:MM.
  public Clock(String s) {
    String[] parts = s.split(":");
    if (parts.length != 2 || parts[0].length() != 2 || parts[1].length() != 2)
      throw new IllegalArgumentException("Invalid format. Should be HH:MM got " + s);

    int hour = Integer.parseInt(parts[0]);
    int min = Integer.parseInt(parts[1]);

    isValid(hour, min);
    this.h = hour;
    this.m = min;
  }


  private void isValid(int hour, int min) {
    if (hour < 0 || hour > HOURS_PER_DAY - 1)
      throw new IllegalArgumentException("Hours valid value range is [0, 23] got " + h);
    if (min < 0 || min > MINUTES_PER_HOUR - 1)
      throw new IllegalArgumentException("Minutes valid value range is [0, 59] got " + m);
  }

  // Returns a string representation of this clock, using the format HH:MM.
  public String toString() {
    return String.format("%02d:%02d", h, m);
  }

  // Is the time on this clock earlier than the time on that one?
  public boolean isEarlierThan(Clock that) {
    if (this.h < that.h) return true;
    return this.h == that.h && this.m < that.m;
  }

  // Adds 1 minute to the time on this clock.
  public void tic() {
    this.m += 1;
    if (this.m % MINUTES_PER_HOUR == 0) {
      this.m = 0;
      this.h += 1;
      if (this.h % HOURS_PER_DAY == 0)
        this.h = 0;
    }
  }

  // Adds Δ minutes to the time on this clock.
  public void toc(int delta) {
    if (delta < 0)
      throw new IllegalArgumentException("Delta can't be a negative number");

    int totalMin = this.h * MINUTES_PER_HOUR + this.m + delta;

    this.h = (totalMin / MINUTES_PER_HOUR) % HOURS_PER_DAY;
    this.m = totalMin % MINUTES_PER_HOUR;
  }

  // Test client (see below).
  public static void main(String[] args) {
    Clock clock  = new Clock(0, 59);
    Clock clock1 = new Clock("23:03");

    System.out.println(clock);
    System.out.println(clock1);

    System.out.println(clock.isEarlierThan(clock1));
    System.out.println(clock1.isEarlierThan(clock));

    for (int i = 0; i < 60; i++) {
      clock.tic();
      clock1.tic();
    }
    System.out.println(clock);
    System.out.println(clock1);

    clock.toc(10);
    System.out.println(clock);

    // Clock clock = new Clock(0, 0);
    // clock.toc(30000);
    // System.out.println(clock);
  }
}

