package com.alexgo.week_2.web_exercises;

/**
 * 57. Muay Thai kickboxing.
 * Write a program that reads in the weight of a Muay Thai kickboxer (in pounds)
 * as a command-line argument and prints their weight class.
 * Use a switch statement.
 * <p>
 * Created by ag on 19-Oct-20 3:33 PM
 */
class Ex57_Kickboxing {
  public static void main(String[] args) {
    int w = Integer.parseInt(args[0]);

    switch (w % 100) {
      case 0: case 1: case 2: case 3: case 4: case 5:
      case 6: case 7: case 8: case 9: case 10: case 11:
        System.out.println("Flyweight");
        break;

      case 12: case 13: case 14:
        System.out.println("Super flyweight");
        break;

      case 15: case 16: case 17:
        System.out.println("Bantamweight");
        break;

      // ... TODO

    }
  }
}
