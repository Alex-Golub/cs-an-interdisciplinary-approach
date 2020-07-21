package com.alexgo.week_2.web_exercises;

/**
 * 15. Boys and girls.
 * Repeat the previous question, but assume the couple keeps having children until they have another
 * child which is of the same sex as the first child.
 * How does your answer change if p is different from 1/2?
 *
 * Created by ag on 19-Jul-20 4:30 PM
 */
class Ex15_Boys_and_girls { // FIXME
  public static void main(String[] args) {
    int trials = Integer.parseInt(args[0]);

    if (trials <= 0) {
      System.out.println("# of trials should be grater then zero, existing...");
      return;
    }

    int totalNumberOfChildren = 0;

    int twoFreq = 0;
    int threeFreq = 0;
    int fourFreq = 0;
    int fiveFreq = 0;
    int sixAndMoreFreq = 0;

    for (int t = 0; t < trials; t++) {

      boolean isBoy = false, isGirl = false;
      int childrenPerTrial = 0;
      double p = Math.random();
      double firstChild = p;

      do {
        if (p < 0.5) {
          isBoy = true;
        } else {
          isGirl = true;
        }

        totalNumberOfChildren++;
        childrenPerTrial++;

        p = Math.random();

      } while (!isBoy || !isGirl);

      /* Determine number of children frequency */
      if      (childrenPerTrial == 2) twoFreq++;
      else if (childrenPerTrial == 3) threeFreq++;
      else if (childrenPerTrial == 4) fourFreq++;
      else if (childrenPerTrial == 5) fiveFreq++;
      else                            sixAndMoreFreq++;

    }

    System.out.println("Two children frequency " +   100 * twoFreq / totalNumberOfChildren + "%");
    System.out.println("Three children frequency " + 100 * threeFreq / totalNumberOfChildren + "%");
    System.out.println("Four children frequency " +  100 * fourFreq / totalNumberOfChildren + "%");
    System.out.println("Five children frequency " +  100 * fiveFreq / totalNumberOfChildren + "%");
    System.out.println("Six and more children frequency " + 100 * sixAndMoreFreq / totalNumberOfChildren + "%");

    System.out.println("\nAverage # of children per couple: " + totalNumberOfChildren / trials);
    System.out.println("Total number of children: " + totalNumberOfChildren);
  }
}
