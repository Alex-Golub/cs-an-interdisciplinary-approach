package com.alexgo.week_5.book;

import edu.princeton.cs.algs4.StdOut;

/**
 * 2.1.23 Develop a version of getCoupon() that better models the situation when
 * one of the coupons is rare: choose one of the n values at random, return that value
 * with probability 1 /(1,000n), and return all other values with equal probability.
 *
 * Extra credit : How does this change affect the expected number of coupons that need
 * to be collected in the coupon collector problem?
 *
 * Created by ag on 05-Aug-20 11:03 AM
 */
class Ex23_Rare_Coupon {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int count = collectCoupons(n);
    StdOut.printf(
            "To get all %d coupons (one is rare)\n" +
            "You should collect total of %,d coupons.\n" +
            "Good Luck!", n, count);
  }

  private static int collectCoupons(int n) {
    boolean[] isCollected = new boolean[n];
    int count = 0, distinct = 0;
    int rare = (int) (Math.random() * n);  // choose random rare coupon
    while (distinct < n) {
      int r = getCoupon(n, rare);
      count++;

      if (!isCollected[r])  // new coupon to collection
        distinct++;

      isCollected[r] = true;
    }

    return count; // total # of coupons collected
  }

  private static int getCoupon(int n, int rareCoupon) {
    double p = Math.random();
    if (p < 1.0 / (1000 * n)) return rareCoupon;

    if (p < 0.5) return (int) (Math.random() * rareCoupon);                               // [0, rare)
    else         return (rareCoupon + 1) + (int) (Math.random() * (n - rareCoupon - 1));  // [rare + 1, n)

  }
}
