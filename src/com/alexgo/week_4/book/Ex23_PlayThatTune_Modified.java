package com.alexgo.week_4.book;

import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdIn;

/**
 * 1.5.23 Modify PlayThatTune to take additional command-line arguments that
 * control the volume (multiply each sample value by the volume) and the tempo
 * (multiply each note’s duration by the tempo).
 *
 * https://introcs.cs.princeton.edu/java/21function/elise.txt
 * https://introcs.cs.princeton.edu/java/21function/freebird.txt
 * https://introcs.cs.princeton.edu/java/21function/Ascale.txt
 * https://introcs.cs.princeton.edu/java/21function/National_Anthem.txt
 * https://introcs.cs.princeton.edu/java/21function/looney.txt
 * https://introcs.cs.princeton.edu/java/21function/StairwayToHeaven.txt
 * https://introcs.cs.princeton.edu/java/21function/entertainer.txt
 * https://introcs.cs.princeton.edu/java/21function/old-nassau.txt
 * https://introcs.cs.princeton.edu/java/21function/arabesque.txt
 * https://introcs.cs.princeton.edu/java/21function/firstcut.txt
 * https://introcs.cs.princeton.edu/java/21function/tomsdiner.txt
 *
 * Ex23_PlayThatTune_Modified volume speed
 *
 * Created by ag on 01-Aug-20 3:54 PM
 */
class Ex23_PlayThatTune_Modified {
  public static void main(String[] args) {
    double volume = Double.parseDouble(args[0]);
    double tempo = Double.parseDouble(args[1]);

    final int SAMPLING_RATE = 44100;
    final double NOTES = 12.0;
    final int CONCERT_A = 440;

    while (!StdIn.isEmpty()) { // Read and play one note.

      int pitch = StdIn.readInt();                   // read in the pitch, where 0 = Concert A (A4)
      double duration = StdIn.readDouble() * tempo;  // read in duration in seconds

      // build sine wave with desired frequency
      double hz = CONCERT_A * Math.pow(2, pitch / NOTES);
      int n = (int) (SAMPLING_RATE * duration);
      double[] a = new double[n + 1];
      for (int i = 0; i <= n; i++) {
        a[i] = Math.sin(2 * Math.PI * i * hz / SAMPLING_RATE) * volume;
      }

      StdAudio.play(a);
    }
  }
}
