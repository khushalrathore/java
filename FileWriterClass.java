import Exercises.Recursion;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterClass {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter the file name: ");
      String fileName = sc.nextLine();

      try (FileWriter fileW = new FileWriter(fileName)) {
        long res = Recursion.fact(10, 1);
        fileW.write("10! = " + Long.toString(res));
        fileW.close();
      }

      System.out.println("Text written to the file successfully.");
    } catch (IOException e) {
      System.out.println("An error occurred: " + e.getMessage());
    }
  }
}
