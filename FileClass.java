import java.io.File;
import java.util.Scanner;

public class FileClass {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter file name: ");
      String fileName = sc.nextLine();
      File file = new File(fileName);

      if (file.exists()) {
        System.out.println("File found at: " + file.getAbsolutePath());
        file.delete();
      } else {
        System.out.println("File not found.");
        file.createNewFile();
      }
    } catch (Exception e) {
      System.out.printf("An exception occurred: %s%n", e.getMessage());
    } finally {
      System.out.println("--- Program Terminated ---");
    }
  }
}
