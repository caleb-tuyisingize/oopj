public class IncrementingThree {
    public static void main(String[] args) {
        int counter = 0;
        for (int number = 1; number <= 5; number++){
           for(int num = 1; num <= 5; num++){
            counter +=1;
            System.out.printf("%2d ",counter);
        
           }
            System.out.println(" ");
           
        }
    }
}