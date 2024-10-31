
public class Arrays2D {
    public static void main(String[] args) {

            if (args.length < 2) {
                System.out.println("Please provide rows, columns, and enough matrix elements.");
                return;
            }

            final int rows = Integer.parseInt(args[0]);
            final int cols = Integer.parseInt(args[1]) ;

            if (args.length < 2 + rows * cols) {
              System.out.println("Insufficient matrix elements provided.");
              return;
          }

            int[][] matrix = new int[rows][cols];
            int argIndex = 2;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(args[argIndex++]);
                }
            }
            
            System.out.println("The matrix is:");
            for (int[] row : matrix) {
                for (int elem : row) {
                    System.out.print(elem + " ");
                }
                System.out.println();
            }

    }
}

//input -> java Arrays2D.java 3 3 1 2 3 4 5 6 7 8 9 0
/* 

output -> The matrix is:
1 2 3 
4 5 6 
7 8 9 

*/