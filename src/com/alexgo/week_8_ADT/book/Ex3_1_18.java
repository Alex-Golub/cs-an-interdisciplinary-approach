package com.alexgo.week_8_ADT.book;

import edu.princeton.cs.algs4.StdIn;

/**
 * Created by ag on 30-Aug-20 7:02 PM
 */
class Ex3_1_18 {
  public static void main(String[] args) {
    while (true) {
      System.out.print("Enter string -> ");
      String input = StdIn.readLine();
      System.out.println("mystery -> " + mystery(input));
    }
  }

  public static String mystery(String s) {
    int n = s.length();
    if (n <= 1) return s;
    String a = s.substring(0, n / 2);
    String b = s.substring(n / 2, n);
    return mystery(b) + mystery(a);
  }
}


