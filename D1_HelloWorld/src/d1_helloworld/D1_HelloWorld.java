/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package d1_helloworld;

/**
 *
 * @author rvdas
 */

public class D1_HelloWorld {
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
        D1_HelloWorld ghum = new D1_HelloWorld();
        System.out.println(ghum.time);
        System.out.println("Hello World");
        hello();
        int a=4565,b=34,c=33;
        int sum=a+b+c;
        int sub=a-b-c;
        int mul=a*b*c;
        int div=a/b/c;
        System.out.println("Sum: "+ sum);
        System.out.println("Sub: "+ sub);
        System.out.println("Mul: "+ mul);
        System.out.println("Div: "+ div);
    }
}
