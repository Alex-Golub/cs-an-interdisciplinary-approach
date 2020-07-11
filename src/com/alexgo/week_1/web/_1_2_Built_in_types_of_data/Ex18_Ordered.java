package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 18. Write a program Ordered.java that reads in three integer command line arguments, x, y, and z.
 *  Create a boolean variable b that is true if the three values are either in ascending or in
 *  descending order, and false otherwise. Print the variable b.
 *
 *  javac Ex18_Ordered.class
 *  
 *  java Ex18_Ordered 1 2 3
 *  ascending or descending
 *
 *  java Ex18_Ordered 1 2 2
 *  not ascending nor descending
 *
 * Created by ag on 11-Jul-20 7:45 PM
 */
class Ex18_Ordered {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    int z = Integer.parseInt(args[2]);
    boolean b = false;

    if (x > y && y > z || x < y && y < z)
      b = true;

    System.out.println(b ? "ascending or descending" : "not ascending nor descending");
  }
}
