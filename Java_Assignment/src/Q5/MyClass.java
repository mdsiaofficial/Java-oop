package Q5;
public class MyClass {

    public int calculateAge(int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    protected boolean isDivisibleBy5(int number) {
        return (number % 5 == 0);
    }

    // private void displayWelcomeMessage(String name) {
    //     System.out.println("Welcome, " + name + "!");
    // }

    void myMethod() {
        System.out.println("Demo Message.");
    }
}
