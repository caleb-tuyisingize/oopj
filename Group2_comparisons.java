public class Group2_comparisons {
   public static void main(String[] args) {
	   /* 
	    The assignment operator 
	     (=) is used to assign a value to a variable.

	   */
	   
	   // SYNTAX variable = value;
	   
	 
	      int x = 10;   // assigns 10 to variable x
		  int y = x;    // assigns value of x (10) to y
		  y = y + 5;    // assigns (10 + 5 = 15) to y

		  System.out.println(y);
		  System.out.println(x);
//		  System.out.println(y);
		 
	    
	
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
	   
	   
	    int a = 10;
        int b = 20;

        System.out.println(a == b);  // false (10 is not equal to 20)
        System.out.println(a != b);  // true  (10 is not equal to 20)
        System.out.println(a > b);   // false (10 is not greater than 20)
        System.out.println(a < b);   // true  (10 is less than 20)
        System.out.println(a >= 10); // true  (10 is equal to 10)
        System.out.println(b <= 20); // true  (20 is equal to 20)
	    

	   /*
	    💡 Logic behind it:

			a == b checks if values are the same.

			a != b checks if values are different.

			a > b checks if a is bigger than b, etc.
	    */
   }
}
