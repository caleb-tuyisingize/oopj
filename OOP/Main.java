class Student{
    // Attributes
    String name;
    int age;

    // Method to display information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public String toString(){
        return "Name: " + name + ", Age: " + age;
    
    }
}
    // Main method to test the class
public class Main {
        public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Alice";
        student1.age = 20;
        student1.displayInfo();  
        System.out.println(student1);
        }    
}