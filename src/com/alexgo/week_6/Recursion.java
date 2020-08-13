package com.alexgo.week_6;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.math.BigInteger;

/**
 * Created by ag on 10-Aug-20 3:26 PM
 */
class TowersOfHanoi {
  public static void moves(int n, boolean left) {
    if (n == 0) return;
    moves(n - 1, !left);
    if (left) StdOut.println(n + " left");
    else      StdOut.println(n + " right");
    moves(n - 1, !left);
  }

  public static void main(String[] args) { // Read n, print moves to move n discs left.
    long t0 = System.currentTimeMillis();
    int n = Integer.parseInt(args[0]);
    moves(n, true);
    long t = System.currentTimeMillis();
    StdOut.println("Time: " + (t - t0) / 1000 + "sec");
  }
}

class Beckett {
  public static void moves(int n, boolean enter) {
    if (n == 0) return;
    moves(n - 1, true);
    if (enter) StdOut.println("enter " + n); // stage direction
    else       StdOut.println("exit " + n);
    moves(n - 1, false);
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // number of actors
    moves(n, true);
  }
}

class Brownian {
  public static void curve(double x0, double y0,
                           double x1, double y1,
                           double var, double s) {
    if (x1 - x0 < 0.01) {
      StdDraw.line(x0, y0, x1, y1);
      return;
    }
    double xm = (x0 + x1) / 2;
    double ym = (y0 + y1) / 2;
    double delta = StdRandom.gaussian(0, Math.sqrt(var));
    curve(x0, y0, xm, ym + delta, var / s, s);
    curve(xm, ym + delta, x1, y1, var / s, s);
  }

  public static void main(String[] args) {
    double hurst = Double.parseDouble(args[0]);
    double s = Math.pow(2, 2 * hurst);
    curve(0, 0.5, 1.0, 0.5, 0.01, s);
  }
}

class Fibonacci {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdOut.println(fibonacci(n));
  }

  // Warning: this function is spectacularly inefficient.
  public static long fibonacci(int n) {
    if (n == 0) return 0;
    if (n == 1) return 1;
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}

class TopDownFibonacci {
  private static long[] f = new long[101]; // cached values

  public static long fibonacci(int n) {
    if (n == 0)   return 0;
    if (n == 1)   return 1;
    if (f[n] > 0) return f[n];                       // return cached value (if previously computed)
    f[n] = fibonacci(n - 1) + fibonacci(n - 2); // compute and cache value
    return f[n];
  }

  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdOut.println(fibonacci(n));
  }
}

class BottomUpFibonacci {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    StdOut.println(fibonacci(n));
  }

  private static long fibonacci(int n) {
    long[] f = new long[n + 1]; // store n solved sub-problems
    f[0] = 0;
    f[1] = 1;
    for (int i = 2; i <= n; i++) // solve i-th problem using previous solved sub-problems
      f[i] = f[i - 1] + f[i - 2];

    return f[n];
  }
}

class LongestCommonSubsequence {
  public static String lcs(String s, String t) { // Compute length of LCS for all subproblems.
    int m = s.length(), n = t.length();
    int[][] opt = new int[m + 1][n + 1];
    for (int i = m - 1; i >= 0; i--)
      for (int j = n - 1; j >= 0; j--)
        if (s.charAt(i) == t.charAt(j))
          opt[i][j] = opt[i + 1][j + 1] + 1;
        else
          opt[i][j] = Math.max(opt[i + 1][j], opt[i][j + 1]);

    // Recover LCS itself.
    String lcs = "";
    int i = 0, j = 0;
    while (i < m && j < n) {
      if (s.charAt(i) == t.charAt(j)) {
        lcs += s.charAt(i);
        i++;
        j++;
      } else if (opt[i + 1][j] >= opt[i][j + 1]) i++;
      else j++;
    }
    return lcs;
  }

  public static void main(String[] args) {
    StdOut.println(lcs(args[0], args[1]));
  }
}

class Quiz {
  public static void main(String[] args) {
//    System.out.println(Q2(6));
//    Q3(6);
//    System.out.println((Q5(8)));
//    System.out.println(factorial(35));
//    System.out.println(factorialBig(BigInteger.valueOf(35)));
//    System.out.println(ex234(6));

    System.out.println(mystery(3, 11));
    System.out.println(mystery2(2, 10));
    System.out.println(mystery2(3, 11));
  }

  public static int mystery2(int a, int b) {
    if (b == 0)     return 1;
    if (b % 2 == 0) return mystery2(a*a, b/2);
    return mystery2(a*a, b/2) * a;
  }

  public static int mystery(int a, int b) {
    if (b == 0)     return 0;
    if (b % 2 == 0) return mystery(a+a, b/2);
    return mystery(a+a, b/2) + a;
  }

  private static BigInteger factorialBig(BigInteger n) {
    if (n.compareTo(BigInteger.ONE) < 0) return BigInteger.ONE;
    return n.multiply(factorialBig(n.subtract(BigInteger.ONE)));
  }

  public static long factorial(int n) {
    if (n <= 1) return 1;
    return n * factorial(n - 1);
  }

  public static int Q2(int n) {
    if (n <= 0) return 1;
    return 1 + Q2(n - 2) + Q2(n - 3);
  }

  public static void Q3(int n) {
    if (n <= 0) return;
    StdOut.println(n);
    Q3(n - 2);
    Q3(n - 3);
    StdOut.println(n);
  }

  public static int Q5(int n) {
    int[] b = new int[n + 1];
    b[0] = 1;
    for (int i = 2; i <= n; i++) {
      b[i] = 0;
      for (int j = 0; j < i; j++)
        b[i] += b[j];
    }
    return b[n];
  }

  public static String ex234(int n) {
    if (n <= 0) return "";
    return ex234(n-3) + n + ex234(n-2) + n;
  }
}