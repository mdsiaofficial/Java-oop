/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package static_keyword;

/**
 *
 * @author rvdas
 */
public class Static_keyword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Student s1 = new Student("Ashiq", 101);
        Student s2 = new Student("Tiger", 102);
        s1.display();
        s2.display();
        System.out.println(Student.university+"+XXX");
        Student.university=Student.university+", Bangladesh";
        System.out.println(Student.university);
        
    }
    
}
