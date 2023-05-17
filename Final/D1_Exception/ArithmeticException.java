public class ArithmeticException {
    public static void main(String[] args) {
        
        int x=20;
        int y=0;
        try{
            try{
                System.out.println("Going to divide.");
                int b = x/y;
            }catch(ArithmeticException e){
                System.out.println(e);
            }
        }catch(Exception n){
            System.out.println(n);
        }
    }
}
