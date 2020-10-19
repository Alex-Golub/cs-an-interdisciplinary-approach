package com.alexgo.week_2.web_exercises;

/**
 * 31. Modify Sqrt.java so that it reports an error if the user enters
 * a negative number and works properly if the user enters zero.
 *
 * 32. What happens if we initialize t to -x instead of x in program Sqrt.java?
 * === ANS ===
 * Infinite loop.
 * The value of t is the sqrt of n but with negative sign.
 *
 * Created by ag on 28-Sep-20 3:42 PM 
 */
class Ex31_Sqrt_Safe {
  public static void main(String[] args) {
    double c = Double.parseDouble(args[0]);

    if (c < 0) {
      System.out.println("Argument is negative");
    } else if (c == 0) {
      System.out.println("sqrt(0) == 0");
    } else {
      double epsilon = 1.0e-15;
      double t = -c;
      while (Math.abs(t - c / t) > epsilon * t) {
        t = (c / t + t) / 2.0;
//        System.out.println(t);
      }

      System.out.println(t);
    }
  }
}
