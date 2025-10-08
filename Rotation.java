public class Rotation{
    public static void main(String[] args){
        System.out.println("BEFORE LEFT LOTATION");
        int[] arr = {2, 5, 7, 3, 201, 45, 82, 109};
    for(int x: arr){
        System.out.printf("%3d \t",x);

    }
    for(int rotator : arr){

    
    int leftTemp = arr[0];
    for(int i = 1; i < arr.length; i++){
        arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = leftTemp;
    System.out.println("\nAFTER LEFT LOTATION "+rotator+" TIME");

    for(int x: arr){
        System.out.printf("%3d \t",x);  

    }
    }
    }
}