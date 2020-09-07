package com.alexgo.TooKit;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * FIXME
 * Created by ag on 26-Aug-20 9:19 PM
 */
public class StockQuota {
  public static void main(String[] args) {
    String symbol = args[0];
    double price = priceOf(symbol);
    StdOut.println(price);
  }

  public static double priceOf(String symbol) {
    String html = readHTML(symbol);
    System.out.println(html);
    int p = html.indexOf("<bg-quote class=\"value negative\"");
    int from = html.indexOf(">", p);
    int to = html.indexOf("<", from);
    String price = html.substring(from + 1, to);

    return Double.parseDouble(price);
  }

  private static String readHTML(String symbol) {
    In page = new In("https://www.marketwatch.com/investing/stock/" + symbol);
    return page.readAll();
  }
}
