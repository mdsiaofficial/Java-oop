public class B_ extends A_ {
    public int x = 20; // Declare instance variable x in class B

    public void display() {
        System.out.println("Static variable x from class A: " + A.x); // Access static variable x from class A
        System.out.println("Instance variable x from class B: " + this.x); // Access instance variable x from class B
    }
}