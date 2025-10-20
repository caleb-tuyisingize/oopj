class Calc{
    static {
        System.err.println("Some thing is going on");
    }
    float num1;
    float num2;

    float add(){
        float sum = num1 + num2;
        System.out.print("Sum of number one "+num1+" and Number two "+num2+" is ");
        return sum;
    }
    float division(){
        float sum = num1 / num2;
        System.out.print("Division of number one "+num1+" and Number two "+num2+" is ");
        return sum;
    }
    float subs(){
        float sum = num1 * num2;
        System.out.print("Substraction of number one "+num1+" and Number two "+num2+" is ");
        return sum;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Calc calc1 = new Calc();
        calc1.num1 = 10.5f;
        calc1.num2 = 5.5f;
        System.out.println(calc1.add());
        System.out.println(calc1.division());
        System.out.println(calc1.subs());
    }
}