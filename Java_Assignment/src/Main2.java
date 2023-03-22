public class ExampleClass {

    public int determineAge(int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    protected boolean isDivisibleByFive(int number) {
        return (number % 5 == 0);
    }

    private void displayWelcomeMessage(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    void doSomething() {
        // your code here
    }
}
