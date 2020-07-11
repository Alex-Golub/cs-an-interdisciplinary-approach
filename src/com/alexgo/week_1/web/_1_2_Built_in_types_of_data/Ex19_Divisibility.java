package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 19. Write a program Divisibility.java that reads in two command line inputs and prints
 *  true if both are divisible by 7, and false otherwise.
 *
 * Created by ag on 11-Jul-20 7:50 PM
 */
class Ex19_Divisibility {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[0]);

    boolean isDivisibleBy7 = n1 % 7 == 0 && n2 % 7 == 0;

    System.out.println(isDivisibleBy7);
  }
}
