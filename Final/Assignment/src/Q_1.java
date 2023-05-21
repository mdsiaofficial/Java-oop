class MyException extends Exception {
    public MyException(String s)
    {
        super(s);
    }
}
class Program {
    void calc(int d) throws MyException{
        if(d==0){
            throw new MyException("Error: You cannot divide by zero.\n"
                    + "You cannot divide by zero.");
        }
    }
}
public class Q_1 {
    // Driver Program
    public static void main(String args[])
    {
        try {
            // Throw an object of user defined exception
            throw new MyException("Error: Division by zero is not allowed.\n"
                    + "You cannot divide by zero.");
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}