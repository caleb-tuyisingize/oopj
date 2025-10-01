import java.util.Scanner;
public class Calc{
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking two numbers from the user
        System.out.print("Enter first number (dividend): ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number (divisor): ");
        double num2 = input.nextDouble();

        // Branching using if-else
        if (num2 == 0) {
            System.out.println("Error: Division by ZERO is not allowed!");
        } else if (num1 == 0) {
            System.out.println("Result is 0 (since 0 divided by any number is 0)");
        } else {
            double result = num1 / num2;
            System.out.println("Result of division: " + result);
        }

        input.close();
    }
}