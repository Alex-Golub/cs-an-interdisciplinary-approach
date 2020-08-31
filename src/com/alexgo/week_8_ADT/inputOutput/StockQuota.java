package com.alexgo.week_8_ADT.inputOutput;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * Created by ag on 26-Aug-20 9:19 PM
 */
class StockQuota {
  public static void main(String[] args) {
    String symbol = args[0];
    double price = priceOf(symbol);
    StdOut.println(price);
  }

  private static double priceOf(String symbol) {
    String html = readHTML(symbol);
    int p = html.indexOf("Trsdu(0.3s) Fw(b) Fz(36px) Mb(-4px) D(ib)");
    int from = html.indexOf(">", p);
    int to = html.indexOf("</span>", from);
    String price = html.substring(from + 1, to);
    return Double.parseDouble(price);
  }

  private static String readHTML(String symbol) {
    In page = new In("https://finance.yahoo.com/quote/AMD/?p=" + symbol);
    return page.readAll();
  }
}
