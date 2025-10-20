

public class Maxmum{
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        //  System.out.print("Enter the number of element you are looing for: ");
        int[] numbers = {45, 78, 12, 67, 89, 23};
        int max = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }


    }
}