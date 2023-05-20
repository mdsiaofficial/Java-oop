class DivideByZeroException extends Exception {
    public DivideByZeroException(String message) {
        super(message);
    }
}
class NewClass {
    public static double divide(double dividend, double divisor) throws DivideByZeroException {
        if (divisor == 0) {
            throw new DivideByZeroException("Error: Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}
public class Q1 {
    public static void main(String[] args) {
        try {
            double result = NewClass.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
