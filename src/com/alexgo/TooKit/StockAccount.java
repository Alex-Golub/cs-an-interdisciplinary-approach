package com.alexgo.TooKit;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * This class for processing stock accounts illustrates typical
 * usage of object-oriented programming for commercial data processing.
 *
 * file structure should be:
 *        customer-name
 *        cash-balance
 *        number-of-stocks
 *        share-count stock-symbol
 *
 * e.g.
 *        Humble, Freddy
 *        10.24
 *        4
 *        100 ADBE
 *        25  GOOG
 *        97  IBM
 *        250 MSFT
 *
 * Created by ag on 03-Sep-20 4:20 PM
 */
public class StockAccount {
  private final String name;
  private double cash;
  private int n;
  private int[] shares;
  private String[] stocks;

  public StockAccount(String filename) { // Build data structure from specified file.
    In in = new In(filename);
    name = in.readLine();
    cash = in.readDouble();
    n = in.readInt();
    shares = new int[n];
    stocks = new String[n];
    for (int i = 0; i < n; i++) { // Process one stock.
      shares[i] = in.readInt();
      stocks[i] = in.readString();
    }
  }

  public void printReport() {
    StdOut.println(name);
    double total = cash;

    for (int i = 0; i < n; i++) {
      int amount = shares[i];
      double price = StockQuota.priceOf(stocks[i]); // pull current stock price from web FIXME
      total += amount * price;
      StdOut.printf("%4d %5s ", amount, stocks[i]);
      StdOut.printf("%9.2f %11.2f\n", price, amount * price);
    }

    StdOut.printf("%21s %10.2f\n", "Cash: ", cash);
    StdOut.printf("%21s %10.2f\n", "Total:", total);
  }

  public static void main(String[] args) {
    StockAccount account = new StockAccount(args[0]);
    account.printReport();
  }
}
