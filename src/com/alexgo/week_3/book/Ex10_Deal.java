package com.alexgo.week_3.book;

/**
 * 1.4.10 Write a program Deal that takes an integer command-line argument n and
 * prints n poker hands (five cards each) from a shuffled deck, separated by blank lines.
 *
 * javac Ex_10_Deal.class
 *
 * java Ex_10_Deal 5
 * J♠ 6♥ 4♠ K♠ K♥
 * Q♣ K♦ Q♥ 2♦ 2♠
 * Q♦ 6♦ 7♥ 9♣ J♦
 * A♣ 5♣ 5♦ K♣ 4♦
 * 10♣ 8♦ 9♥ 5♠ 3♣
 *
 * java Ex_10_Deal 3
 * Q♠ 4♦ 5♥ 10♥ 4♠
 * 9♠ 3♦ 6♦ K♠ 8♦
 * J♠ 10♦ K♣ 9♦ 4♣
 *
 * Created by ag on 23-Jul-20 4:23 PM
 */
public class Ex10_Deal {
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]); // # of poker hands

    final int MAX_POKER_HANDS = 10;
    n = n < 1 ? 1 : Math.min(n, MAX_POKER_HANDS); // max # of poker hands is 10, min is 1

    String[] deck = createDeck();
//    printDeck(deck);

    shuffle(deck);
//    System.out.println("\nShuffled deck:");
//    printDeck(deck);

//    System.out.println("\n" + n + " Poker hands drawn:");
    dealPokerHands(deck, n);

  }

  private static void dealPokerHands(String[] deck, int n) {
    final int POKER_HAND = 5;
      for (int i = 0; n > 0; i += POKER_HAND, n--)
        System.out.println(
                deck[i] + " " + deck[i + 1] + " " +
                deck[i + 2] + " " + deck[i + 3] + " " + deck[i + 4]
        );
  }

  private static void printDeck(String[] deck) {
    final int PER_ROW = 13;
    for (int i = 0; i < deck.length; i++) {
      System.out.print(deck[i] + "\t");

      if ((i + 1) % PER_ROW == 0)
        System.out.println();
    }
  }

  private static void shuffle(String[] deck) {
    int n = deck.length;

    for (int i = 0; i < n; i++) {
      // pick random card
      int r = i + (int) (Math.random() * (n - i));

      // swap picked card with i-th card
      String t = deck[i];
      deck[i] = deck[r];
      deck[r] = t;
    }
  }

  private static String[] createDeck() {
    String[] SUITS = {"♠", "♥", "♦", "♣"};
    String[] RANKS = {"2" ,"3" ,"4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    String[] deck = new String[SUITS.length * RANKS.length];

    for (int i = 0; i < SUITS.length; i++)
      for (int j = 0; j < RANKS.length; j++)
        deck[RANKS.length * i + j] = RANKS[j] + SUITS[i];

    return deck;
  }
}
