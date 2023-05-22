// NestedTryCatchExample
public class Q_3 {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Try 1");
            int[] numbers = {1, 2, 3};
            int result = numbers[2]; // Trying to access an invalid index
            System.out.println("Result: " + result);
            try {
                // Inner try block
                System.out.println("Try 3");
                int dividend = 10;
                int divisor = 1;
                int quotient = dividend / divisor; // Attempting to divide by zero
                System.out.println("Quotient: " + quotient);
                try{
                    System.out.println("Try 3");
                    int b=23/1;
                }catch(ArithmeticException e){
                    System.out.println(e);
                }
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
