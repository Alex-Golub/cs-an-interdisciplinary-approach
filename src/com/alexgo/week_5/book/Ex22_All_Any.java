package com.alexgo.week_5.book;

/**
 * 2.1.22 Write a static method any() that takes a boolean array as its argument
 * and returns true if any of the elements in the array is true, and false otherwise.
 *
 * Write a static method all() that takes an array of boolean values as its argument
 * and returns true if all of the elements in the array are true, and false otherwise.
 *
 * Created by ag on 04-Aug-20 2:25 PM
 */
class Ex22_All_Any {
  public static void main(String[] args) {
    boolean[] b = {true, true, false, false};
    System.out.println("any() => " + any(b));
    System.out.println("all() => " + all(b));

    b = new boolean[] {false};
    System.out.println("\nany() => " + any(b));
    System.out.println("all() => " + all(b));

    b = new boolean[] {true, true};
    System.out.println("\nany() => " + any(b));
    System.out.println("all() => " + all(b));
  }

  // returns true if ANY of the elements in the array is true
  public static boolean any(boolean[] a) {
    if (a == null) return false;

    for (boolean b : a)
      if (b) return true;

    return false;
  }

  // returns true if ALL of the elements in the array are true
  public static boolean all(boolean[] a) {
    if (a == null) return false;

    for (boolean b : a)
      if (!b) return false;

    return true;
  }

}
