package com.alexgo.week_1.book._1_2_34_Three_sort;

/**
 * 1.2.34 Three-sort.
 *  Write a program that takes three integer command-line arguments and prints them in ascending order.
 *
 * Created by ag on 09-Jul-20 1:04 PM
 */
class ThreeSort {
  public static void main(String[] args) {
    int n1 = Integer.parseInt(args[0]);
    int n2 = Integer.parseInt(args[1]);
    int n3 = Integer.parseInt(args[2]);

    int max = Math.max(n1, Math.max(n2, n3));
    int min = Math.min(n1, Math.min(n2, n3));
    int middle = n1 + n2 + n3 - min - max;

    System.out.println(min + " <= " + middle + " <= " + max);

    test();

  }

  private static void test() {
    System.out.println();

    for (int i = 0; i <= 10; i++) {
      int n1 = (int) (Math.random() * 20);
      int n2 = (int) (Math.random() * 20);
      int n3 = (int) (Math.random() * 20);
      System.out.println(n1 + " " + n2 + " " + n3);

      int max = Math.max(n1, Math.max(n2, n3));
      int min = Math.min(n1, Math.min(n2, n3));
      int middle = n1 + n2 + n3 - min - max;

      System.out.println(min + " <= " + middle + " <= " + max + "\n");
    }
  }
}
