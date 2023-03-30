class A {
    static int x = 10;
}
class B extends A {
    int x = 20;

    void display() {
        System.out.println("Value of x in class A: " + A.x);
        System.out.println("Value of x in class B: " + x);
    }
}
public class NewClass {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}

