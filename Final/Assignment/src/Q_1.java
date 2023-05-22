class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
public class Q_1 {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("Error: Divide by Zero is not allowed.\n"
                    + "You cannot divide by zero.");
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}