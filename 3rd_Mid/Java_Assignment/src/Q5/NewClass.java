package Q5;
public class NewClass {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        // Accessing methods with different visibility modifiers
        System.out.println(myObj.calculateAge(1990)); // Prints: 33 (assuming the current year is 2023)
        System.out.println(myObj.isDivisibleBy5(10)); // Compilation error: isDivisibleBy5(int) has private access in MyClass
        // myObj.displayWelcomeMessage("Ashiq"); // Prints: Welcome!
        myObj.myMethod(); // Prints: This is my method.
    }
}
