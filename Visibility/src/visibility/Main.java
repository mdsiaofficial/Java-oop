package visibility;

public class Main {
    public static void main(String[] args) {
        MyClass myObj = new MyClass();

        // Accessing members with different visibility modifiers
        System.out.println(myObj.publicVar); // Prints: 1
        // System.out.println(myObj.privateVar); // Compilation error: privateVar has private access in MyClass
        System.out.println(myObj.protectedVar); // Prints: 3
        System.out.println(myObj.defaultVar); // Prints: 4

        myObj.publicMethod(); // Prints: Public method
        // myObj.privateMethod(); // Compilation error: privateMethod() has private access in MyClass
        myObj.protectedMethod(); // Prints: Protected method
        myObj.defaultMethod(); // Prints: Default method
    }
}