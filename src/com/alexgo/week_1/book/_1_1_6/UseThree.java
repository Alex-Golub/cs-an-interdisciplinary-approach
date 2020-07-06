package com.alexgo.week_1.book._1_1_6;

/**
 * 1.1.6
 * Modify UseArgument.java to make a program UseThree.java that takes
 * three names as command-line arguments and prints a proper sentence with the
 * names in the reverse of the order given, so that, for example,
 * java UseThree Alice Bob Carol
 * prints Hi Carol, Bob, and Alice.
 *
 * javac UseThree.java
 * java UseThree Alice Bob Carol
 *
 * Created by ag on 06-Jul-20 4:27 PM
 */
class UseThree {
  public static void main(String[] args) {
    System.out.println("Hi " + args[2] + ", " + args[1] + ", and " + args[0] + ".");
  }
}
