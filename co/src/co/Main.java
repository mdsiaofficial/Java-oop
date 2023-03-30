public class Main {
    public static void main(String[] args) {
        // Create a rectangle using the constructor with no parameters
        Rectangle r1 = new Rectangle();
        System.out.println(r1.getArea()); // Prints: 0

        // Create a square using the constructor with one parameter
        Rectangle r2 = new Rectangle(5);
        System.out.println(r2.getArea()); // Prints: 25

        // Create a rectangle using the constructor with two parameters
        Rectangle r3 = new Rectangle(4, 6);
        System.out.println(r3.getArea()); // Prints: 24
    }
}