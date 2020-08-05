package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 2.1.17 Write a static method reverse() that takes an array of strings as its argument and
 * returns a new array with the strings in reverse order. (Do not change the
 * order of the strings in the argument array.)
 *
 * Write a static method reverseInPlace()
 * that takes an array of strings as its argument and produces the side effect of reversing
 * the order of the strings in the argument array.
 *
 * Created by ag on 04-Aug-20 12:22 PM
 */
class Ex17 {
  public static void main(String[] args) {
    String[] a = {"abc", "my name", "what is this", "cs1 is great"};
    StdOut.println(Arrays.toString(reverse(a)));

    StdOut.println(Arrays.toString(a));
    reverseInPlace(a);
    StdOut.println(Arrays.toString(a));
  }

  public static String[] reverse(String[] a) {
    String[] result = new String[a.length];
    for (int i = 0; i < a.length; i++)
      result[i] = reverseString(a[i]);

    return result;
  }

  private static String reverseString(String s) {
    String reversed = "";
    for (int i = s.length() - 1; i >= 0; i--)
      reversed += s.charAt(i); // use StringBuilder to optimize space

    return reversed;
  }

  // reversing the order of the strings in the argument array.
  public static void reverseInPlace(String[] a) {
    for (int i = 0; i < a.length / 2; i++) {
      exchange(a, i, a.length - 1 - i);
    }
  }

  private static void exchange(String[] a, int i, int j) {
    String tmp = a[i];
    a[i] = a[j];
    a[j] = tmp;
  }

}
