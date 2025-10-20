
public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array summation of two matrixes
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5,6}
            };
        int[][] matrixB = {
            {1, 4, 1},
            {1, 1,1}
            };

        // Iterating through a 2D array
        System.out.println("Iterating through the 2D array:");
        int matrixC[][];
        matrixC = new int[3][3];
        for(int row=0; row < matrixA.length; row++){
            for(int col = 0; col < matrixB[row].length; col++){
                matrixC[row][col] = 0;
                for(int finisher = 0; finisher < 3; finisher++){
                matrixC[row][col] = matrixA[row][col] * matrixB[row][col];
                }
            }
            System.out.println("\n- - -");

      }

      for(int k[] : matrixC){
        for(int y : k){
            System.out.print(y+ "");
        }
        System.out.println();
      }

        // System.out.println("Changed: ");

        // for(int row= matrix.length-1; row >= 0 ; row--){
        //     for(int col = 0; col < matrix[row].length; col++){
        //         matrix[row][col] = matrix[row][col] + 5;
        //         System.out.print(matrix[row][col] + " ");
        //     }
        //         System.out.println("\n--- --- ---");
        // }
     
    }
}