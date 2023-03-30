public class Rectangle {
    int width;
    int height;

    // Constructor with no parameters
    public Rectangle() {
        width = 0;
        height = 0;
    }

    // Constructor with one parameter
    public Rectangle(int side) {
        width = side;
        height = side;
    }

    // Constructor with two parameters
    public Rectangle(int width_, int height_) {
        width = width_;
        height = height_;
    }

    public int getArea() {
        return width * height;
    }
}
