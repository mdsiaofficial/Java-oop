public class A {
    public static int x = 10; // Declare static variable x in class A
}

public class B extends A {
    public int x = 20; // Declare instance variable x in class B

    public void display() {
        System.out.println("Static variable x from class A: " + A.x); // Access static variable x from class A
        System.out.println("Instance variable x from class B: " + this.x); // Access instance variable x from class B
    }
}

public class Main {
    public static void main(String[] args) {
        B b = new B(); // Create an instance of class B
        b.display(); // Call display() method to print both variables
    }
}