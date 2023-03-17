package d2_methods;
public class D2_Methods {
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
    }
}