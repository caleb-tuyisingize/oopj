import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number to generate its Factorial: ");
        int number = scanner.nextInt();
        
        // Generate multiplication table
        System.out.println("Factorial of " + number + ":");
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact *=i;
            System.out.print(" ==> "+i);
        }
            System.out.print(" => "+fact);

        scanner.close();
    }
}
