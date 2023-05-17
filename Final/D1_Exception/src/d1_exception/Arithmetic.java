package d1_exception;

public class Arithmetic {

    public static void main(String[] args) {
        int x=20;
        int y=0;
        try{
            try{
                System.out.println("Going to divide");
                int z=x/y;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
            
            try{
                int a[]={3,4,5};
                int b[]=new int[5];
                a[8]=6;
                b[9]=34;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            
        }catch(Exception n){
            System.out.println(n);
        }
    }
    
}
