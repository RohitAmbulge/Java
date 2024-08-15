import java.util.Scanner;

class Square {
    private int base;

    public Square(int base) {
        this.base = base;
    }

    public void Area() {
        System.out.println("Area of square is:" + base * base);
    }

}

class Triangle extends Square {

    private int height;

    public Triangle(int base, int height) {
        super(base);
        this.height = height;

    }

    public void Area() {
        System.out.println(base * height);
    }

}

public class sqTri {
    public static void main(String[] args)

}
