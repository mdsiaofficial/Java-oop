
package overloading_constructor;

public class Teacher_Info {
    String name, gender;
    int phone;
    Teacher_Info(){
        System.out.println("NO Info");
    }
    Teacher_Info(String n,String g){
        name=n;
        gender=g;
    }
    Teacher_Info(String n,String g, int p){
        name=n;
        gender=g;
        phone=p;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Gender: "+ gender);
        System.out.println("Phone: "+ phone);
        
    }
}
