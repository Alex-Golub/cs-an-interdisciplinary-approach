package com.alexgo.week_10_Designing_Data_Types.assignment;

import java.util.Arrays;

/**
 * 1. Bar data type.
 * A bar aggregates related information (name, value, and category) for use in a bar chart.
 * For example, the first bar drawn in the bar chart represents;
 * name = Beijing, value = 672, and category = East Asia.
 *
 * Created by ag on 10-Sep-20 4:40 PM
 */
public class Bar implements Comparable<Bar> {

  private final String name;
  private final int value;
  private final String category;

  public Bar(String name, int value, String category) {
    if (name == null)     throw new IllegalArgumentException("name arg is null");
    if (value < 0)        throw new IllegalArgumentException("value is negative");
    if (category == null) throw new IllegalArgumentException("category is null");

    this.name = name;
    this.value = value;
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public int getValue() {
    return value;
  }

  public String getCategory() {
    return category;
  }

  public int compareTo(Bar that) {
    if (that == null) throw new NullPointerException("Bar arg to compareTo is null");
    return Integer.compare(this.value, that.value);
  }

  public String toString() {
    return String.format("%s | %d | %s", name, value, category);
  }

  // Sample client (see below).
  public static void main(String[] args) {
    Bar[] bars = new Bar[10];
    bars[0] = new Bar("Beijing",     22674, "East Asia");
    bars[1] = new Bar("Cairo",       19850, "Middle East");
    bars[2] = new Bar("Delhi",       27890, "South Asia");
    bars[3] = new Bar("Dhaka",       19633, "South Asia");
    bars[4] = new Bar("Mexico City", 21520, "Latin America");
    bars[5] = new Bar("Mumbai",      22120, "South Asia");
    bars[6] = new Bar("Osaka",       20409, "East Asia");
    bars[7] = new Bar("São Paulo",   21698, "Latin America");
    bars[8] = new Bar("Shanghai",    25779, "East Asia");
    bars[9] = new Bar("Tokyo",       38194, "East Asia");

    System.out.println(Arrays.toString(bars));

    System.out.println();
    // sort in ascending order by weight
    Arrays.sort(bars);

    System.out.println(Arrays.toString(bars));
  }

}
