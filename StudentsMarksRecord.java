
import java.util.Scanner;
public class StudentsMarksRecord {
    public static void main(String[] args) {


        while(true){
        Scanner input = new Scanner(System.in);
         System.out.print("Enter student's names: ");
        String name = input.nextLine();
        System.out.println("Student's Name: " + name);

        System.out.print("Enter the number of students you want to record their marks: ");
        int marksRange = input.nextInt();
        float[] marks = new float[marksRange];

        float total = 0;

        for(int i = 0; i < marksRange; i++){
            System.out.print("Enter the marks of student " + (i + 1) + ": ");
            marks[i] = input.nextFloat();
            total += marks[i];
        }

        // Display the recorded marks
        System.out.println("\nRecorded Marks:");

        System.out.println("Marks of: | " + name + "|");
        System.out.print("Marks:    |");
        for (int i = 0; i < marksRange; i++) {
            System.out.print(marks[i]+" |");
        }
            System.out.print("Total=>   |" + total + "|");
        
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
    }
}
