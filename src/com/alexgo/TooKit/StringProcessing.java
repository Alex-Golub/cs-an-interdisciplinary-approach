package com.alexgo.TooKit;

/**
 * Created by ag on 28-Aug-20 1:19 PM
 */
public class StringProcessing {

  /**
   * Method that takes a string as an argument and returns a string that contains
   * the same sequence of characters as the argument string but in reverse order.
   *
   * @param s source string
   * @return input string s reversed
   */
  public static String reverse(String s) {
    if (s == null || s.isBlank()) return "";

    int n = s.length();
    char[] chars = s.toCharArray();
    for (int i = 0; i < n / 2; i++)
      swap(chars, i, n - i - 1);

    return new String(chars);
  }

  private static void swap(char[] c, int i, int j) {
    char temp = c[i];
    c[i] = c[j];
    c[j] = temp;
  }

  /**
   * DNA is valid if and only if it is composed entirely of the characters A, T, C, and G.
   * <br>
   * Not case-sensitive.
   *
   * @param dna to check
   * @return whether dna is valid
   */
  public static boolean isValidDNA(String dna) {
    String valid = "atcg";
    for (int i = 0; i < dna.length(); i++)
      if (!valid.contains(dna.substring(i, i + 1).toLowerCase()))
        return false;

    return true;
  }

  /**
   * A string s is a circular shift of a string t if it matches when the characters of
   * one string are circularly shifted by some number of positions.
   *
   * @param s first string
   * @param t second string
   * @return whether two given strings s and t are circular shifts of one another
   */
  public static boolean isCircularShift(String s, String t) {
    return s.concat(s).contains(t) || t.concat(t).contains(s);
  }

  /**
   * Takes a domain name as its argument and returns the reverse
   * domain name (reverse the order of the strings between periods).
   *
   * @param domain to reverse
   * @return reversed domain order
   */
  public static String reverseDomain(String domain) {
    if (domain == null || domain.isBlank()) return "";

    String[] split = domain.split("\\.");
    StringBuilder reverse = new StringBuilder();

    int n = split.length - 1;
    for (int i = n; i > 0; i--)
      reverse.append(split[i])
             .append(".");

    return reverse.append(split[0]).toString();
  }

  /**
   * Check if DNA sequence is a potential gene
   *
   * @param dna to check
   * @return if potential gene
   */
  public static boolean isPotentialGene(String dna) {
    if (dna == null) return false;

    // Length is a multiple of 3.
    if (dna.length() % 3 != 0) return false;

    // Starts with start codon.
    if (!dna.startsWith("ATG")) return false;

    // No intervening stop codons.
    for (int i = 3; i < dna.length() - 3; i++) {
      if (i % 3 == 0) {
        String codon = dna.substring(i, i + 3);
        if (codon.equals("TAA")) return false;
        if (codon.equals("TAG")) return false;
        if (codon.equals("TGA")) return false;
      }
    }

    // Ends with a stop codon.
    if (dna.endsWith("TAA")) return true;
    if (dna.endsWith("TAG")) return true;
    if (dna.endsWith("TGA")) return true;

    return false;
  }

  /**
   * Search and print all genes found of length n from within dna
   *
   * @param dna source dna sequence
   * @param n length of sub-genes required. Values must be multiples of 3
   */
  public static void potentialGenes(String dna, int n) {
    if (n < 6 || n % 3 != 0) return;

    for (int i = 0; i < dna.length() - n; i++) {
      String part = dna.substring(i, i + n);
      if (isPotentialGene(part)) {
        System.out.println(part);
        i += n - 1; // ending codons can't be in the middle of gene so jump to next sequence n steps
      }
    }
  }

  /**
   * Print to StdOut all lines of input string that are not blank
   * i.e. lines that contain only whitespaces (\t,\s) are omitted.
   *
   * @param s input string
   */
  public static void filterWhitespace(String s) {
    if (s == null) return;

    for (String line : s.split("\n"))
      if (!line.isBlank())
        System.out.println(line);
  }

  /**
   * Utility method to generate English alphabet sequence
   *
   * @param lowerCase pass true if required sequence to be lowercase
   * @return English alphabet sequence in choice case
   */
  public static String alphabet(boolean lowerCase) {
    StringBuilder alpha = new StringBuilder(26);
    char c = lowerCase ? 'a' : 'A';

    for (int i = 0; i < 26; i++)
      alpha.append((char) (i + c));

    return alpha.toString();
  }

  /**
   * Prints all substrings of a given string that start with the first,
   * end with the second.
   *
   * @param in input string
   * @param first target substring prefix
   * @param second target substring suffix
   */
  public static void allSubstrings(String in, String first, String second) {
    int idx1 = in.indexOf(first);
    int idx2 = in.lastIndexOf(second);

    // left to right
    while (idx1 != -1 && idx2 != -1 && idx1 < idx2) {
      System.out.println(in.substring(idx1, idx2 + second.length()));
      idx2 = in.lastIndexOf(second, idx2 - 1);
    }

    idx1 = in.indexOf(first, idx1 + 1);
    idx2 = in.lastIndexOf(second);

    // right to left
    while (idx1 != -1 && idx2 != -1 && idx1 < idx2) {
      System.out.println(in.substring(idx1, idx2 + second.length()));
      idx1 = in.indexOf(first, idx1 + 1);
    }
  }

  /**
   *
   * @param words array of words to join
   * @param delimiter words concatenated to each other using delimiter
   * @return String with delimiters, returns null if words is null or delimiter is null
   * or words is empty
   */
  public static String merge(String[] words, String delimiter) {
    if (words == null || delimiter == null || words.length == 0) return "";

    StringBuilder result = new StringBuilder();
    int n = words.length;
    for (int i = 0; i < n - 1; i++)
      result.append(words[i]).append(delimiter);

    return result.append(words[n - 1]).toString();

  }

}
