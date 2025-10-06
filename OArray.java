
public class OArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Mango", "Orange"};

        // Print original array
        System.out.println("Original Array:");
        for (String num : fruits) {
            System.out.println(num + " ");
        }
        System.out.println();


        // Modify an element
        fruits[1] = "Banana";               

        // Print array in reverse order
        // System.out.println("Array in Reverse Order:");
        // for (int i = arr.length - 1; i >= 0; i--) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}