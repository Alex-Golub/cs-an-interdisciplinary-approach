package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 22. Body mass index.
 * The body mass index (BMI) is the ratio of the weight of a person (in kilograms) to the square
 * of the height (in meters).
 *
 * Write a program BMI.java that takes two command-line arguments, weight and height, and prints the BMI.
 *
 * Reference: https://en.wikipedia.org/wiki/Body_mass_index
 *
 * Created by ag on 11-Jul-20 8:20 PM
 */
class Ex22_BMI {
  public static void main(String[] args) {
    double w = Double.parseDouble(args[0]); // kilograms
    double h = Double.parseDouble(args[1]); // meters

    double bmi = w / (h * h);

    System.out.println("BMI: " + bmi);
  }
}
