public class A {
    public static int x = 10; 
    // Declare static variable x in class A_
}
public class B extends A {
    // Declare instance variable x in class B
    public int x = 20; 
    
    public void display() {
        System.out.println("Static variable x from class A: " + A.x); 
        // Access static variable x from class A
        System.out.println("Instance variable x from class B: " + this.x); 
        // Access instance variable x from class B
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.display();
    }
}