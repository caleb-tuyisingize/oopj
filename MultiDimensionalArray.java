public class MultiDimensionalArray {
    public static void main(String[] args) {
        // Declare and initialize a 2D array
        int[][] matrix = new int[2][3];
        matrix[0][0] = 10;
        matrix[0][1] = 20;
        matrix[0][2] = 30;
        matrix[1][0] = 40;
        matrix[1][1] = 50;
        matrix[1][2] = 60;

        // Iterating through a 2D array
        System.out.println("Iterating through the 2D array:");
      for(int[] row : matrix){
        for(int col : row){
            System.out.print("| " +col+" |");
        }
            System.out.println("\n--- --- ---");

      }
    }
}