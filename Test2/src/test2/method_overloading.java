package test2;
public class method_overloading {
    
    public static void Address(String Area,String Municiple, String District){
        System.out.println(Area);
        System.out.println(Municiple);
        System.out.println(District);
    }
    public static void Address(){
        System.out.println("Radio Colony");
        System.out.println("Savar");
        System.out.println("Dhaka");
    }
    
    public static void main(String[] args) {
        Method_parameter m = new Method_parameter();
        Test2 t = new Test2();
        m.Address("Bou", "Savar", "Dhaka");
        t.Address();
    }
}
