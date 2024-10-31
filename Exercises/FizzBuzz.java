package Exercises;
import java.util.Scanner;

public class FizzBuzz {
    public static void fun(){
        Scanner sc = new Scanner(System.in);
        System.out.print("range [1, ");
        int range = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= range; ++i) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        sc.close();
    }

    public static void main(String[] args) {
        fun();
    }
}
