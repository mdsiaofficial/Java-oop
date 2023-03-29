/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_constructor;

/**
 *
 * @author rvdas
 */
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
