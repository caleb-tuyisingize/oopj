
class Car {

    private String color;
    String year;
    String model;

    void engineStart() {
        System.out.println("The Engine has started");
    }


    void engineStop() {
        System.out.println("The Engine has stopped");
    }
    void displayCarInfo(){
        System.out.println("Car Model: " + model);
        System.out.println("Car Color: " + color);
        System.out.println("Car Year: " + year+"\n");
    }
    // void displayCarInfo(){
    //     System.out.println("I have a Car which is " + model +" with a Color of " + color+" and it is innitiated in Year of " + year+"\n");
    // }
    void setColor(String carColor){
        color = carColor;
    }
    public String getColor(){
      return color;
    }
    
}

public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        // Car one created
        car1.setColor("Red");
        car1.year = "2020";
        car1.model = "Toyota";

        // Car two created
        car2.year = "2025";
        car2.model = "Dodge";
        car2.setColor("Black");

       System.out.println(car2.getColor());

        car1.engineStart();
        car2.engineStart();

        car1.engineStop();
        car2.engineStop();

        car1.displayCarInfo();
        car2.displayCarInfo();
    }
}
