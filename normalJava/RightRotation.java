public class RightRotation{
    public static void main(String[] args){
        System.out.println("BEFORE RIGHT LOTATION");
        int[] arr = {2, 5, 7, 3, 201, 45, 82, 109};
    for(int x: arr){
        System.out.printf("%3d \t",x);

    }
    for(int rotator : arr){

    
    int RightTemp = arr[arr.length-1];
    for(int i = arr.length-1; i > 0; i--){
         arr[i]= arr[i - 1];
    }
    arr[0] = RightTemp;
    System.out.println("\nAFTER RIGHT LOTATION "+rotator+" TIME");

    for(int x: arr){
        System.out.printf("%3d \t",x);  

    }
    }
    }
}