import java.util.Scanner;
public class Functions {
    public static long factorial(int num){
        long temp = 1;
        for(int i=1;i<=num;++i){
            temp*=i;
        }
        return temp;
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("x  = ");
            var number = Integer.parseInt(sc.nextLine());
            System.out.println("x! = "+ factorial(number));
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("---EXIT---");
        }
    }
}
