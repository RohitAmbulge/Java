import java.util.Scanner;

class Rectangle {
    static public int Area(int length, int breadth) {
        return length * breadth;
    }

    static public int perimeter(int length, int breadth) {
        return 2 * (length + breadth);
    }

}

public class RectangleStatic {
    public static void main(String[] args) {
        System.out.println("Area of Rectangle is:" + Area(2, 3));
        System.out.println("perimeter of Rectangle is:" + Perimeter(2, 3));
    }

}

public class RectangleStatic {

}
