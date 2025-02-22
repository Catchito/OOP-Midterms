class Rectangle {
    int width;
    int height;

    public Rectangle(int RectangleWidth, int RectangleHeight) {
        width = RectangleWidth;
        height = RectangleHeight;
    }

    public int getArea() {
        return width * height;
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }
}

public class Rectangulator {
    public static void main(String[] args) {
        Rectangle MyRectangle = new Rectangle(10, 5);
        System.out.println("Rectangle's area: " + MyRectangle.getArea());
        System.out.println("Rectangle's perimeter: " + MyRectangle.getPerimeter());
    }
}
