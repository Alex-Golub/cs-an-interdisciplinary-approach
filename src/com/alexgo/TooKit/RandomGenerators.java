package com.alexgo.TooKit;

import edu.princeton.cs.algs4.Out;

import java.util.Random;

import static com.alexgo.TooKit.StringProcessing.alphabet;

/**
 * Utility class for various random generators
 *
 * Created by ag on 31-Aug-20 8:50 PM
 */
public class RandomGenerators {

  /**
   * Generate random lowercase string of length n
   * with random spaces
   *
   * @param n length of random string, if <= 0 return empty string
   * @param spaces whether or not to generate string with white spaces
   * @return random characters string
   */
  public static String randomString(int n, boolean spaces) {
    if (n <= 0) return "";

    StringBuilder seq = new StringBuilder(n);
    String alpha = alphabet(true) + (spaces ? " " : "");
    Random rnd = new Random();

    for (int i = 0, bound = alpha.length(); i < n; i++)
      seq.append(alpha.charAt(rnd.nextInt(bound)));

    return seq.toString();
  }

  /**
   * Generate n number of txt files
   * Each file contain m lowercase alphabetic strings each of length sLen
   *
   * @param n number of txt files to create (no more then 5)
   * @param sLen each string length
   * @param m number of total strings in each file
   */
  public static void txtRandomString(int n, int sLen, int m) {
    if (n <= 0 || sLen <= 0 || m <= 0) return;
    if (n > 5) n = 5;

    for (int i = 1; i <= n; i++) {
      Out out = new Out("rnd-strings-" + i + ".txt");
      for (int j = 0; j < m; j++)
        out.println(randomString(sLen, true));
    }
  }
}
