class A {
    static int x = 10;
}

class B extends A {
    int x = 20;

    void display() {
        System.out.println("Value of x in class A: " + super.x);
        System.out.println("Value of x in class B: " + x);
    }
}

public class A {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}
