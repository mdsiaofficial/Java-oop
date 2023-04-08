package Abstraction;
public class Test {
    public static void main(String[] args){
        Message m;
        m = new A();
        m.send();
        m = new B();
        m.send();
    }
}
