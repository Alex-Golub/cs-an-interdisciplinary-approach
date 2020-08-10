package com.alexgo.TooKit;

import edu.princeton.cs.algs4.StdStats;

/**
 * Created by ag on 10-Aug-20 12:23 PM
 */
public class Scale {

  /**
   * Linear rescale of values in a to range [ymin, ymax]
   * Steps to rescale value m to range:
   * 1. m |-> m - rmin
   *    mapping m to [0, rmax - rmin]
   * 2. m |-> (m - rmin) / (rmax - rmin)
   *    maps m to [0, 1] where m = rmin mapped to 0 and m = rmax mapped to 1
   * 3. multiplying step 2 by (ymax - ymin) mapping m |-> [0, ymax - ymin]
   * 4. adding ymin from step 3 maps to desired range i.e. m |-> [ymin, ymax]
   *
   * @param ymin minimum of the range of desired target scaling
   * @param ymax maximum of the range of desired target scaling
   * @param a measurements
   * @return scaled array with values in range [ymin, ymax]
   */
  public static double[] linearScale(double ymin, double ymax, double[] a) {
   double rmin = StdStats.min(a);
   double rmax = StdStats.max(a);

   double[] scaled = new double[a.length];
   for (int i = 0; i < a.length; i++)
     scaled[i] = ((a[i] - rmin) / (rmax - rmin)) * (ymax - ymin) + ymin;

   return scaled;
  }

  /**
   * Validate if array is not null to prevent NPE
   *
   * @param a argument array to check
   * @throws IllegalArgumentException if array is null
   */
  private static void validateArray(double[] a) {
    if (a == null) throw new IllegalArgumentException("Array is null");
  }
}
