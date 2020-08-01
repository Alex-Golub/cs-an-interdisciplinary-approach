package com.alexgo.week_3.book;

import java.util.Arrays;

/**
 * 1.4.4 Write a code fragment that reverses the order of the values in a one-dimensional string array.
 * Do not create another array to hold the result.
 *
 * Created by ag on 22-Jul-20 9:26 PM
 */
class Ex4_Reverse {
  public static void main(String[] args) {
//    String[] arr = {"a", "b", "c", "d", "e"}; // odd length
    String[] arr = {"a", "b", "d", "e"}; // even length

    System.out.println(Arrays.toString(arr));

    int len = arr.length;
    for (int i = 0; i < len / 2; i++) {
      // swap edges
      String t = arr[i];
      arr[i] = arr[len - i - 1];
      arr[len - i - 1] = t;
    }

    System.out.println(Arrays.toString(arr));
  }
}
