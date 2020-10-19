package com.alexgo.week_2.web_exercises;

/**
 * 13. Boys and girls. 
 * A couple beginning a family decides to keep having children until they have at least
 * one of either sex.
 * Estimate the average number of children they will have via simulation. 
 * Also estimate the most common outcome (record the frequency counts for 2, 3, and 4 children, 
 * and also for 5 and above). 
 * Assume that the probability p of having a boy or girl is 1/2.
 *
 * javac Ex13_Boys_and_girls.class
 *
 * java Ex13_Boys_and_girls 1000000
 * Two children frequency 16%
 * Three children frequency 8%
 * Four children frequency 4%
 * Five children frequency 2%
 * Six and more children frequency 2%
 *
 * Average # of children per couple: 3
 * Total number of children: 3003532
 *
 * Created by ag on 19-Jul-20 3:35 PM
 */
class Ex13_Boys_and_girls {
  public static void main(String[] args) {
    int trials = Integer.parseInt(args[0]);

    int totalNumberOfChildren = 0;

    int twoFreq = 0;
    int threeFreq = 0;
    int fourFreq = 0;
    int fiveFreq = 0;
    int sixAndMoreFreq = 0;

    for (int t = 0; t < trials; t++) {
      boolean isBoy  = false;
      boolean isGirl = false;
      int childrenPerCouple = 0;

      do {
        if (Math.random() < 0.5) isBoy = true;
        else                     isGirl = true;

        totalNumberOfChildren++;
        childrenPerCouple++;

      } while (!isBoy || !isGirl);

      // Determine number of children frequency
      switch (childrenPerCouple) {
        case 2:  twoFreq++;        break;
        case 3:  threeFreq++;      break;
        case 4:  fourFreq++;       break;
        case 5:  fiveFreq++;       break;
        default: sixAndMoreFreq++; break;
      }
    }

    System.out.println("Two children \t\t" +   100 * twoFreq / totalNumberOfChildren + "%");
    System.out.println("Three children \t" + 100 * threeFreq / totalNumberOfChildren + "%");
    System.out.println("Four children \t" +  100 * fourFreq / totalNumberOfChildren + "%");
    System.out.println("Five children \t" +  100 * fiveFreq / totalNumberOfChildren + "%");
    System.out.println("Six and more children \t" + 100 * sixAndMoreFreq / totalNumberOfChildren + "%");

    System.out.println("\nAverage # of children per couple: " + totalNumberOfChildren / trials);
    System.out.println("Total number of children: " + totalNumberOfChildren);
  }
}
