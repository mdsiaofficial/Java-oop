/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d2_methods;

/**
 *
 * @author rvdas
 */
public class D2_Methods {

    /**
     * @param args the command line arguments
     */
    static void hello(){
        System.out.println("Hello world!");
    }
    static void hello(int a){
        System.out.println("Hello world! " + a);
    }
    static void hello(double b){
        System.out.println("Hello world! " + b);
    }
    static void hello(String name){
        System.out.println("Hello " + name);
    }
    int time=10;
    public static void main(String[] args) {
        hello("ashiq");
        D2_Methods ghum = new D2_Methods();
        System.out.println(ghum.time);
        System.out.println("Hello World");
        hello();
        // TODO code application logic here
    }
    
}
