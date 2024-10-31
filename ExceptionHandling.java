public class ExceptionHandling {
    public static void main(String[] args) {
        final int[] arr = new int[10];
        arr[420 % 69] = 1;
        try {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
            System.out.println(arr[9001]);
        } catch (Exception e) {
            System.out.println("Error: Attempted to access an invalid array index.");
        } finally {
            System.out.println("--- Program Terminated ---");
        }
    }
}
