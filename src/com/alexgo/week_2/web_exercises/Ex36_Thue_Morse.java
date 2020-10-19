package com.alexgo.week_2.web_exercises;

/**
 * 36. Thue–Morse sequence.
 * Write a program ThueMorse.java that reads in a command line integer n
 * and prints the Thue–Morse sequence of order n.
 * The first few strings are 0, 01, 0110, 01101001.
 * Each successive string is obtained by flipping all of the bits of the previous
 * string and concatenating the result to the end of the previous string.
 *
 * The sequence has many amazing properties.
 * For example,
 * it is a binary sequence that is cube-free:
 * it does not contain 000, 111, 010101, or sss where s is any string.
 * It is self-similar: if you delete every other bit, you get another
 * Thue–Morse sequence.
 *
 * It arises in diverse areas of mathematics as well as chess, graphic design,
 * weaving patterns, and music composition.
 *
 * Created by ag on 28-Sep-20 4:50 PM 
 */
class Ex36_Thue_Morse {
  public static void main(String[] args) {
   int n = Integer.parseInt(args[0]);

//   String seq = "0";
//   for (int i = 0; i < n; i++) {
//     System.out.println(seq);
//     StringBuilder flipped = new StringBuilder(seq.length());
//     for (int j = 0; j < seq.length(); j++) {
//       if (seq.charAt(j) == '0') flipped.append("1");
//       else flipped.append("0");
//     }
//
//     seq += flipped.toString();
//   }

    String src = "0", flipped = "1";
    for (int i = 0; i < n; i++) {
      System.out.println(src);

      String t = src;
      String m = flipped;
      src     += m;
      flipped += t;
    }
  }
}
