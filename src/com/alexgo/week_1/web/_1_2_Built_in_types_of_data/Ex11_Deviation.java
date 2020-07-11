package com.alexgo.week_1.web._1_2_Built_in_types_of_data;

/**
 * 11. Standard deviation.
 *  Modify Exercise 1.2.30 so that it prints the sample standard deviation in addition to the average.
 *
 *  Reference: https://www.calculator.net/standard-deviation-calculator.html
 *
 * Created by ag on 11-Jul-20 7:14 PM
 */
class Ex11_Deviation {
  public static void main(String[] args) {

    int n = 5;
    double x1 = Math.random();
    double x2 = Math.random();
    double x3 = Math.random();
    double x4 = Math.random();
    double x5 = Math.random();

    // print 5 values
    System.out.println(x1);
    System.out.println(x2);
    System.out.println(x3);
    System.out.println(x4);
    System.out.println(x5);

    // compute stats
    double min = Math.min(x1, Math.min(x2, Math.min(x3, Math.min(x4, x5))));
    double max = Math.max(x1, Math.max(x2, Math.max(x3, Math.max(x4, x5))));
    double termsSum = x1 + x2 + x3 + x4 + x5;
    double average = termsSum / n;
    double mean = termsSum / 5;
    double deviation = Math.sqrt(
            (Math.pow(x1 - mean, 2) + Math.pow(x2 - mean, 2) + Math.pow(x3 - mean, 2) +
            Math.pow(x4 - mean, 2) + Math.pow(x5 - mean, 2)) / 4
    );

    // print stats
    System.out.println("\nAverage = " + average);
    System.out.println("Min     = " + min);
    System.out.println("Max     = " + max);
    System.out.println("Mean    = " + mean);
    System.out.println("Deviation = " + deviation);
  }
}
