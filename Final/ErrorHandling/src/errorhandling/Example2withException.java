
package errorhandling;

public class Example2withException {
    public static void main(String args[]) {
        try{
            int a = 1;
            int c[] = {1,2};
            int b = 4 / a;
            c[3] = 99;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}