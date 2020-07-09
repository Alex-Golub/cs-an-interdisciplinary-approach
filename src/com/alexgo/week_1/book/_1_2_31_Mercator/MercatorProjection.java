package com.alexgo.week_1.book._1_2_31_Mercator;

/**
 * 1.2.31 Mercator projection.
 *  The Mercator projection is a conformal (angle preserving) projection that maps latitude
 *  and longitude to rectangular coordinates (x, y).
 *
 *  It is widely used—for example, in nautical charts and in the maps that
 *  you print from the web.
 *
 *  Write a program that takes and the latitude and longitude of
 *  a point from the command line and prints its projection.
 *
 * Created by ag on 09-Jul-20 12:21 PM
 */
class MercatorProjection {
  public static void main(String[] args) {

    double centerLongitude = Double.parseDouble(args[0]);  // λ0
    double latitude = Double.parseDouble(args[1]);  // φ
    double longitude = Double.parseDouble(args[2]); // λ

    double x = longitude - centerLongitude;
    double y = Math.log((1 + Math.sin(latitude)) / (1 - Math.sin(latitude))) / 2;

    System.out.printf("λ = %.2f%nλ0 = %.2f%nφ = %.2f%nProjection = (%.2f, %.2f)%n",
            longitude, centerLongitude, latitude, x, y);


  }
}
