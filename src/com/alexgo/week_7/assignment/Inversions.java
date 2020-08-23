package com.alexgo.week_7.assignment;

/**
 * 1. Inversions.
 * Suppose that a music site wants to compare your song preferences to those of a friend.
 * One approach is to have you and your friend each rank a set of n songs and count the number of pairs of songs (i, j)
 * for which you prefer i to j but your friend prefers j to i.
 * When the count is low, the preferences are similar.
 * More generally, given an array of integers, a pair of elements a[i] and a[j] are inverted if i < j and a[i] > a[j].
 * For example, the array a[] has 1 inversion and the array b[] has 4 inversions:
 * a[] : [0,1,2,3,5,4,6] => 1 inversion 5-4
 * b[] : [0,4,1,2,5,3,6] => 4 inversions 4-1 4-2 4-3 5-3
 *
 * NOTES: k = n(n-1)/2  => sorted DESC array i.e. reversed array
 *        k = 0         => sorted ASC array
 *
 * Execution:
 * java-introcs Inversions 10 0
 * 0 1 2 3 4 5 6 7 8 9
 *
 * java-introcs Inversions 10 45
 * 9 8 7 6 5 4 3 2 1 0
 *
 * java-introcs Inversions 10 5
 * 5 0 1 2 3 4 6 7 8 9
 *
 * java-introcs Inversions 10 45
 * java.lang.IllegalArgumentException: k > n(n-1)/2
 *
 * Created by ag on 19-Aug-20 7:39 PM
 */
public class Inversions {

  // Takes an integer n and a long k as command-line arguments,
  // and prints a permutation of length n with exactly k inversions.
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    long k = Long.parseLong(args[1]);
    print(generate(n, k));
  }

  // Return a permutation of length n with exactly k inversions.
  // method should take time proportional to n in the worst case.
  public static int[] generate(int n, long k) {
    if (n == 0 && k == 0)    return new int[0];
    if (k > n * (n - 1) / 2) throw new IllegalArgumentException("k > n(n-1)/2");

    int[] p = new int[n];

    // greedy approach to create k inversions
    int start = 0;
    int end = n - 1;
    int ele = n - 1;
    while (start != end) {
      if (k >= ele) { // put element n−i first in the permutation, so that it is inverted with n−i elements
        p[start] = ele;
        k -= ele; // remove n-i inversions from k
        start++;
      } else { // put it last in the permutation, so that it is inverted with 0 elements
        p[end] = ele;
        end--;
      }

      ele--;
    }

    return p;
  }

  // Return the number of inversions in the permutation a[].
  // should take time proportional to n^2 in the worst case.
  public static long count(int[] a) {
    long count = 0;
    for (int i = 0; i < a.length; i++)
      for (int j = i + 1; j < a.length; j++)
        count += a[i] > a[j] ? 1 : 0;

    return count;
  }

  private static void print(int[] a) {
    if (a == null || a.length == 0) return;

    for (int i = 0; i < a.length; i++) {
      System.out.print(a[i]);
      if (i + 1 < a.length) System.out.print(" ");
      else                  System.out.println();
    }
  }
}
