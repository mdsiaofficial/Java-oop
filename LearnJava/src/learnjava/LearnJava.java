package learnjava;
public class LearnJava {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name= "Ashiq Sir";
        t.gender = "Male";
        t.phone = 1885981241;
        t.display_info();
        t.info_display("Ashiq","Male",188);
        t.info_display(t.name,t.gender,t.phone);
    }
}
