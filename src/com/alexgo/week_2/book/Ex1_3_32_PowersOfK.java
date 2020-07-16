package com.alexgo.week_2.book;

/**
 * 1.3.32 Write a program PowersOfK that takes an integer command-line argument
 * k and prints all the positive powers of k in the Java long data type.
 * Note: The constant Long.MAX_VALUE is the value of the largest integer in long.
 *
 * javac Ex1_3_32_PowersOfK.class
 *
 * java Ex1_3_32_PowersOfK 0
 * 0^n = 0, for every integer value of n
 *
 * java Ex1_3_32_PowersOfK 1
 * 1^n or (-1)^n = 1, for every integer value of n
 *
 * java Ex1_3_32_PowersOfK -1
 * 1^n or (-1)^n = 1, for every integer value of n
 *
 * java Ex1_3_32_PowersOfK 12
 * 12^0 = 1
 * 12^1 = 12
 * 12^2 = 144
 * 12^3 = 1,728
 * 12^4 = 20,736
 * 12^5 = 248,832
 * 12^6 = 2,985,984
 * 12^7 = 35,831,808
 * 12^8 = 429,981,696
 * 12^9 = 5,159,780,352
 * 12^10 = 61,917,364,224
 * 12^11 = 743,008,370,688
 * 12^12 = 8,916,100,448,256
 * 12^13 = 106,993,205,379,072
 * 12^14 = 1,283,918,464,548,864
 * 12^15 = 15,407,021,574,586,368
 * 12^16 = 184,884,258,895,036,416
 * 12^17 = 2,218,611,106,740,436,992
 *
 * java Ex1_3_32_PowersOfK -90
 * -90^0 = 1
 * -90^1 = -90
 * -90^2 = 8,100
 * -90^3 = -729,000
 * -90^4 = 65,610,000
 * -90^5 = -5,904,900,000
 * -90^6 = 531,441,000,000
 * -90^7 = -47,829,690,000,000
 * -90^8 = 4,304,672,100,000,000
 * -90^9 = -387,420,489,000,000,000
 *
 * Created by ag on 16-Jul-20 1:42 PM
 */
class Ex1_3_32_PowersOfK {
  public static void main(String[] args) {
    int k = Integer.parseInt(args[0]);

    if (k == 0)
      System.out.println("0^n = 0, for every integer value of n");
    else
      if (k == 1 || k == -1)
      System.out.println("1^n or (-1)^n = 1, for every integer value of n");
    else
      for (int power = 0; Math.pow(k, power) <= Long.MAX_VALUE; power++) {
//      System.out.println(k + "^" + power + " = " + (long) Math.pow(k, power));
        System.out.printf("%d^%d = %,d%n", k, power, (long) Math.pow(k, power));
      }
  }
}
