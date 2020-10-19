package com.alexgo.week_2.web_exercises;

/**
 * Prints out n in binary, by casting powers of 2 from n
 *
 * Created by ag on 28-Sep-20 5:26 PM 
 */
class Ex37_Binary {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);

    // Find largest power of 2 that <= n
    int power = 1;
    while (power <= n / 2)
      power *= 2;

    while (power > 0) {
      if (power > n) {
        System.out.print(0);
      } else {
        // power of 2 can be cast out from n
        System.out.print(1);
        n -= power;
      }

      power /= 2;
    }
  }
}
