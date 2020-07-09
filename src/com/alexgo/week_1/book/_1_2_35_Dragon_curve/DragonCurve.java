package com.alexgo.week_1.book._1_2_35_Dragon_curve;

/**
 * 1.2.35 Dragon curves.
 *  Write a program to print the instructions for drawing the
 *  dragon curves of order 0 through 5.
 *
 *  The instructions are strings of F, L, and R characters,
 *  where F means “draw line while moving 1 unit forward,”
 *  L means “turn left,” and R means “turn right.”
 *  A dragon curve of order n is formed when you fold a strip
 *  of paper in half n times, then unfold to right angles.
 *
 * Created by ag on 09-Jul-20 1:26 PM
 */
class DragonCurve {
  public static void main(String[] args) {

    String stepZero = "F"; // F

    String stepOneL = stepZero + "L" + stepZero; // FLF
    String stepOneR = stepZero + "R" + stepZero; // FRF

    String stepTwoL = stepOneL + "L" + stepOneR; // FLF L FRF
    String stepTwoR = stepOneL + "R" + stepOneR; // FLF R FRF

    String stepThreeL = stepTwoL + "L" + stepTwoR; // FLFLFRF L FLFRFRF
    String stepThreeR = stepTwoL + "R" + stepTwoR; // FLFLFRF R FLFRFRF

    String stepFourL = stepThreeL + "L" +  stepThreeR; // FLFLFRFLFLFRFRF L FLFLFRFRFLFRFRF
    String stepFourR = stepThreeL + "R" +  stepThreeR; // FLFLFRFLFLFRFRF R FLFLFRFRFLFRFRF

    String stepFiveL = stepFourL + "L" +  stepFourR;
    String stepFiveR = stepFourL + "R" +  stepFourR;

    System.out.println(stepZero);
    System.out.println(stepOneL);
    System.out.println(stepTwoL);
    System.out.println(stepThreeL);
    System.out.println(stepFourL);
    System.out.println(stepFiveL);
  }
}
