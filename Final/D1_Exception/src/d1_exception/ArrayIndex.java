package d1_exception;

public class ArrayIndex {

    public static void main(String[] args) {
        try{
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
