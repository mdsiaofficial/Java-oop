package learnjava;
public class Teacher {
    String name, gender;
    int phone;
    void display_info(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
    }
    void info_display(String n, String g, int p){
        System.out.println("Name: "+ n);
        System.out.println("Gender: "+ g);
        System.out.println("Phone: "+ p);
    }
} 
