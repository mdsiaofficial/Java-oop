// MultipleExceptionHandling
public class Q1 {
    public static void main(String[] args) {
        try {
            // Code that may throw an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
        
        try {
            // Code that may throw a NullPointerException
            String str = null;
            System.out.println("Length of the string: " + str.length()); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        }
        
        try {
            // Code that may throw an ArrayIndexOutOfBoundsException
            int[] arr = {1, 2, 3};
            System.out.println("Element at index 5: " + arr[5]); // This line will not be executed
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred: " + e.getMessage());
        }
    }
}
