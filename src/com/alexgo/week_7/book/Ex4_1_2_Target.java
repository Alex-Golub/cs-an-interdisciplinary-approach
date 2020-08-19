package com.alexgo.week_7.book;

import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

/**
 * 4.1.2 Modify ThreeSum to take an integer command-line argument target and
 * find a triple of numbers on standard input whose sum is closest to target.
 *
 * Created by ag on 17-Aug-20 8:38 PM
 */
class Ex4_1_2_Target {
  public static void main(String[] args) {
   int target = Integer.parseInt(args[0]);
   int[] a = StdIn.readAllInts();
   int[] triplet = countTriplets(a, target);

   if (triplet != null) System.out.println(Arrays.toString(triplet));
   else                 System.out.println("There is no such triplet that sums to " + target);
  }

  public static int[] countTriplets(int[] a, int target) {
    int n = a.length;
    if (n < 3) return null;
    int[] triplet = new int[3];
    int closestSoFar = a[0] + a[1] + a[2];

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        for (int k = j + 1; k < n; k++) {
          int current = target - (a[i] + a[j] + a[k]);
          if (Math.abs(current) < Math.abs(closestSoFar)) {
            closestSoFar = current;
            triplet[0] = a[i];
            triplet[1] = a[j];
            triplet[2] = a[k];
          }
        }
      }
    }

    return triplet;
  }
}
