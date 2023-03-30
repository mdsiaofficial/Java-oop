package four;

class B extends A {
    public int x = 20;

    public void display() {
      System.out.println("Static variable x in class a: " + A.x);
      System.out.println("Instance variable x in class b: " + this.x);
    }
    
    public class Main {
        
    }
}


