package com.alexgo.week_2.web_exercises;

/**
 * 24. Decimal expansion of rational numbers.
 * Given two integers p and q, the decimal expansion of p/q has an
 * infinitely repeating cycle.
 * For example, 1/33 = 0.03030303....
 * We use the notation 0.(03) to denote that 03 repeats indefinitely.
 * As another example, 8639/70000 = 0.1234(142857).
 * Write a program DecimalExpansion.java that reads in two command line
 * integers p and q and prints the decimal expansion of p/q using the above notation.
 *
 * Using Floyd's Cycle Detection algorithm.
 * number repeats indefinitely if 2 and 5 are not factors of divisor
 *
 * Created by ag on 21-Jul-20 4:44 PM
 */
class Ex24_Decimal_Expansion_Interview {
  public static void main(String[] args) {
    int p = Integer.parseInt(args[0]);
    int q = Integer.parseInt(args[1]);

    System.out.println(1.0 * p / q);
    String num = "" + (1.0 * p / q);
    boolean hasLoop = false;
    int len = num.length();
    int fast = num.indexOf(".") + 1;
    int slow = fast;

    // Loop detection
    while (fast < len && !hasLoop) {
      fast += 2;
      slow += 1;
      if (num.charAt(fast) == num.charAt(slow)) hasLoop = true;
    }
    System.out.println("Has loop?: " + hasLoop);

    // Loop starting point
    int start = num.indexOf(".") + 1;
    while (num.charAt(slow) != num.charAt(start)) {
      start += 1;
      slow += 1;
    }

    System.out.println("loop is: " + num.substring(start, slow));

    String compact = num.substring(0, start) + "(" + num.substring(start, slow) + ")";
    System.out.println(num + " = " + compact);
  }
}
