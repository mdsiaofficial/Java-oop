class A {
    public static int x = 10;
}

class B extends A {
    public int x = 20;
    
    public void display() {
        System.out.println("Class A's static variable x: " + A.x);
        System.out.println("Class B's instance variable x: " + x);
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
