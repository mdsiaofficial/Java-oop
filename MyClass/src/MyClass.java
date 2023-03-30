class MyClass {
    public int calculateAge(int birthYear) {
        int currentYear = java.time.Year.now().getValue();
        return currentYear - birthYear;
    }

    private boolean isDivisibleBy5(int number) {
        return number % 5 == 0;
    }

    protected void displayWelcomeMessage() {
        System.out.println("Welcome!");
    }

    void myMethod() {
        System.out.println("This is my method.");
    }
}

