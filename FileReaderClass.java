import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderClass {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      String name = sc.nextLine();
      try (FileReader fReader = new FileReader(name)) {
        int data = fReader.read();
        while (data != -1) {
          System.out.print((char) data);
          data = fReader.read();
        }
      } catch (IOException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
