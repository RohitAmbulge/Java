import java.util.Scanner;

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        length = 1;
        breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public Rectangle(int a) {
        length = breadth = a;
    }

    public int Area() {
        return length * breadth;
    }

    public int perimeter() {
        return 2 * (length + breadth);
    }

}

public class Constructor {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3, 5);
        Rectangle r1 = new Rectangle(2, 5);

        System.out.println("Area is:" + r.Area());
        System.out.println("Perimeter is:" + r.perimeter());

        System.out.println("Area is:" + r1.Area());
        System.out.println("Perimeter is:" + r1.perimeter());
    }

}
