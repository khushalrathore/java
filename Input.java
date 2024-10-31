import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter your name : ");
            String f_name = sc.nextLine();
            System.out.println("Hi, "+f_name);
            System.out.print("Enter your Year OF Birth : ");
            int num = Integer.parseInt(sc.nextLine());
            System.out.println("You're "+(2024-num)+" years old.");
        }
    }
}
