package com.alexgo.week_2.web_exercises;

/**
 * 30. Write the shortest Java program you can that takes an integer
 * command-line argument n and prints true
 * if (1 + 2 + ... + n)^2 is equal to (1^3 + 2^3 + ... + n^3).
 *
 * Created by ag on 28-Sep-20 3:27 PM 
 */
class Ex30 {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // Elementary progression mathematics
    // (1 + 2 + ... + n)^2 = (n(n+1)/2)^2
    // 1^3 + 2^3 + ... + n^3 = (n(n+1)/2)^2

    long sum2 = (long) Math.pow(n * (n + 1) / 2, 2);
    long sum3 = 0;
    for (int i = 1; i <= n; i++)
      sum3 += i * i * i;

    System.out.println(sum2 + " : " + sum3);

    // i.e. we could have write it in one line
    // System.out.println(true);
  }
}
