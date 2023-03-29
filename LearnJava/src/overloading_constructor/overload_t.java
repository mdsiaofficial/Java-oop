package overloading_constructor;

public class overload_t {
    public static void main(String[] args){
        Teacher_Info t1= new Teacher_Info();
        Teacher_Info t2= new Teacher_Info("Ashiq","Male");
        Teacher_Info t3= new Teacher_Info("Tiger","Male",18);
        
        t1.display();
        t2.display();
        t3.display();
        
    }
}
