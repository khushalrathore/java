package Exercises;

import java.util.Random;

public class Dice {
  public int roll() {
    Random n = new Random();
    return (n.nextInt(1, 7));
  }

  public static void main(String[] args) {
    Dice d1 = new Dice();
    System.out.printf("%d on Dice\n", d1.roll());
  }
}
