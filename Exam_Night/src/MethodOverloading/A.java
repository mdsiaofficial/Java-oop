package MethodOverloading;
public class A {
    void send(){
        System.out.println("Hi");
    }
    void send(String x){
        System.out.println("Hi "+ x);
    }
    void send(String x,String y){
        System.out.println("Hi "+ x + y);
    }
}
