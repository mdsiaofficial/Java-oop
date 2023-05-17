
package errorhandling;


public class Example1withException {
    public static void main(String args[]) {
        int a = 0;
        try {
            int b = 4 / a;
            System.out.println("b:" + b);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
