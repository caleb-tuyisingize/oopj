import java.util.Scanner;

public class GradeIn{
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   /* 
	    The assignment operator 
	     (=) is used to assign a value to a variable.

	   */
	   
	   // SYNTAX variable = value;
	   
	 /*
	      int x = 10;   // assigns 10 to variable x
		  int y = x;    // assigns value of x (10) to y
		  y = y + 5;    // assigns (10 + 5 = 15) to y

		  System.out.println(y);
		  System.out.println(x);
//		  System.out.println(y);
		 */
	    
	
	   /*
	   💡 Logic:
		   First, the right-hand side is calculated.

		   Then, the result is stored in the left-hand side variable.
		*/
	   
	   //2. Comparison/Relational Operators in Java
	   /*
	   👉 These operators are used to compare two values.
	   They always give a boolean result (true or false).
	   */
	   /*
	   | Operator | Meaning                  | Example  | Result |
	   | -------- | ------------------------ | -------- | ------ |
	   | `==`     | equal to                 | `5 == 5` | true   |
	   | `!=`     | not equal to             | `5 != 3` | true   |
	   | `>`      | greater than             | `10 > 5` | true   |
	   | `<`      | less than                | `4 < 9`  | true   |
	   | `>=`     | greater than or equal to | `7 >= 7` | true   |
	   | `<=`     | less than or equal to    | `6 <= 3` | false  |
	   */
	   
	   
//	    int a = 10;
//        int b = 2;
//        int y = 5;
//        int z= b + --y * 2 - y++;
//        int test = 5;
//        System.out.println(--test);
//        System.out.println(z);
//        System.out.printf("Floated divide: %.2f \n",((float)a/(float)b));  // false (10 is not equal to 20)
//        System.out.println(a != b);  // true  (10 is not equal to 20)
        // System.out.println("Enter the marks here: ");
        // int marks = sc.nextInt();
        // if(marks >= 80 && marks <=100) {
        // 	System.out.println("Grade A");
        // }
        // else if(marks >= 60 && marks < 80) {
        // 	System.out.println("Grade B");
        // }
        // else if(marks >= 40 && marks < 60) {
        // 	System.out.println("Grade C");
        // }
        // else if(marks >= 0 && marks < 40) {
        // 	System.out.println("Grade F");
        // }
        // else {
        // 	System.out.println("Invalid Marks");
        // }

        // CHECKING ODD AND EVEN NUMBERS

        //   if(marks > 0){
        //     if(marks % 2 == 0){
        //         System.out.println("Even Number");
        //     } else {
        //         System.out.println("Odd Number");
        //     }   
        //   }else{
        //     System.out.println("Invalid Number");
        //   }

        // BY USING SWITCH CASE
        // switch(marks){
        //     case 80,81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:
        //         System.out.println("Grade A");
        //         break;
        //     case 60,61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79:
        //         System.out.println("Grade B");
        //         break;
        //     case 40,41,42,43,44,45,46,47,48,49,50,51,52,53,54,55,56,57,58:
        //         System.out.println("Grade C");
        //         break;
        //     case 0,1,2,3,4,5,6,7,8,9,
        //          10 ,11 ,12 ,13 ,14 ,15 ,16 ,17 ,18 ,19,
        //          20 ,21 ,22 ,23 ,24 ,25 ,26 ,27 ,28 ,29,
        //          30 ,31 ,32 ,33 ,34 ,35 ,36 ,37 ,38 ,39:
        //         System.out.println("Grade F");
        //         break;
        //     default:
        //         System.out.println("Invalid Marks");
        // } 


        // USING SWITCH CASE BY SAYING THE DAY'S NAMES
        System.out.println("Enter the day number (1-7): ");
        int day = sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number! Please enter a number between 1 and 7.");
        }
     
   }
}
