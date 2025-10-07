import java.util.Scanner;

public class AssignmentOnElearning {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of rows: ");
             int rows = input.nextInt();
        System.out.println("\nChoose a pattern (1-6):");
        System.out.println("1. Solid rectangle");
        System.out.println("2. Right-aligned hollow triangle");
        System.out.println("3. Inverted left-aligned triangle");
        System.out.println("4. Left-aligned triangle");
        System.out.println("5. Inverted right-aligned triangle");
        System.out.println("6. Right-aligned triangle");
        System.out.print("Enter your choice: ");
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= rows; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 2:
                for (int i = 1; i <= rows; i++) {
                    for (int j = rows; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        if (k == 1 || i == 2 || k == i)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println();
                }
                break;

            case 3:
                for (int i = rows; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                for (int i = 1; i <= rows; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 5:
                for (int i = rows; i >= 1; i--) {
                    for (int j = rows; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 6:
                for (int i = 1; i <= rows; i++) {
                    for (int j = rows; j > i; j--) {
                        System.out.print(" ");
                    }
                    for (int k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            default:
                System.out.println("Invalid choice! Please choose between 1 and 6.");
        }
	}

}
