package MethodOverloading;
public class Main {
    public static void main(String[] args){
        A a = new A();
        a.send();
        a.send("Ashiq");
        a.send("Ashiq", "Ashiq 2");
    }
}
