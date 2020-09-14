package com.alexgo.week_2.book;

/**
 * 1.3.20 Using Newton’s method, develop a program that takes two integer command-line arguments n
 * and k and prints the k-th root of n
 *
 * Created by ag on 14-Jul-20 6:16 PM
 */
class Ex1_3_20_kth_root_of_n {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);

    double xPre = Math.random() % 10; // initially guessing a random number between 0 and 9
    double eps = 1e-3;                // smaller eps, denotes more accuracy
    double delX = Integer.MAX_VALUE;  // initializing difference between two roots by INT_MAX
    double xK = 0.0;                  // denotes current value of x

    while (delX > eps) {              // loop until we reach desired accuracy
      xK = ((k - 1.0) * xPre + (double) n / Math.pow(xPre, k - 1)) / (double) k;
      delX = Math.abs(xK - xPre);
      xPre = xK;
    }

    System.out.println(xK);
  }

  /** Newton's method to find square root of a number */
  public static void sqrt(double n) {
    double EPSILON = 1e-15;  // 1e-5 == 0.00001 => accuracy of result
    double t = n;

    while (Math.abs(t - n / t) > EPSILON * t)
      t = (n / t + t) / 2.0;

    System.out.println(t);
  }
}
