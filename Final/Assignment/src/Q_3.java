// NestedTryCatchExample
public class Q2 {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            int result = numbers[4]; // Trying to access an invalid index
            System.out.println("Result: " + result);
            try {
                // Inner try block
                int dividend = 10;
                int divisor = 0;
                int quotient = dividend / divisor; // Attempting to divide by zero
                System.out.println("Quotient: " + quotient);
            } catch (ArithmeticException e) {
                // Inner catch block
                System.out.println("Error: Division by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Outer catch block
            System.out.println("Error: Invalid array index");
        }
    }
}
