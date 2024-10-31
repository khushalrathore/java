package Exercises;

import java.util.Scanner;

public class Recursion {
  public static int fact(int num, int result) {
    if (num < 2) {
      return result;
    }
    return fact(num - 1, result * num);
  }

  public static void main(String[] args) {

    try (Scanner sc = new Scanner(System.in)) {
      int num = sc.nextInt();
      int result = fact(num, 1);
      System.out.println("Factorial of " + num + " is: " + result);
    }
  }
}
