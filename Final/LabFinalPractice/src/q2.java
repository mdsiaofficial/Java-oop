public class q2 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try{
            int c=a/b;
        }catch(Exception e){
            System.out.println(e);
        }
        int array[] = {3,5,7,2,7};
        try{
            array[9] = 14;
        }catch(Exception e){
            System.out.println(e);
        }
        String s = null;
        try {
            int l = s.length(); // Null pointer exception
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
