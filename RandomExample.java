import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(1,7); //1 to (7-1)
        double y = r.nextDouble();// 0 to 1
        boolean z = r.nextBoolean();
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
