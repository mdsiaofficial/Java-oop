/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rvdas
 */
public class Student {
    public static void main(String[] args){
        Test t1 = new Test();
        t1.totalStudent();
    }
}
public class Test{
    static int count=0;
    Test(){
        count++;
    }
    void totalStudent(){
        System.out.println(count);
    }
}




