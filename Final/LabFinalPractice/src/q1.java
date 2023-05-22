class Jew extends Exception {
    public Jew(String s){
        super(s);
    }
}
public class q1 {
    public static void main(String[] args) {
        int d =123;
        int divs = 0;
        try{
            if (divs == 0){
                throw new Jew("Divided By Zero is not Allowed.");
            }
            System.out.println(d/divs);
        }catch(Jew j){
            //j.printStackTrace();
            //System.out.println(j);
            System.out.println(j.getMessage());
        }
    }
}
