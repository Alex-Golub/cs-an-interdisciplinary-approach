package com.alexgo.week_2.book;

/**
 * 1.3.20 Using Newton’s method, develop a program that takes two integer command-line arguments n
 * and k and prints the k-th root of n
 *
 * https://www.geeksforgeeks.org/n-th-root-number/
 *
 * Created by ag on 14-Jul-20 6:16 PM
 */
class Ex1_3_20_kth_root_of_n {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int k = Integer.parseInt(args[1]);

//    according to newton’s method
//    x(K+1) = x(K) – f(x) / f’(x)
//    here     f(x)  = x^(N) – A
//    so       f’(x) = N*x^(N - 1)
//    and      x(K) denoted the value of x at Kth iteration
//    putting the values and simplifying we get,
//    x(K + 1) = (1 / N) * ((N - 1) * x(K) + A / x(K) ^ (N - 1))

    // initially guessing a random number between 0 and 9
    double xPre = Math.random() % 10;

    // smaller eps, denotes more accuracy
    double eps = 1e-3;

    // initializing difference between two roots by INT_MAX
    double delX = 2147483647;

    // xK denotes current value of x
    double xK = 0.0;

    // loop until we reach desired accuracy
    while (delX > eps) {
      // calculating current value from previous value by newton's method
      xK = ((k - 1.0) * xPre + (double) n / Math.pow(xPre, k - 1)) / (double) k;
      delX = Math.abs(xK - xPre);
      xPre = xK;
    }

    System.out.println(xK);

  }

  /**
   * Newton's method to find square root of a number
   */
  public static void sqrt(double c) {
    double EPSILON = 1e-15;  // 1e-5 == 0.00001 => accuracy of result
    double t = c;

    while (Math.abs(t - c / t) > EPSILON * t)
      t = (c / t + t) / 2.0;

    System.out.println(t);
  }
}
