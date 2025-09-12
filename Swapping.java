class Swapping{
    public static void main(String arg[]){
        // TYPE CASTING
        float a = 10;
        int b = (int) a;
        System.out.println(b);//10  BECAUSE THERE IS NO DECIMAL VALUE ON THAT FLOAR VARIABLE

        // CONVERTING
        // from integer to binary string

        int number = 41;
        String binary = Integer.toBinaryString(number);
        System.out.println("In then intergrate integers: "+number);
        System.out.println("In binaries: "+binary);

        // from float to bits

        float var = 10.5;
        int inBits = Float.floatToInBits(var);

        
        System.out.println("In Float: "+var);
        System.out.println("In Bits: "+inBits);

    }
}