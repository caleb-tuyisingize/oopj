public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = {
            {10, 20, 30},
            {40, 50},
            {60, 70, 80, 90}

        };

        // Iterating through a 2D array
        System.out.println("Iterating through the 2D array:");
        // BY USING A FOR LOOP NOT FOR EACH
      for(int row=0; row < matrix.length; row++){
        for(int col = 0; col < matrix[row].length; col++){
            System.out.print(matrix[row][col] + " ");
        }
            System.out.println("\n--- --- ---");

      }
    }
}