/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package static_keyword;

/**
 *
 * @author rvdas
 */
public class Student {
    String name;
    int id;
    static String university="City University";
    
    Student(String n, int i){
        name=n;
        id=i;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("ID: "+ id);
        System.out.println("University: "+ university);
    }
}
